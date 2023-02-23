import java.util.Iterator;
import java.util.LinkedList;
// import java.util.ListIterator;
import java.util.Random;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список. 
// Постараться не обращаться к листу по индексам.
public class task1{
    public static void main(String[] args) {
        LinkedList<Integer> listLinked = new LinkedList<>();
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) {
            listLinked.add(random.nextInt(30));

        }
        System.out.println(listLinked);
        System.out.println(reversLinkedList(listLinked));   
    
    }
    public static LinkedList<Integer> reversLinkedList(LinkedList<Integer> linkedList) {
        Iterator<Integer> iterator = linkedList.descendingIterator();
        LinkedList<Integer> reversLL = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            reversLL.add(iterator.next());
            
        }
        return reversLL;   
    }
}