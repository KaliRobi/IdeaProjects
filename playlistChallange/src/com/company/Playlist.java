package com.company;
// Create a program that implements a playlist for songs  x
// Create a Song class having Title and Duration for a song. x
// The program will have an Album class containing a list of songs. x
// The albums will be stored in an ArrayList x
// Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

import java.sql.SQLOutput;
import java.util.*;

public class Playlist {
    private LinkedList<Song> playList;
    private ArrayList<Album> albumList;

    public Playlist() {
        this.playList = new LinkedList<Song>();
        this.albumList = new ArrayList<Album>();
    }
//    DocumentBu
//    public Song findSong(String title){
//        for(Song checkedSong: this.playList){
//            if(checkedSong.getTitle().equals(title)){
//                return checkedSong;
//            }
//        }

    public Album selectAlbum(String name){
        if(!playList.contains(name)){
            System.out.println(" no such album exists in the database");
            return null;
        } else {
           return albumList.get(albumList.indexOf(name));
        }
    }
    public void addAlbum(Album album){
        albumList.add(album);
    }
    public void addSongAlbum(String albumName, Song songName){
        Album album = selectAlbum((albumName));
        album.addSong(songName);
    }
    public Album selectAlbumWhenContains(Song song){
        for(int i = 0; i < albumList.size();  i++){

            Album currentAlbum = albumList.get(i);
                for(int k = 0; k< currentAlbum.size() ; k++){


                    Song foundSong = currentAlbum.get(k);

                    if(foundSong != null){
                        return albumList.get(i);
                    }
                    else {
                        return null;
                    }
                }
        } return null;

    }

    public void addSongToPlayList(Song songName){
        Album album = selectAlbumWhenContains(songName);
        System.out.println(album);
        if(album == null){
            System.out.println("you dont have this music");
        } else{
            playList.add(songName);
            System.out.println(songName.getTitle() + " is added to the playlist");
        }

    }
    public void showPlaylist(){
        ListIterator<Song> listIterator = playList.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next().getTitle());
        }

    }
//    public void printPlayList(){
//        ListIterator<Song> songListIterator = playList.listIterator();
//        System.out.println("Following songs are on the list");
//        if(songListIterator.hasNext()){
//            System.out.println(songListIterator.next());
//        }
//    }

    public void removeSongFromPlayList(Song song){
        if(!playList.contains(song)){
            System.out.println("song is not on the playlist");
        } else{
            playList.remove(song);
        }
    }
    public void playerMenu(){
        System.out.println("chose from the list");
        System.out.println(" 1 - move next; 2 - move back;  3 - play music; 4 - repeat music; 5 - quite to the main menu");
    }

    public void musicPlayer(){
        Scanner sca = new Scanner(System.in);
        boolean quitFromPlayingMusic = false;
        boolean nextTrack = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.isEmpty()){
            System.out.println("no song in the list");
        }
        while(!quitFromPlayingMusic){
            playerMenu();
            int usersChoice = sca.nextInt();
            sca.nextLine();
            switch (usersChoice){
                case 5:
                    System.out.println("back to the Main menu");
                    quitFromPlayingMusic = true;
                    break;
                case 1:
                    if(!nextTrack){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        nextTrack = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println(listIterator.next().getTitle());

                    } else {
                        System.out.println("no more song available");
                        nextTrack = false;
                    }

                    break;
                case 2:
                    if (nextTrack){
                        if (listIterator.hasPrevious()){
                            listIterator.previous().getTitle();
                        }
                        nextTrack = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println(listIterator.previous().getTitle());
                    } else {
                        System.out.println("no more song available");
                        nextTrack = true;
                    }

                    break;
                case 4:
                    if (listIterator.hasPrevious()){
                        System.out.println(listIterator.previous().getTitle());
                    } else {
                        System.out.println("no morse song available");
                    }

            }


        }



    }
}
