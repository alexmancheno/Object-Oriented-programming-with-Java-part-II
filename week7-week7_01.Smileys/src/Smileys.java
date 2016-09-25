public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        if (length % 2 == 1) {
            printSmileys(length+1);
        } else {
            printSmileys(length);
        }
        System.out.print(":) "+ characterString);
        if (length % 2 == 1) {
            System.out.println("  :)");
        } else {
            System.out.println(" :)");
        }
        if (length % 2 == 1) {
            printSmileys(length+1);
        } else {
            printSmileys(length);
        }
    }
    private static void printSmileys(int length) {
        for (int i = 0; i < length+6; i+=2) {
            System.out.print(":)");
        }
        System.out.println("");
    }
}