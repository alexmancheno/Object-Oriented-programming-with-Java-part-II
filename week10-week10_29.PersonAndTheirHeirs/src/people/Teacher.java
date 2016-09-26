package people;

public class Teacher extends Person {
    private int salary = 0;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    public String toString() {
        return super.toString() + "\n  " + "salary " + salary + " euros/month";
    }
}
