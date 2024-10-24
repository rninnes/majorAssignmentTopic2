import java.io.*; 
import java.util.*;

public class Client {
    public static void main(String[] args) throws IOException {
        // Create a new MusicLibrary object
        MusicLibrary library = new MusicLibrary();
        Scanner scanner = new Scanner(System.in);

        // Add songs to the library
        library.addSong(createSong("Song1", "Artist1", "Album1"));
        library.addSong(createSong("Song2", "Artist1", "Album1"));
        library.addSong(createSong("Song3", "Artist2", "Single"));

        // Save the library to a CSV file
        System.out.print("Enter the file name to save the library (e.g., library.csv): ");
        String fileName = scanner.nextLine();
        library.saveToCSV(fileName);

        // Load the library from the CSV file
        System.out.println("\nLoading the library from the file...");
        MusicLibrary loadedLibrary = new MusicLibrary();
        loadedLibrary.loadFromCSV(fileName);

        // Display the loaded library
        System.out.println("\nLoaded Library:");
        for (Song song : loadedLibrary.songs) {
            System.out.println(song);
        }

        scanner.close();
    }

    // Helper method to create a Song
    public static Song createSong(String title, String artistName, String albumName) {
        return new Song(title, new Artist(artistName), new Album(albumName));
    }
}
