package dictionary;


import dictionary.MultipleEntryDictionary;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> list;
    
    public PersonalMultipleEntryDictionary() {
        list = new HashMap<String, Set<String>>();
    }
    
    public void add(String word, String entry) {
        if (!list.containsKey(word))
            list.put(word, new HashSet<String>());        
        list.get(word).add(entry);
    }
    
    public Set<String> translate(String word) {
        Set<String> set = list.get(word);
        return set;
    }
    
    public void remove(String word) {
        list.remove(word);
    }
}
