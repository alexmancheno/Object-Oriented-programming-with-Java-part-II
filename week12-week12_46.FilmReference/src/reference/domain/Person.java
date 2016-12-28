
package reference.domain;


public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public boolean equals(Object other) {
        if (other == null || other.getClass() != this.getClass())
            return false;
        
        Person o = (Person) other;
        return this.name.equals(o.name);
    }

    public int hashCode() {
        return name.hashCode();
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return name;
    }
}
