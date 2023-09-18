
import javax.swing.*;
import java.util.Scanner;

public class Basic_Array_practice {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        String names[] = new String[5];
//        int marks[] = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter Student name");
//            names[i] = input.nextLine();
//        }
//
//
//        for (int j = 0; j < 5; j++) {
//            System.out.println("Enter student marks");
//            marks[j] = input.nextInt();
//        }
//
//
//        System.out.println("Entered student names are");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(names[i]+" "+marks[i]);
//        }
////
////            System.out.println("Entered Student marks are");
////            for (int j = 0; j < 5; j++) {
////                System.out.println(marks[j]);
////            }
//        }
//
//    }


//        Question 2
//        int sum = 0;
//        Scanner input = new Scanner(System.in);
//        int numbers[] = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter any number");
//            numbers[i] = input.nextInt();
//        }
//        System.out.println("Entered sum all number is ");
//
//            for (int number : numbers) {
//                sum += number;
//            }
//                System.out.println(sum);
//        }
//    }
//Question no 3


//        Scanner input = new Scanner(System.in);

//        System.out.println("Enter five number");
//        int smallestNumber = Integer.MAX_VALUE;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("number" + (1 + 1) + ":");
//            int num = input.nextInt();
//
//            if (num < smallestNumber) {
//                smallestNumber = num;
//            }
////            System.out.println("the smallest number is : " + smallestNumber);
//        }
//    }
//}


//repeat same question
        Scanner input = new Scanner(System.in);
        int min;
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("ENTER Five Number");
            arr[i] = input.nextInt();
        }
        min=arr[0];
        for (int i=0;i<5;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
//    }
//}


    }
}





















































