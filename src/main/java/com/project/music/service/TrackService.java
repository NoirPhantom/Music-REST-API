package com.project.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.music.model.Track;
import com.project.music.repository.TrackRepository;

@Service
public class TrackService {

    @Autowired
    TrackRepository trackRepository;

    // CREATE
    public Track createTrack(Track track) {
        return trackRepository.save(track);
    }

    // READ by ID
    public Track getTrack(Long id) {
        return trackRepository.getById(id);
    }

    // READ
    public List<Track> getTrack() {
        return trackRepository.findAll();
    }

    // UPDATE
    public Track updateTrack(Long trackId, Track trackDetails) {
        Track track = trackRepository.findById(trackId).get();
        track.setSongName(trackDetails.getSongName());
        track.setGenreType(trackDetails.getGenreType());
        track.setArtistName(trackDetails.getArtistName());
        track.setSec(trackDetails.getSec());
        return trackRepository.save(track);
    }

    // DELETE
    public void deleteTrack(Long trackId) {
        trackRepository.deleteById(trackId);
    }
}