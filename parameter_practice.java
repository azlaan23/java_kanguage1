import java.sql.SQLOutput;
import java.util.Scanner;

public class parameter_practice {
    public static void main(String[] args) {
//        int choice;
//        Scanner sc = new Scanner(System.in);
//        parameter_practice pr = new parameter_practice();
//        System.out.println("Enter any number1 : ");
//        choice = sc.nextInt();
//        if(choice==1)
//        {
//            pr.natural();
//        }
//        else  if(choice==2)
//        {
//            pr.even();
//        }
//        else if(choice==3)
//        {
//            pr.odd();
//        }
//        else {
//            System.out.println("plz enter valid choice");
//        }
//
//    }
//    public void even()
//        {
//            for (int i = 1; i <= 10; i++) {
//                if (i % 2 == 0) {
//                    System.out.println(i);
//                }
//            }
//        }
//
//
//    public void odd(){
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//        }
//
//    public void natural()
//    {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//    }
//        }
//    }


//    repeated, Question
        int choice;

        Scanner sc = new Scanner(System.in);
        parameter_practice pr = new parameter_practice();
        System.out.println("enter any number :");
        choice = sc.nextInt();
        if (choice == 1) {
            pr.natural();
        } else if (choice == 2) {
            pr.even();
        } else if (choice == 3) {
            pr.odd();
        }
        else{
            System.out.println("enter valid number");
        }
    }

    public void odd() {
        for (int i = 0; i <= 10; i++) {
            if ( i %2 != 0){
                System.out.println(i);

            }
        }

    }

    public void even() {
        for (int i = 0; i <= 10; i++) {
            if (i %2 == 0){
                System.out.println(i);

            }
        }
    }


    public void natural(){
        for(int i= 0; i<=10; i++) {
            System.out.println(i);
            }
        }

    }
