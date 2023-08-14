package OOP.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String titleOfSong, double duringOfSong){

        Song title = findSong(titleOfSong);
        if(title == null){
            this.songs.add(new Song(titleOfSong, duringOfSong));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){

        int index = trackNumber - 1;
        if(index >= 0 && index < this.songs.size()){
            Song song = this.songs.get(index);
            playlist.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){

        Song song = findSong(title);
        if(song == null){
            return false;
        }
        playlist.add(song);
        return true;
    }

    private Song findSong(String titleOfSong){

        for(Song song : this.songs){
            if(song.getTitle().equals(titleOfSong)){
                return song;
            }
        }
        return null;
    }
}
