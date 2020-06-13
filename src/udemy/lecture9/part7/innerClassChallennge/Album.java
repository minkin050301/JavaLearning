package udemy.lecture9.part7.innerClassChallennge;

import java.util.ArrayList;

public class Album {
    //private ArrayList<Song> songs;

//    public Album() {
//        this.songs = new ArrayList<>();
//    }

    public ArrayList<Song> getSongs() {
        return SongList.getSongArrayList();
    }

    // add new song to the album
    public void addSong(String title, String duration) {
        SongList.addSongToSongList(new Song(title, duration));
    }

    public Song findSong(String title) {
        return SongList.findSongInSongList(title);
    }

    public static class SongList {
        private static ArrayList<Song> songArrayList = new ArrayList<>();

        public static ArrayList<Song> getSongArrayList() {
            return songArrayList;
        }

        public static void addSongToSongList(Song song) {
            songArrayList.add(song);
        }

        public static Song findSongInSongList(String title) {
            for (Song song : songArrayList) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }
    }
}
