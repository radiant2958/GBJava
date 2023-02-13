// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

import java.util.Scanner;

public class homework01 {
    public static void main(String [] args){
    try (Scanner console = new Scanner(System.in)) {
        System.out.print("Input a number: ");
        int f = console.nextInt(); 
    System.out.println(factor(f));
    System.out.println(triangularnumber(f));

       
    }
}

    public static int factor(int n) {
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*factor(n-1);

        }
 
        
    }
    public static int triangularnumber(int t) {
        int res;
        res=(t*(t+1))/2;
        return res;
        
    }
    

}
