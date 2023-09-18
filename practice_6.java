import java.util.Scanner;
public class practice_6 {
    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        Marks fc = new Marks();
        System.out.println("Enter any number 1 : ");
         choice = sc.nextInt();

        if (choice == 1) {
            fc.natural();
        } else if (choice == 2) {
            fc.even();
        } else if (choice == 3) {
            fc.odd();
        } else {
            System.out.println("please enter valid number :  ");
        }
    }

}
    class Marks {
        public void natural() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        public void even() {

            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
            public void odd() {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }


                }
            }
        }

