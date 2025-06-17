package com.example.mycollections.models;

import ch.qos.logback.classic.joran.serializedModel.HardenedModelInputStream;

public class Music extends LibraryItem{
    private String artist;
    private int tracks;

    public Music(String name, String artist, int year, int tracks) {
        super(name, year);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }
    @Override
    public String toString() {
        return name + " by " + artist + " (" + year + ") - " + tracks + " tracks.";
    }
}
