package com.brownie.accessibletoasterlibrary.models;

public class Song {

    private String songName, albumTitle;

    private int likesCount, viewCount, songImageResource;

    public Song(String songName, String albumTitle, int likesCount, int viewCount, int songImageResource) {
        this.songName = songName;
        this.albumTitle = albumTitle;
        this.likesCount = likesCount;
        this.viewCount = viewCount;
        this.songImageResource = songImageResource;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getSongImageResource() {
        return songImageResource;
    }

    public void setSongImageResource(int songImageResource) {
        this.songImageResource = songImageResource;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", albumTitle='" + albumTitle + '\'' +
                ", likesCount=" + likesCount +
                ", viewCount=" + viewCount +
                ", songImageResource=" + songImageResource +
                '}';
    }
}
