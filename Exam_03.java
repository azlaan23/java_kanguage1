import java.util.Scanner;

public class Exam_03 {
    public static void main(String[] args) {

//        Greatest of three number
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter number 1 :");
//        int num1 = sc.nextInt();
//
//        System.out.println("Enter number2 :");
//        int num2 = sc.nextInt();
//
//        System.out.println("Enter number 3");
//        int num3 = sc.nextInt();
//
//
//        if (num1 > num2)
//            if (num1 > num2) {
//                System.out.println("num1 is greater");
//            } else {
//                System.out.println("num2 is greater");
//            }
//        else if (num2 > num3) {
//            System.out.println("num2 is greater");
//        } else {
//            System.out.println("num3 is greater");
//        }
//    }
//}


//        Question no 2

//        week day from 1 to 7

//
//        int choice;
//        String name;
//        Scanner sc = new Scanner(System.in);
//        Exam_03 pr = new Exam_03();
//        System.out.println("Enter day name ");
//        choice= sc.nextInt();
//
//        if (choice == 1) {
//            pr.mon();
//        } else if (choice == 2) {
//            pr.tue();
//        } else if (choice == 3) {
//            pr.wed();
//        } else if (choice == 4) {
//            pr.thu();
//        } else if (choice == 5) {
//            pr.fri();
//        } else if (choice == 6) {
//            pr.sat();
//        }
//    }
//
//public void mon(){
//        System.out.println("monday");
//        }
//public void tue(){
//        System.out.println("tuesday");
//    }
//    public void wed(){
//        System.out.println("wednesday");
//    }
//    public  void thu(){
//        System.out.println("thursday");
//    }
//    public void fri(){
//        System.out.println("Friday");
//    }
//    public void sat(){
//        System.out.println("saturday");
//    }
//}


//        Question no 3
//        leap year or not


//        long a,y,c;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter  any  calendar year :");
//        y=sc.nextLong();
//        if(y!=0)
//        {
//            a=(y%400==0)?(c=1):((y%100==0)?(c=0):((y%4==0)?(c=1):(c=0)));
//            if(a==1)
//                System.out.println(y+" is a leap year");
//            else
//                System.out.println(y+" is not a leap year");
//        }
//        else
//            System.out.println("year zero does not exist ");
//    }
//}

//Question no 4

//average sum of five number


//        int number[] ={1,2,3,4,5};
//        int sum = 0;
//      double average;
//
//        for (int a : number) {
//           sum += a;
//        }
//        int arrayLength = number.length;
//        average = ((double) sum / (double) arrayLength);
//        System.out.println("Sum is " +  sum);
//       System.out.println("average " + average);
//    }
//}

//Question no 5

//greatest of 5 number in array


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




















































/*Q1 . write a three num from user greatest of three number
*/

//Q2 w a p that take a number from user bw 1 to 7 & week day name user



//Q3 wap that user weather it is leep year or not
//Q4 wap that user 5  number feom user display avarge sum of 5 number
//Q5 wap to accept 5 element from user and display smallest number