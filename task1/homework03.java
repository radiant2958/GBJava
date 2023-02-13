
// Реализовать простой калькулятор
import java.util.Scanner;

public class homework03 {
    public static void main(String[] args) {
        try (Scanner cons = new Scanner(System.in)) {
            System.out.print("Input first number: ");
            int number1 = cons.nextInt();
            System.out.print("Input second number: ");
            int number2 = cons.nextInt();
            System.out.print("Input calculation operation: ");
            char sing = cons.next().charAt(0);
            switch (sing) {
                case '+':
                    System.out.println(number1 + number2);
                    break;
                case '-':
                    System.out.println(number1 - number2);
                    break;
                case '*':
                    System.out.println(number1 * number2);
                    break;
                case '/':
                    System.out.println(number1 / number2);
                    break;

                default:
                    System.out.print("Incorrectly entered data");
                    break;
            }
        }

    }

}
