import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {

    private Map<String, List<String>> numbers = new TreeMap<String, List<String>>();
    private Map<String, String> persons = new HashMap<String, String>();
    private Map<String, List<String>> addresses = new TreeMap<String, List<String>>();
    private Map<String, String> personsByAddresses = new HashMap<String, String>();

    public void addPhonenumber(String name, String number) {
        if (!numbers.containsKey(name)) {
            numbers.put(name, new ArrayList<String>());
        }
        numbers.get(name).add(number);
        persons.put(number, name);
        if (!addresses.containsKey(name)) {
            addresses.put(name, new ArrayList<String>());
        }
    }

    public void searchNumber(String name) {
        if (!numbers.containsKey(name)) {
            System.out.println("  not found");
        } else {
            for (String s : numbers.get(name)) {
                s = " " + s;
                System.out.println(s);
            }
        }
    }

    public void searchByNumber(String number) {
        if (!persons.containsKey(number)) {
            System.out.println(" not found");
        } else {
            System.out.print(" ");
            System.out.println(persons.get(number));
        }
    }

    public void addAddress(String name, String street, String city) {
        if (!addresses.containsKey(name)) {
            addresses.put(name, new ArrayList<String>());
        }
        if (!numbers.containsKey(name)) {
            numbers.put(name, new ArrayList<String>());
        }
        String address = street + " " + city;
        addresses.get(name).add(address);
        personsByAddresses.put(address, name);
    }

    public void findInfo(String name) {
        if (!addresses.containsKey(name)) {
            System.out.println("  not found");
            return;
        }
        if (addresses.get(name).isEmpty()) {
            System.out.println("  address unknown");
        } else {
            for (String address : addresses.get(name)) {
                System.out.print("  address: ");
                System.out.println(address);
            }
        }
        if (numbers.get(name).isEmpty()) {
            System.out.println("  phone number not found");
        } else {
            System.out.println("  phone numbers:");
            for (String number : numbers.get(name)) {
                System.out.print("   ");
                System.out.println(number);
            }
        }
    }

    public void deletePersonalInfo(String name) {
        try {
            List<String> numbersToBeDeleted = numbers.get(name);
            numbers.remove(name);
            for (String num : numbersToBeDeleted) {
                persons.remove(num);
            }
            List<String> adderessesToBeDeleted = addresses.get(name);
            for (String address : numbersToBeDeleted) {
                personsByAddresses.remove(address);
            }
            addresses.remove(name);
        } catch (Exception e) {
            System.out.println("The person by that name was not found.");
        }
    }

    public void keywordSearch(String keyword) {
        int searched = 0;
        for (String name : numbers.keySet()) {
            if (name.contains(keyword)) {
                searched++;
                System.out.println("");
                System.out.print(" ");
                System.out.println(name);
                if (addresses.get(name).isEmpty()) {
                    System.out.println("  address unknown");
                } else {
                    for (String address : addresses.get(name)) {
                        System.out.print("  address: ");
                        System.out.println(address);
                    }
                }
                if (numbers.get(name).isEmpty()) {
                    System.out.println("  phone number not found");
                } else {
                    System.out.println("  phone numbers:");
                    for (String number : numbers.get(name)) {
                        System.out.print("   ");
                        System.out.println(number);
                    }
                }
            }
        }
        for (List<String> addressesStored : addresses.values()) {
            for (String addressesToBeSearched : addressesStored) {
                if (addressesToBeSearched.contains(keyword)) {
                    searched++;
                    System.out.println("");
                    System.out.print(" ");
                    System.out.println(personsByAddresses.get(addressesToBeSearched)); // print name
                    for (String address : addresses.get(personsByAddresses.get(addressesToBeSearched))) {
                        System.out.print("  address: ");
                        System.out.println(address);
                    }
                    if (numbers.get(personsByAddresses.get(addressesToBeSearched)).isEmpty()) {
                        System.out.println("  phone number not found");
                    } else {
                        for (String number : numbers.get(personsByAddresses.get(addressesToBeSearched))) {
                            System.out.println("  phone numbers:");
                            System.out.print("   ");
                            System.out.println(number);
                        }
                    }
                }
            }
        }
        if (searched == 0) {
            System.out.println(" keyword not found");
        }
    }
}