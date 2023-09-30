import java.sql.SQLOutput;
import java.util.Scanner;

public class Self_all_practice {
    public static void main(String[] args) {


        //        Question no 1

//        division

//    int num1;
//    int num2;
//    num1 = 2;
//    num2 = 34;
//        System.out.println( num1+ num2);


//        Question no 2

//        System.out.println("this is an intellij idea it is the best intellij ideAa");

//    Question non 3

//    for (int i =0; i<=10;i++){
//        System.out.print(i);
//    }


//       Question 4
//        show even number

//        int num1;
//        num1 = 20;
//        if (num1 % 2==0)
//        {
//            System.out.println("even");
//        }
//        else {
//            System.out.println("odd");
//        }


//show even number

//        int num1;
//        num1 = 20;
//        if (num1 %2 !=0)
//        {
//            System.out.println("even");
//        }else
//        {
//            System.out.println("odd");
//        }


//        Question no 5

//        greatest of two
//        int num1, num2;
//        num1 = 29;
//        num2 = 0;
//        if(num1>num2){
//            System.out.println("num1 is greater");
//        }
//        else{
//            System.out.println("num2 is greater");
//        }


//        Question no 6

//        int a = 10;
//        int b = 7;
//        int c = b - a;
//        System.out.println(c);

//          Question no 7
//        int a = 20 * 32 +20 /2;
//        System.out.println(a);

//    Question no 8

//        int x = 10;
//        int y = 12;
//        int k = x+y/2;
//        System.out.println(k);


//        Question no 9

//        int i = 56;
//        System.out.println(++i);
//        System.out.println(++i);


//        Question no 10
//    input from user and show even and odd

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number");
//    int num = sc.nextInt();
//
//        if (num % 2 ==0)
//        {
//            System.out.println("Enter number are even number");
//        }
//        else
//        {
//            System.out.println("Enter number are odd number");
//        }


//        Question no 2
//        Greater of two number

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Any number :");
//        int num1 = sc.nextInt();
//
//        Scanner nc = new Scanner(System.in);
//        System.out.println("Enter num2 number :");
//        int num2 = nc.nextInt();
//
//        if (num1 > num2) {
//            System.out.println("Num1 is greater");
//        }
//
//        else
//
//        {
//            System.out.println("num2 is greater");
//        }
//


//        Question no 10

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number :");
//        int num1 = sc.nextInt();
//
//        Scanner fc = new Scanner(System.in);
//        System.out.println("Enter any number :");
//        int num2 = fc.nextInt();
//
//        Scanner nc = new Scanner(System.in);
//        System.out.println("Enter any number :");
//        int num3 = nc.nextInt();
//
//        if (num1>num2) {
//            if (num1 > num3) {
//                System.out.println("num1 is greater ");
//            } else {
//                System.out.println("num3 is greater ");
//            }
//        }
//        else if (num2>num3)
//        {
//            System.out.println("num2 is greater ");
//        }
//        else {
//            System.out.println("num3 is greater");
//        }


//        Question no 10
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num1 value");
//        int num1 = sc.nextInt();
//
//        System.out.println("Enter num2 value");
//        int num2 = sc.nextInt();
//
//        System.out.println("Enter num3 value");
//        int num3 = sc.nextInt();
//
//    if (num1 >num2){
//        if (num1>num3){
//            System.out.println("num1 is greater ");
//        }
//        else {
//            System.out.println("num3 is greater");
//        }
//    } else if (num2> num3) {
//        System.out.println("num2 is greater  ");
//    }else {
//        System.out.println("num3 is greater ");
//    }


//    Question no 11

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter username :");
//        String username = sc.nextLine();
//
//        System.out.println("Enter password : ");
//        String password = sc.nextLine();
//
//        if (username.equals("Admin") && password.equals("123456")) {
//            System.out.println("Welcome");
//        }else {
//            System.out.println("invalid");
//        }


//        Question no 11

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter username");
//        String username = sc.nextLine();
//
//        System.out.println("Enter password ");
//        String password = sc.nextLine();
//
//        if (username.equals("Admin") && password.equals("12345")) {
//            System.out.println("Welcome ");
//        } else {
//            System.out.println("invalid");
//        }
//

//        QUestion no 13
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("enter num1 value ");
        num1 = sc.nextInt();

        System.out.println("Enter num2 value :");
        num2 = sc.nextInt();

        System.out.println("enter operator");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;


            case '-':
                result = num1 - num2;
                System.out.println(num1 + "+" + num2 + " =" + result);
                break;


            case '/':
                result = num1 / num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;



        }


    }

    }


