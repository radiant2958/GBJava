package DZ3;

import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием
public class task1 {
    // Реализовать алгоритм сортировки слиянием
    public static void main(String[] args) {
        int[] arra=new int[]{4,66,47,87,54,2,9};
        int[] arra2=new int[]{68,76,43,98,9,2,55};
        int[] h=mergeSorting(arra,arra2);
        System.out.println(Arrays.toString(h));
        
        
    }
    public static int[] sortingarr(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    
                }
                
            }
            
        }
        return array;
    }
    public static int[] mergeSorting(int[] arr1, int [] arr2) {
        arr1=sortingarr(arr1);
        arr2=sortingarr(arr2);
        int l1= arr1.length;
        int l2= arr2.length;
        int [] arr= new int[l1+l2];
        int i=0;
        int j=0;
        int k=0;
        while (i<l1&&j<l2) {
            if (arr1[i]<=arr2[j]) {
                arr[k]=arr1[i];
                i++;
            }
            else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<l1) {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while (j<l2) {
            arr[k]=arr2[j];
            j++;
            k++;
            
        }

     
        return arr;
    }
}
