package com.company;

// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Album {
    private SongList songs;
    private String name;

    public Album(String name) {
        this.name = name;
        this.songs = new SongList();
    }

//    public void addSong(Song song){
//        if(listOfSongs.contains(song)){
//            System.out.println("this song is already added to the album");
//        } else {
//            listOfSongs.add(song);
//        }
//    }
    public void addSong(Song song){
        songs.addSong(song);
    }

    public Song findSong(Song song) {
        return songs.findDong(song);
    }

//    public void removeSong(Song song){
//        if(songs.getSongs().contains(song)){
//            songs.remove(song);
//            System.out.println(song + " was removed from the album  " + listOfSongs);
//        } else {
//            System.out.println("no record found");
//        }
//    }
//
//    public List<Song> getSongs() {
//        return songs.getSongs();
//    }
//
//    public Song getTheSong(int index){
//        Song song  = listOfSongs.get(index);
//        if(song.toString() != "-1"){
//            return song;
//        } else {
//            System.out.println("no song");
//            return null;
//        }



//    }
    public int getLength(){
        return songs.getSongs().size();
    }



    public int size() {
        return songs.getSongs().size();
    }

    public boolean isEmpty() {
        return songs.getSongs().isEmpty();
    }

    public boolean contains(Object o) {
        return songs.getSongs().contains(o);
    }

    public int indexOf(Object o) {
        return songs.getSongs().indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return songs.getSongs().lastIndexOf(o);
    }



    public Song get(int index) {
        return songs.getSongs().get(index);
    }

    public Song set(int index, Song element) {
        return songs.getSongs().set(index, element);
    }

    public boolean add(Song song) {
        return songs.getSongs().add(song);
    }

    public void add(int index, Song element) {
        songs.getSongs().add(index, element);
    }

    public Song remove(int index) {
        return songs.getSongs().remove(index);
    }

    public boolean remove(Object o) {
        return songs.getSongs().remove(o);
    }

    public void clear() {
        songs.getSongs().clear();
    }

    public boolean addAll(Collection<? extends Song> c) {
        return songs.getSongs().addAll(c);
    }

    public boolean addAll(int index, Collection<? extends Song> c) {
        return songs.getSongs().addAll(index, c);
    }

    public boolean removeAll(Collection<?> c) {
        return songs.getSongs().removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return songs.getSongs().retainAll(c);
    }

    public ListIterator<Song> listIterator(int index) {
        return songs.getSongs().listIterator(index);
    }

    public ListIterator<Song> listIterator() {
        return songs.getSongs().listIterator();
    }

    public Iterator<Song> iterator() {
        return songs.getSongs().iterator();
    }

    public List<Song> subList(int fromIndex, int toIndex) {
        return songs.getSongs().subList(fromIndex, toIndex);
    }

    public void forEach(Consumer<? super Song> action) {
        songs.getSongs().forEach(action);
    }

    public Spliterator<Song> spliterator() {
        return songs.getSongs().spliterator();
    }

    public boolean removeIf(Predicate<? super Song> filter) {
        return songs.getSongs().removeIf(filter);
    }

    public void replaceAll(UnaryOperator<Song> operator) {
        songs.getSongs().replaceAll(operator);
    }

    public void sort(Comparator<? super Song> c) {
        songs.getSongs().sort(c);
    }

    public boolean containsAll(Collection<?> c) {
        return songs.getSongs().containsAll(c);
    }


    public Stream<Song> stream() {
        return songs.getSongs().stream();
    }

    public Stream<Song> parallelStream() {
        return songs.getSongs().parallelStream();
    }

    private class SongList{
        private List<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        private List<Song> getSongs() {
            return songs;
        }

        public void addSong(Song song){
                getSongs().add(song);

        }
        public Song findDong(Song song){
            Song foundSong = getSongs().get(getSongs().indexOf(song));

            if(song == foundSong){
            return getSongs().get(getSongs().indexOf(song));
        } else {
            return  null;}
        }
    }


}
// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.






























