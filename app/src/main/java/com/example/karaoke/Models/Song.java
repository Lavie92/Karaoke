package com.example.karaoke.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
    private String id;
    private String name;
    private String Description;
    private String Author;

    public Song() {
    }

    public Song(String id, String name, String description, String author) {
        this.id = id;
        this.name = name;
        Description = description;
        Author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public static List<Song> getSongList() {
        List<Song> songList = new ArrayList<>();
        Song defaultSong1 = new Song("142032", "Điều Anh Biết", "Anh không biết bao nhiêu sao trên trời" +
                " Anh không biết cuộc đời mai ra sao" +
                " Dù gian lao, dù ra sao thì" +
                " Anh vẫn luôn có, có một người luôn bên cạnh anh mãi thôi", "Chi Dân");
        Song defaultSong2 = new Song("155215", "Âm Thầm Bên Em", "Khi bên anh em thấy điều chi?" +
                " Khi bên anh em thấy điều gì?" +
                " Nước mắt rơi gần kề làn mi" +
                " Chẳng còn những giây phút" +
                " Chẳng còn những ân tình" +
                " Gió mang em rời xa nơi đây", "Sơn Tùng MTP");
        songList.add(defaultSong1);
        songList.add(defaultSong2);
        return songList;
    }
    public List<Song> addSong(Song song) {
        List<Song> songList = new ArrayList<>();
        songList.add(song);
        return  songList;
    }
}
