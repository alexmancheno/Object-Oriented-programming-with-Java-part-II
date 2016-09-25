import java.util.HashMap;
import java.util.ArrayList;
 
public class VehicleRegister {
 
    private HashMap<RegistrationPlate, String> owners;
     
    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }
 
    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) != null)  {
            return false;
        }
        owners.put(plate, owner);
        return true;
 
    }
 
    public String get(RegistrationPlate plate) {       
        return owners.get(plate);
    }
 
    public boolean delete(RegistrationPlate plate) {
        if (owners.get(plate) == null) return false;
        owners.remove(plate);
        return true;
    }
     
    public void printRegistrationPlates() {
        for (RegistrationPlate key : owners.keySet())
            System.out.println(key);
    }
     
    public void printOwners() {
         ArrayList<String> list = new ArrayList<String>();
        for (RegistrationPlate key : owners.keySet())
           if (!list.contains(owners.get(key)))
               list.add(owners.get(key));
        for (String name : list)
            System.out.println(name);
    }
}
