
package people;

public class Student extends Person {
    private int credits = 0;
    
    public Student(String name, String address) {
        super(name, address);
    }
    
    public void study() {
        credits++;
    }
    
    public int credits() {
        return credits;
    }
    
    public String toString() {
        return super.toString() + "\n  " + "credits " + credits;
    }
    
}
