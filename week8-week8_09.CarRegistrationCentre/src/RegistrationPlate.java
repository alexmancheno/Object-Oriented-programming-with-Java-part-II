public class RegistrationPlate {
    private final String regCode;
    private final String country;
 
    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }
     
    public String getRegCode () {
        return this.regCode;
    }
     
    public String getCountry() {
        return this.country;
    }
 
    @Override
    public String toString() {
        return country + " " + regCode;
    }
     
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
         
        RegistrationPlate plate = (RegistrationPlate) object;
         
        if (this.getRegCode() != plate.getRegCode()) return false;
        if (this.getCountry() != plate.getCountry()) return false;
         
        return true;
    }
     
    @Override
    public int hashCode() {
        int hashCode = 0;
        if (regCode == null) return 1;
        if (country == null) return 2;
        for (int i = 0; i < regCode.length(); i++)
            hashCode += (int) regCode.charAt(i);
        for (int i = 0; i < country.length(); i++)
            hashCode += (int) country.charAt(i);
        return hashCode;
    }
 
}