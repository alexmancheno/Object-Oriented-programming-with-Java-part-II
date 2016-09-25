public class Person implements Comparable<Person>{

    private int salary;
    private String name;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return name + " " + salary;
    }
    
    @Override
    public int compareTo(Person person) {
        if (this.salary - person.salary < 0) return 1;
        else if (this.salary - person.salary > 0) return -1;
        else return 0;
    }
}
