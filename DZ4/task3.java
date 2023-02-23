import java.util.LinkedList;
import java.util.Random;

// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> listLinked = new LinkedList<>();
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) {
            listLinked.add(random.nextInt(10));

        }
        System.out.println(listLinked);
        System.out.println(sumLinkedList(listLinked));
        
    }

    static int sumLinkedList(LinkedList<Integer> linkedList){
        int sum=0;
        for (Integer integer : linkedList) {
            sum+=integer;
            
        }
        return sum;
    }
}
