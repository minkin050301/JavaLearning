package udemy.lecture9.part7.innerClassChallennge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums;
    private static LinkedList<Song> playlist;

    public static void main(String[] args) {
        albums = new ArrayList<>();
        Album album1 = new Album();
        album1.addSong("Never gonna give you up", "2:38");
        album1.addSong("Yesterday", "2:28");
        album1.addSong("Hey Jude", "3:22");

        Album album2 = new Album();
        album2.addSong("Енотик полоскун", "14:88");
        album2.addSong("Фашист мастурбирует оторванной рукой красного солдата", "14:88");

        albums.add(album1);
        albums.add(album2);

        playlist = new LinkedList<>();
        addSongToPlaylist("Yesterday");
        addSongToPlaylist("Hey Jude");
        addSongToPlaylist("Енотик полоскун");
        addSongToPlaylist("Jojo");
        addSongToPlaylist("Never gonna give you up");
        addSongToPlaylist("ssd");

        playSongs();
    }

    private static void playSongs() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> songListIterator = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("No songs to play");
        } else {
            System.out.println("Now playing " + songListIterator.next().getTitle());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            if (playlist.isEmpty()) {
                System.out.println("No songs to play");
                break;
            }
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        goingForward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now playing " + songListIterator.next().getTitle());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now playing " + songListIterator.previous().getTitle());
                    } else {
                        System.out.println("It's the first song in the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    // check the direction
                    if (goingForward) {
                        // check whether it's not the beginning of the playlist and then play the song previous to
                        // the pointer, thereafter return pointer to its original position
                        if (songListIterator.hasPrevious()) {
                            System.out.println("Now replaying " + songListIterator.previous().getTitle());
                            songListIterator.next();
                        } else {
                            // if it's the beginning, simply play the song next to the pointer
                            System.out.println("Now replaying " + songListIterator.next().getTitle());
                        }
                    } else {
                        // check whether it's not the end of the playlist and then play the song next to
                        // the pointer, thereafter return pointer to its original position
                        if (songListIterator.hasNext()) {
                            System.out.println("Now replaying " + songListIterator.next().getTitle());
                            songListIterator.previous();
                        } else {
                            // if it's the end, simply play the song previous to the pointer
                            System.out.println("Now replaying " + songListIterator.previous().getTitle());
                        }
                    }
                    break;
                case 4:
                    printMenu();
                    break;
                case 5:
                    for (Song song : playlist) {
                        System.out.println(song.getTitle());
                    }
                    break;
            }
        }
    }

    private static void addSongToPlaylist(String title) {
        Song foundSong = findSong(title);
        if (foundSong != null) {
            playlist.add(foundSong);
            System.out.println(title + " successfully added");
        } else {
            System.out.println("Cannot add. The song was not found in albums");
        }
    }

    private static void printMenu() {
        System.out.println("Available actions\nPress:");
        System.out.println("0 - to quit\n" +
                "1 - skip forward to the next song\n" +
                "2 - skip backwards to the previous song\n" +
                "3 - replay the current song\n" +
                "4 - print menu options\n" +
                "5 - list the songs in the playlist");
    }

    private static Song findSong(String title) {
        for (Album album : albums) {
            Song foundSong = album.findSong(title);
            if (foundSong != null) {
                return foundSong;
            }
        }
        return null;
    }
}
