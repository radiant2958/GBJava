package DZ5;
// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

public class task1 {
   
    public static void main(String[] args) {
        PhoneBook myBook = new PhoneBook();
        myBook.addCountact("Иванов Василий", "89146547865");
        myBook.addCountact("Петрова Юля", "8914876543");
        myBook.addCountact("Семенова Таня", "878654,98765");
        myBook.addCountact("Васильев Никита", "89146547865");
        myBook.printContact();
        System.out.println();
        myBook.lookContact("Семенова Таня");
        System.out.println();
        myBook.removeContact("Петрова Юля");
        myBook.printContact();



    }


    
}


