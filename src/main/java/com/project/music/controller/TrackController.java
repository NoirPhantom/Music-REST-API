package com.project.music.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.music.model.Track;
import com.project.music.service.TrackService;

@RestController
@RequestMapping("/music")
public class TrackController {
    @Autowired
    TrackService trackService;

    @PostMapping("/track")
    public Track createTrack(@RequestBody Track track) {
        return trackService.createTrack(track);
    }

    @GetMapping("/tracks")
    public List<Track> readTracks() {
        return trackService.getTrack();
    }

    @GetMapping("/track/{trackId}")
    public Optional<Track> getTrack(Long trackId) {
        return trackService.getTrack(trackId);
    }

    @PutMapping("/track/{trackId}")
    public Track updateTrack(@PathVariable(value = "trackId") Long id, @RequestBody Track trackDetails) {
        return trackService.updateTrack(id, trackDetails);
    }

    @PatchMapping("/track/{trackId}")
    public Track replaceTrack(@PathVariable(value = "trackId") Long id,
            @PathVariable(value = "newSongName") String songName) {
        return trackService.updateTrackTitle(id, songName);
    }

    @DeleteMapping("/track/{trackId}")
    public void deleteTrack(@PathVariable(value = "trackId") Long id) {
        trackService.deleteTrack(id);
    }
}
