import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
//     Question no 1
//        Scanner pc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = pc.nextInt();
//
//        if(num % 2 == 0) {
//            System.out.println(num + " is even");
//        }
//            else
//        {
//            System.out.println(num + " is odd");
//    }
//        }
//
//    }


//Question 2
//         greater of three number
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1= reader.nextInt();

        System.out.println("Enter num2 ");
        int num2 = reader.nextInt();

        System.out.println("Enter num3 ");
        int num3 = reader.nextInt();

     if (num1 > num2) {

         if (num1 > num2)
         {

                 System.out.println("num1 is greater");
         }

             else
         {
             System.out.println("num2 is greater");
         }

     }
        else  if (num2>num3)
        {
            System.out.println("num2 is greater");
        }
        else
       {
            System.out.println("num3 is greater");
        }

    }
}