public class Song {
    public String title;
    public Artist artist;
    public Album album;

    //  Constructor for Song class

    public Song(String title, Artist artist, Album album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    // Converts the Song object to a CSV-formatted string
    @Override
    public String toString() {
        return title + "," + artist.getName() + "," + album.getName();
    }
}
