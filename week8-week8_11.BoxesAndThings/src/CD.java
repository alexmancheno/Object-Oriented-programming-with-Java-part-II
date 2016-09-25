public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int yearPublished;
    private double weight = 0.1;
     
    public CD(String artist, String title, int yearPublished) {
        this.artist = artist;
        this.title = title;
        this.yearPublished = yearPublished;
    }
    public double weight() {
        return weight;
    }
     
    public String toString() {
        return artist + ": " + title + " (" + yearPublished + ")";
    }
}
