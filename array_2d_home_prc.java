import java.util.Scanner;
public class array_2d_home_prc {
    public static void main(String[] args) {

//        int matrix[][] = new int[3][3];
//        int matrax1[][] = new int[3][3];
//        int sum[][] = new int[3][3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Enter any number");
//                matrix[i][j] = sc.nextInt();
//                matrax1[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Entered number are");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                sum[i][j] = matrix[i][j] + matrax1[i][j];
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(sum[i][j] + " ");
//            }
//        }
//
//        System.out.println();
//    }
//
//
//    }


//Question 2

//        int substraction[][] = new int[3][3];
//        int substraction2[][] = new int[3][3];
//        int sum[][] = new int[3][3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Enter any number");
//                substraction[i][j] = sc.nextInt();
//                substraction2[i][j] = sc.nextInt();
//
//            }
//        }
//        System.out.println("Entered number are:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                sum[i][j] = substraction[i][j] - substraction2[i][j];
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(sum[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//    }
//}

//Question 3

//
//        int substraction[][] = new int[3][3];
//        int substraction2[][] = new int[3][3];
//        int sum[][] = new int[3][3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Enter any number");
//                substraction[i][j] = sc.nextInt();
//                substraction2[i][j] = sc.nextInt();
//
//            }
//        }
//        System.out.println("Entered number are:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                sum[i][j] = substraction[i][j] * substraction2[i][j];
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(sum[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//    }
//}


//Question 3
//        int num[][] ={ { 1,6,6,3}, {5,6,3,9}};
//
//
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(num[i][j] + " ");
//            }
//    System.out.println();
//
//        }
//    }
//}


//question 4
//        int row = 4;
//        int column = 4;
//        int[][] arr = new int[row][column];
//        int sum = 1;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                arr[i][j] = sum;
//                sum++;
//            }
//        }
//        System.out.println("the 2D array is : ");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//
//    }
//}


//repeat Question
//        int row = 4;
//        int column = 4;
//        int sum = 0;
//        int arr[][] = new int[row][column];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                arr[i][j] = sum;
//                sum++;
//            }
//        }
//        System.out.println("Enter number are :");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//Question 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row = sc.nextInt();

        System.out.println("Enter number of column :");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}