
import java.util.Scanner;

public class exam_practice_04 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1 :");
//        int num1 = sc.nextInt();
//
//        System.out.println("Enter number2 :");
//        int num2 = sc.nextInt();
//
//        System.out.println("Enter number 3 :");
//        int num3 = sc.nextInt();
//
//        if (num1>num2)
//            if(num1>num3)
//            {
//                System.out.println("num1 is greater");
//            }else
//            {
//                System.out.println("num3 is greater");
//            }
//        else if (num2>num3) {
//            System.out.println("num2 is greater");
//        }else
//        {
//            System.out.println("num3 is greater");
//        }
//    }
//}

//    Question no 2
//int number [] ={ 1,2,3,4,5};
//int sum =0;
//double average ;
//for (int a :number)
//{
//    sum =+a;
//}
//        int arrayLength = number.length;
//average = (double) sum / (double) arrayLength;
//        System.out.println("sum" + sum);
//        System.out.println("average" + average);
//
//
//    }
//}

//Question no 3
//        int arr[] = new int[5];
//        int i, j;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number :");
//        for ( i = 0; i <= arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int max= arr[0];
//        for (j = 0; j <= arr.length; j++) {
//            if (max < arr[j])
//            max = arr[j];
//        }
//        System.out.println("max number :" + max);
//    }
//}


        int arr[] = new int[5];
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array element");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        for (j = 1; j < arr.length; j++) {
            if (max < arr[j])
                max = arr[j];
        }
        System.out.println("greater number :" + max);
    }
}


