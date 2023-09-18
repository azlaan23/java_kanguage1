import org.w3c.dom.ls.LSOutput;

import java.lang.constant.DynamicCallSiteDesc;
import java.util.Scanner;

public class array_2d_practice {
    public static void main(String[] args) {

//        int sum = 0;
//        int numbers[][] = new int[3][3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("enter any number");
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Entered number are:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                sum += numbers[i][j];
//
//            }
//            System.out.print(sum + " ");
//        }
//
//    }
//}
//        System.out.println();


//    Question 2


//        int sum = 0;
//        int matrix[][] = new int[3][3];
//        int matrix2[][] = new int[3][3];
//        int sum[][] = new int[3][3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("enter any number");
//                matrix[i][j] = sc.nextInt();
//                matrix2[i][j] = sc.nextInt();
//
//            }
//        }
//
//        System.out.println("entered number are:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                sum [i][j]= matrix[i][j] + matrix2[i][j];
//
//
//            }
////            System.out.println(sum + " ");
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(sum[i][j] + " ");
//            }
//
//        }
//        System.out.println();
//
//    }
//}



//    question 3

        int matrix[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int multiple[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter any number");
                matrix[i][j] = sc.nextInt();
                matrix2[i][j] = sc.nextInt();

            }
        }

        System.out.println("entered number are:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiple [i][j]= matrix[i][j] * matrix2[i][j];


            }
//            System.out.println(sum + " ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multiple[i][j] + " ");
            }

        }
        System.out.println();

    }
}





















