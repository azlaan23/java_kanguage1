import java.util.Scanner;

public class class__practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calc fc = new Calc();
        System.out.println("ENTER number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("ENTER number 2 : ");
        int num2 = sc.nextInt();

        System.out.println("enter operator");
        char ch = sc.next().charAt(0);
        if (ch == '+') {
            fc.add(num1, num2);
        } else if (ch == '-') {
            fc.sub(num1, num2);
        } else if (ch == '*') {
            fc.multi(num1, num2);
        } else if (ch == '/') {
            fc.sub(num1, num2);
        } else {
            System.out.println("please valid number");
        }
    }

}
    class Calc {
        public void add(int x, int y) {
            System.out.println("Addition of two number :" + (x + y));
        }

        public void sub(int x, int y) {
            System.out.println("Subtraction of two number :" + (x - y));
        }

        public void multi(int x, int y) {
            System.out.println("multiplication of two number :" + (x * y));
        }

        public void div(int x, int y) {
            System.out.println("Division of two number :" + (x / y));
        }
    }


