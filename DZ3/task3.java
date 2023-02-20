package DZ3;

import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из
// этого списка.
public class task3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i, random.nextInt(100));
            
        }
        System.out.println(list);
        System.out.println(maxElement(list));
        System.out.println(minElement(list));
        System.out.println(meanElement(list));
    }
    public static int maxElement(ArrayList<Integer> array) {
        int max=0;
        for (int i : array) {
            if (i>max) {
                max=i;   
            }
            
        }
        return max;
    }
    public static int minElement(ArrayList<Integer> array) {
        int min = array.get(0);
        for (Integer integer : array) {
            if (integer<min) {
                min=integer;   
            }   
        }
        return min;
    }
    public static int meanElement(ArrayList<Integer> array) {
        int mean;
        int sum=0;
        int n=array.size();
        for (Integer integer : array) {
            sum+=integer;
            
        }
        mean=sum/n;
        return mean;
    }
}
