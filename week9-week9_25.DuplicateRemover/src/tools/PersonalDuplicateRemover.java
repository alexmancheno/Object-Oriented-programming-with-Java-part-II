
package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> list;
    private int numOfDuplicates;
    
    public PersonalDuplicateRemover() {
        list = new HashSet<String>();
    }
    
    public void add(String characterString) {
        if (list.add(characterString))
            list.add(characterString);
        else numOfDuplicates++;
    }
    
    public int getNumberOfDetectedDuplicates() {
        return numOfDuplicates;
    }
    
    public Set<String> getUniqueCharacterStrings() {
        return list;
    }

    public void empty() {
        list.removeAll(list);
        numOfDuplicates = 0;
    }
}

