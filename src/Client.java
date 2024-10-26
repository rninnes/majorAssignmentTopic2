import java.io.*; 
import java.util.*;

public class Client {
    public static void main(String[] args) throws IOException {
        // Create a new MusicLibrary object
        MusicLibrary library = new MusicLibrary();
        Scanner scanner = new Scanner(System.in);

        // Add songs to the library

        // Drake's songs
        library.addSong(createSong("Certified Lover Boy", "Drake", "Certified Lover Boy", new Time(4, 5), 2021));
        library.addSong(createSong("Take Care", "Drake", "Take Care", new Time(3, 50), 2011));
        library.addSong(createSong("For All the Dogs", "Drake", "For All the Dogs", new Time(4, 15), 2023));
        library.addSong(createSong("Views", "Drake", "Views", new Time(5, 10), 2016));
        library.addSong(createSong("Scorpion", "Drake", "Scorpion", new Time(4, 30), 2018));
        library.addSong(createSong("Nothing Was the Same", "Drake", "Nothing Was the Same", new Time(4, 0), 2013));
        library.addSong(createSong("More Life", "Drake", "More Life", new Time(4, 20), 2017));
        library.addSong(createSong("Thank Me Later", "Drake", "Thank Me Later", new Time(4, 35), 2010));
        library.addSong(createSong("Honestly Nevermind", "Drake", "Honestly Nevermind", new Time(3, 55), 2022));

        // Travis Scott's songs
        library.addSong(createSong("Utopia", "Travis Scott", "Utopia", new Time(3, 40), 2023));
        library.addSong(createSong("Astroworld", "Travis Scott", "Astroworld", new Time(4, 10), 2018));
        library.addSong(createSong("Days Before Rodeo", "Travis Scott", "Days Before Rodeo", new Time(3, 45), 2014));
        library.addSong(createSong("Rodeo", "Travis Scott", "Rodeo", new Time(5, 0), 2015));
        library.addSong(createSong("Jackboys", "Travis Scott", "Jackboys", new Time(4, 20), 2019));

        // Dave's songs
        library.addSong(createSong("Psychodrama", "Dave", "Psychodrama", new Time(4, 0), 2019));
        library.addSong(createSong("We're All Alone in This Together", "Dave", "We're All Alone in This Together", new Time(4, 25), 2021));
        library.addSong(createSong("Game Over", "Dave", "Game Over", new Time(3, 30), 2017));
        library.addSong(createSong("Split Decision", "Dave", "Split Decision", new Time(3, 55), 2020));

        // Metro Boomin's songs
        library.addSong(createSong("We Don’t Trust You", "Metro Boomin", "We Don’t Trust You", new Time(4, 5), 2017));
        library.addSong(createSong("Heroes & Villains", "Metro Boomin", "Heroes & Villains", new Time(4, 15), 2022));
        library.addSong(createSong("Savage Mode II", "Metro Boomin", "Savage Mode II", new Time(3, 50), 2020));
        library.addSong(createSong("Not All Heroes Wear Capes", "Metro Boomin", "Not All Heroes Wear Capes", new Time(4, 30), 2018));

        // PARTYNEXTDOOR's songs
        library.addSong(createSong("PARTYNEXTDOOR", "PARTYNEXTDOOR", "PARTYNEXTDOOR", new Time(4, 0), 2013));
        library.addSong(createSong("PARTYNEXTDOORTWO", "PARTYNEXTDOOR", "PARTYNEXTDOORTWO", new Time(3, 55), 2014));
        library.addSong(createSong("PARTYNEXTDOOR 3", "PARTYNEXTDOOR", "PARTYNEXTDOOR 3", new Time(4, 10), 2016));
        library.addSong(createSong("PARTYNEXTDOOR 4", "PARTYNEXTDOOR", "PARTYNEXTDOOR 4", new Time(3, 45), 2018));

        // Giveon's songs
        library.addSong(createSong("Take Time", "Giveon", "Take Time", new Time(4, 5), 2020));
        library.addSong(createSong("Give or Take", "Giveon", "Give or Take", new Time(3, 50), 2022));

        // Sevendust's songs
        library.addSong(createSong("Black", "Sevendust", "Sevendust", new Time(4, 9), 1997));
        library.addSong(createSong("Enemy", "Sevendust", "Seasons", new Time(3, 1), 2003));
        library.addSong(createSong("Praise", "Sevendust", "Animosity", new Time(3, 39), 2001));
        library.addSong(createSong("Decay", "Sevendust", "Black Out the Sun", new Time(3, 25), 2013));

        // Karnivool's songs
        library.addSong(createSong("Themata", "Karnivool", "Themata", new Time(5, 40), 2005));
        library.addSong(createSong("Simple Boy", "Karnivool", "Sound Awake", new Time(4, 53), 2009));
        library.addSong(createSong("We Are", "Karnivool", "Asymmetry", new Time(5, 50), 2013));
        library.addSong(createSong("Goliath", "Karnivool", "Sound Awake", new Time(4, 35), 2009));

        // Metallica's songs
        library.addSong(createSong("Enter Sandman", "Metallica", "Metallica", new Time(5, 32), 1991));
        library.addSong(createSong("Master of Puppets", "Metallica", "Master of Puppets", new Time(8, 36), 1986));
        library.addSong(createSong("One", "Metallica", "…And Justice for All", new Time(7, 24), 1988));
        library.addSong(createSong("Nothing Else Matters", "Metallica", "Metallica", new Time(6, 28), 1991));

        // System of a Down's songs
        library.addSong(createSong("Chop Suey!", "System of a Down", "Toxicity", new Time(3, 30), 2001));
        library.addSong(createSong("B.Y.O.B.", "System of a Down", "Mezmerize", new Time(4, 15), 2005));
        library.addSong(createSong("Toxicity", "System of a Down", "Toxicity", new Time(3, 39), 2001));
        library.addSong(createSong("Aerials", "System of a Down", "Toxicity", new Time(6, 11), 2001));

        // Alice in Chains' songs
        library.addSong(createSong("Man in the Box", "Alice in Chains", "Facelift", new Time(4, 46), 1990));
        library.addSong(createSong("Rooster", "Alice in Chains", "Dirt", new Time(6, 14), 1992));
        library.addSong(createSong("Nutshell", "Alice in Chains", "Jar of Flies", new Time(4, 19), 1994));
        library.addSong(createSong("Would?", "Alice in Chains", "Dirt", new Time(3, 28), 1992));

        // Tool's songs
        library.addSong(createSong("Schism", "Tool", "Lateralus", new Time(6, 43), 2001));
        library.addSong(createSong("Sober", "Tool", "Undertow", new Time(5, 6), 1993));
        library.addSong(createSong("Stinkfist", "Tool", "Ænima", new Time(5, 11), 1996));
        library.addSong(createSong("Vicarious", "Tool", "10,000 Days", new Time(7, 6), 2006));

        // Creed's songs
        library.addSong(createSong("With Arms Wide Open", "Creed", "Human Clay", new Time(4, 38), 1999));
        library.addSong(createSong("Higher", "Creed", "Human Clay", new Time(5, 17), 1999));
        library.addSong(createSong("My Sacrifice", "Creed", "Weathered", new Time(4, 56), 2001));
        library.addSong(createSong("One Last Breath", "Creed", "Weathered", new Time(3, 58), 2001));

        // Nirvana's songs
        library.addSong(createSong("Smells Like Teen Spirit", "Nirvana", "Nevermind", new Time(5, 1), 1991));
        library.addSong(createSong("Come as You Are", "Nirvana", "Nevermind", new Time(3, 39), 1991));
        library.addSong(createSong("Lithium", "Nirvana", "Nevermind", new Time(4, 17), 1991));
        library.addSong(createSong("Heart-Shaped Box", "Nirvana", "In Utero", new Time(4, 39), 1993));

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

        // Basic menu for navigation and shuffle
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Next Song");
            System.out.println("2. Previous Song");
            System.out.println("3. Shuffle Play");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Song next = library.nextSong();
                    if (next != null) {
                        System.out.println("Now playing: " + next.getTitle() + " by " +
                                           next.getArtist().getName() + " from " + next.getAlbum().getName() +
                                           ", Duration: " + next.getDuration() +
                                           ", Released: " + next.getReleaseYear());
                    } else {
                        System.out.println("No songs in the library.");
                    }
                    break;

                case 2:
                    Song prev = library.previousSong();
                    if (prev != null) {
                        System.out.println("Now playing: " + prev.getTitle() + " by " +
                                           prev.getArtist().getName() + " from " + prev.getAlbum().getName() +
                                           ", Duration: " + prev.getDuration() +
                                           ", Released: " + prev.getReleaseYear());
                    } else {
                        System.out.println("No songs in the library.");
                    }
                    break;

                    case 3:
                    library.shufflePlay();
                    System.out.println("Library shuffled.");
                    Song shuffled = library.nextSong();
                    if (shuffled != null) {
                        System.out.println("Now playing: " + shuffled.getTitle() + " by " +
                                           shuffled.getArtist().getName() + " from " + shuffled.getAlbum().getName() +
                                           ", Duration: " + shuffled.getDuration() +
                                           ", Released: " + shuffled.getReleaseYear());
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
        scanner.close();
    }

    // Helper method to create a Song
    public static Song createSong(String title, String artistName, String albumName, Time duration, int releaseYear) {
        return new Song(title, new Artist(artistName), new Album(albumName), duration, releaseYear);
    }
    
}
