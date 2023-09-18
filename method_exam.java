import java.util.Scanner;

public class method_exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number :");
        int choice = sc.nextInt();
        Number pr = new Number();
        if (choice == 1) {
            pr.natural();
        }
        else if (choice == 2) {
            pr.even();

        } else if (choice == 3) {
            pr.odd();
        } else if (choice == 4) {
            pr.table();
        } else
        {
            System.out.println("please enter valid number");
        }
    }


    static class Number {
        Scanner nc = new Scanner(System.in);
        public void natural() {
            System.out.println("Enter limit :");
            int lt = nc.nextInt();
            for (int i = 0; i <= lt; i++) {
                System.out.println(i);
            }
        }

        public void even() {
            System.out.println("Enter limit :");
            int lt = nc.nextInt();
            for (int i = 0; i <= lt; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        public void odd() {
            System.out.println("Enter limit :");
            int lt = nc.nextInt();
            for (int i = 0; i <= lt; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        public void table() {

            System.out.println("Enter table :");
            int num = nc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num * i);
            }
        }
    }
}






















//wap clas name numbers natural even odd table

