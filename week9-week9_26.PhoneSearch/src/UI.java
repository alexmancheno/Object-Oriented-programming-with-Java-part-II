import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mika
 */
public class UI {
    
    String testinput = "1\npekka\n040-123456\n2\njukka\n2\npekka\n040-123456\n1\npekka\n09-222333\n2\npekka\n3\n02-444123\n3\n09-222333\n5\npekka\n4\npekka\nida ekamanintie\nhelsinki\n5\npekka\n4\njukka\nkorsontie\nvantaa\n5\njukka\n7\nkk\n7\nvantaa\n7\nseppo\n6\njukka\n5\njukka\nx\n";
    private Scanner reader = new Scanner(System.in);
    
    public void start(){
        Phonebook phonebook = new Phonebook();
        printMenu();
        getCommand(phonebook);
    }
    
    private void printMenu() {
        System.out.println("phone search\n" +
"available operations:\n" +
" 1 add a number\n" +
" 2 search for a number\n" +
" 3 search for a person by phone number\n" +
" 4 add an address\n" +
" 5 search for personal information\n" +
" 6 delete personal information\n" +
" 7 filtered listing\n" +
" x quit");
    }
    
    private void getCommand(Phonebook phonebook){
        String command, name, number, street, city, keyWord = "";
        while (true) {
            System.out.println("");
            System.out.println("command: ");
            command = reader.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) { // add a number
                name = askWhoseName();
                number = askNumber();
                phonebook.addPhonenumber(name, number);
            } else if (command.equals("2")) {
                name = askWhoseName();
                phonebook.searchNumber(name);
            } else if (command.equals("3")) {
                number = askNumber();
                phonebook.searchByNumber(number);
            } else if (command.equals("4")) {
                name = askWhoseAddress();
                street = askStreet();
                city = askCity();
                phonebook.addAddress(name, street, city);
            } else if (command.equals("5")) { // searchfor personal Info
                name = askWhoseInfo();
                phonebook.findInfo(name);
            } else if (command.equals("6")) { // delete personal info
                name = askWhoseInfo();
                phonebook.deletePersonalInfo(name);
            } else if (command.equals("7")) { // keyword search
                keyWord = askKeyword();
                phonebook.keywordSearch(keyWord);
            }
        }
    }
    
    private String askWhoseName(){
        System.out.println("whose number: ");
        String name = reader.nextLine();
        return name;
    }
    
    private String askNumber(){
        System.out.println("number: ");
        String number = reader.nextLine();
        return number;
    }
    
    private String askWhoseAddress(){
        System.out.println("whose address: ");
        String address = reader.nextLine();
        return address;
    }
    
    private String askWhoseInfo(){
        System.out.println("whose information: ");
        String info = reader.nextLine();
        return info;
    }
    
    private String askKeyword(){
        System.out.println("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        return keyword;
    }
    
    private String askCity(){
        System.out.println("city: ");
        String city = reader.nextLine();
        return city;
    }
    
    private String askStreet(){
        System.out.println("street: ");
        String street = reader.nextLine();
        return street;
    }
}