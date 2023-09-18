import java.util.Scanner;
public class practice_4 {
    public static void main(String[] args) {

        //switch case create calculator

        int number1, number2 ,result = 0;
        Scanner sc = new Scanner(System.in);
        char op;

        System.out.println("Enter any number");
         number1 = sc.nextInt();

        System.out.println("Enter any number");
        number2 = sc.nextInt();

        System.out.println("Enter Operator");
        op = sc.next().charAt(0);

        switch (op) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + "/" + number2 + " = " + result);
                break;
            default:
                System.out.println("please enter valid number");
            break;

        }

    }
}
















































