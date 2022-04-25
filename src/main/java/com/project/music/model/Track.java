package com.project.music.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tracks")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_id")
    private Long id;

    @Column(name = "song_name")
    private String songName;

    @Column(name = "genre_type")
    private String genreType;

    @Column(name = "artist_name")
    private String artistName;

    @Column(name = "duration_seconds")
    private Integer sec;

    public Track() {
    }

    public Track(Long id, String songName, String genreType, String artistName, Integer sec) {
        this.id = id;
        this.songName = songName;
        this.genreType = genreType;
        this.artistName = artistName;
        this.sec = sec;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getGenreType() {
        return genreType;
    }

    public void setGenreType(String genreType) {
        this.genreType = genreType;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Integer getSec() {
        return sec;
    }

    public void setSec(Integer sec) {
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Track [artistName=" + artistName + ", genreType=" + genreType + ", id=" + id + ", sec=" + sec
                + ", songName=" + songName + "]";
    }

}