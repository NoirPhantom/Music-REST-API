package com.project.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/api")
public class TrackController {
    @Autowired
    TrackService musicService;

    @PostMapping("/music/track")
    public Track createTrack(@RequestBody Track track) {
        return musicService.createTrack(track);
    }

    @GetMapping("/music/tracks")
    public List<Track> readTracks() {
        return musicService.getTrack();
    }

    @GetMapping("/music/track/{trackId}")
    public List<Track> readTrack() {
        return musicService.getTrack();
    }

    @PutMapping("/music/track/{trackId}")
    public Track updateTrack(@PathVariable(value = "trackId") Long id, @RequestBody Track trackDetails) {
        return musicService.updateTrack(id, trackDetails);
    }

    @DeleteMapping("/music/track/{trackId}")
    public void deleteTrack(@PathVariable(value = "trackId") Long id) {
        musicService.deleteTrack(id);
    }
}
