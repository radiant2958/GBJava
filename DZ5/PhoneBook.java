package DZ5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static Map<String,ArrayList<String>> telephonBook = new HashMap<>();
 
    public static void addCountact(String name,String phoneNumber ) {
        if (telephonBook.containsKey(name)) {
            ArrayList<String> number = telephonBook.get(name);
            number.add(phoneNumber);
            telephonBook.put(name, number);
        }
        else{
            ArrayList<String> number = new ArrayList<>();
            number.add(phoneNumber);
            telephonBook.put(name, number);
        }
        
    }
    public static void printContact() {
        for (String n : telephonBook.keySet()) {
            System.out.printf(n + ":"+telephonBook.get(n)+"\n");
            
        }
        
    }
    public static void lookContact(String name) {
        if (telephonBook.containsKey(name)) {
            System.out.printf(name + ":"+telephonBook.get(name)+"\n");    
        }
        else{
            System.out.printf(name + "контакт отсутствует в телефоной книге");

        }
        
    }
    public static void removeContact(String name) {
        telephonBook.remove(name);
        
    }


    
    
}
