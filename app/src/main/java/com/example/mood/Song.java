package com.example.mood;

public class Song {

    private String songName,songUrl;//song store in songName and songUrl

    public Song() {
    }

    public Song(String songName, String songUrl) {
        this.songName = songName;
        this.songUrl = songUrl;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }
}