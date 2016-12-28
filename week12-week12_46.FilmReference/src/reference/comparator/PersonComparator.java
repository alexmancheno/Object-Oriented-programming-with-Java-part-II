
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;


public class PersonComparator implements Comparator<Person> {
    
    Map<Person, Integer> map;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        map = peopleIdentities;
    }
    
    @Override
    public int compare(Person one, Person two) {
        return map.get(two) - map.get(one);
    }

}
