public class Book implements ToBeStored {
 
    private String writer;
    private String name;
    private double weight;
 
    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
 
    public double weight() {
        return weight;
    }
     
    public String toString() {
        return writer + ": " + name;
    }
}