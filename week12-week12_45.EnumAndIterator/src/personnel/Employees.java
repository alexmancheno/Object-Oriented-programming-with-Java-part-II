
package personnel;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    
    private ArrayList<Person> persons;
    
    public Employees () {
        persons = new ArrayList();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public void add(List<Person> p) {
        for (Person person : p)
            persons.add(person);   
    }
    
    public void print() {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) 
                System.out.println(person);
        }
    }

        
    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) 
                iterator.remove();
        }
    }
}
