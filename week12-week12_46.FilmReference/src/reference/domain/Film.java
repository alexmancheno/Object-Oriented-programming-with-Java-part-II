
package reference.domain;


public class Film {
    private String name;
    
    public Film(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return name;
    }
    
    public boolean equals(Object other) {
        if (other == null || other.getClass() != this.getClass())
            return false;
        
        Film o = (Film) other;
        return this.name.equals(o.name);
    }
    
    public int hashCode() {
        return name.hashCode();
    }
    
}
