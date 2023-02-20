package DZ3;
import java.util.ArrayList;
// Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.Random;
public class task2 {
    public static void main(String [] args) {
        Random random = new Random();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i, random.nextInt(100));
            
        }
        System.out.println(list);
        System.out.println(deleteEvenNumbers(list));
    }
    public static ArrayList<Integer> deleteEvenNumbers(ArrayList<Integer> arr) {
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)%2==0){
                arr.remove(i);
            }
            
        }
        return arr;
        
    }
    
}
