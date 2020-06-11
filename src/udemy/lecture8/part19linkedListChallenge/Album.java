package udemy.lecture8.part19linkedListChallenge;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;

    public Album() {
        this.songs = new ArrayList<>();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    // add new song to the album
    public void addSong(String title, String duration) {
        songs.add(new Song(title, duration));
    }

    public Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
}
