public class Song {
    public String title;
    public Artist artist;
    public Album album;
    public Time duration;
    public int releaseYear;

    // Constructor for Song class
    public Song(String title, Artist artist, Album album, Time duration, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

  // Getters for duration and releaseYear
    public Time getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public Album getAlbum() {
        return album;
    }

    // Converts the Song object to a CSV-formatted string
    @Override
    public String toString() {
        return title + "," + artist.getName() + "," + album.getName() + "," + duration + "," + releaseYear;
    }
}
