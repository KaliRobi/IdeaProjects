package com.company;
// Create a program that implements a playlist for songs  x
// Create a Song class having Title and Duration for a song. x
// The program will have an Album class containing a list of songs. x
// The albums will be stored in an ArrayList x
// Songs from different albums can be added to the playlist and will appear in the list in the order they are added. +
// Once the songs have been added to the playlist, create a menu of options to:-


import java.util.ArrayList;
import java.util.LinkedList;

// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
public class Main {

    public static void main(String[] args) {

        Album album1 = new Album("album12");
        Song song1 = new Song("song1", 2);
        Song song2 = new Song("song2", 2);
        Song song3 = new Song("song3", 2);
        Song song4 = new Song("song4", 2);
        Song song5 = new Song("song5", 2);
        Song song6 = new Song("song6", 2);
        Song song7 = new Song("song7", 2);
        Song song12 = new Song("song12", 2);
        album1.addSong(song1);
        album1.addSong(song2);
        album1.addSong(song3);
        album1.addSong(song4);

        Album album12 = new Album("album1");
        album12.addSong(song5);
        album12.addSong(song6);
        album12.addSong(song7);

        Playlist pl = new Playlist();
        pl.addAlbum(album1);
        pl.addAlbum(album12);
        pl.addSongToPlayList(song1);
        pl.addSongToPlayList(song2);
        pl.addSongToPlayList(song6);
        pl.addSongToPlayList(song3);
        pl.addSongToPlayList(song12);
        pl.addSongToPlayList(song7);
        pl.showPlaylist();
        pl.musicPlayer();





    }
}
