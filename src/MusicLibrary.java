import java.io.*;
import java.util.*;

public class MusicLibrary {
    public ArrayList<Song> songs;
    private int currentSongIndex = -1; // Track the current song

    public Song nextSong() {
        if (songs.size() == 0) return null;
        currentSongIndex = (currentSongIndex + 1) % songs.size();
        return songs.get(currentSongIndex);
    }

    public Song previousSong() {
        if (songs.size() == 0) return null;
        currentSongIndex = (currentSongIndex - 1 + songs.size()) % songs.size();
        return songs.get(currentSongIndex);
    }

    public void shufflePlay() {
        Collections.shuffle(songs);
        currentSongIndex = 0; // Start at the beginning of the shuffled list
    }

    // Constructor for MusicLibrary class

    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }

    //  Adds a Song to the library

    public void addSong(Song song) {
        this.songs.add(song);
    }

    //  Saves the music library to a CSV file

    public void saveToCSV(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (Song song : songs) {
            writer.write(song.toString());
            writer.newLine();
        }
        writer.close();
    }    

    //  Loads the music library from a CSV file

    public void loadFromCSV(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String title = parts[0];
            String artistName = parts[1];
            String albumName = parts[2];
            Time duration = Time.fromString(parts[3]);
            int releaseYear = Integer.parseInt(parts[4]);
    
            Song song = new Song(title, new Artist(artistName), new Album(albumName), duration, releaseYear);
            this.songs.add(song);
        }
        reader.close();
    }
    
}