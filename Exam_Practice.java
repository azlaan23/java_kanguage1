import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Exam_Practice {
    public static void main(String[] args) {
//    int num1;
//    int num2;
//    num1 =45;
//    num2 = 45;
//        System.out.println(num1 + num2);
//    }
//
//    }

//Question no 2
//        for (int i = 1; i <= 10; i= i+2) {
//            System.out.println(i);
//        }
//    }
//}

//Question no 3
//        for (int i = 1; i<=10; i++) {
//            System.out.println(i);
//        }
//    }
//}

//Question no 4

//        int num1;
//        num1 = 20;
//        if (num1 % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//    }
//}

//Question no 5
//        int num;
//        num = 20;
//        if (num % 2 != 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//    }
//}

//Question no 6
//        int num1;
//        int num2;
//        num1 = 700;
//        num2 = 89;
//        if (num1 > num2) {
//            System.out.println("num1 is greater");
//        } else {
//            System.out.println("num2 is greater");
//        }
//    }
//}

//Question no 6

//        int a = 8;
//        int b = 5 - a;
//        System.out.println(b);
//    }
//}
//        int a = 6 * 7 - 78 / 2;
//        System.out.println(a);
//    }
//}


//    Question  no 7
//        int x = 23;
//        int y = 23;
//        int k = x * y / 2;
//        System.out.println(k);
//    }
//}

//question no 8;
//        byte x = 34;
//        int y = 5;
//        short z = 34;
//        int a = y + z;
//        float b = 6.35465f + x;
//        System.out.println(b);
//    }
//}


//        Question no 8

//        byte x = 34;
//        int y = 20;
//        short z = 41;
//        int a = 56;
//        float b = 5.6768f * x;
//        System.out.println(b);
//    }
//}

//    Question no 9

//        int i = 67;
//        int y = 78;
//        int c = i++;
//        System.out.println(i++);
//        System.out.println(i);
//        System.out.println(++i);
//    }
//}

//Question no 10
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number  : ");
//        int num = sc.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println(num + ": is Even");
//        } else {
//            System.out.println(num + ": is Odd");
//        }
//    }
//}

//Question no 11

//Greater three number

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number1 : ");
//        int num1 = sc.nextInt();
//
//        System.out.println("Enter any number2 : ");
//        int num2 = sc.nextInt();
//
//        System.out.println("Enter any number3 : ");
//        int num3 = sc.nextInt();
//
//        if (num1 > num2) {
//
//
//            if (num1 > num2) {
//                System.out.println("num1 is greater");
//            } else {
//                System.out.println("num2 is greater  ");
//            }
//        else if (num2 > num3) {
//                System.out.println("num2 is greater");
//            } else {
//                System.out.println("num3 is greater");
//            }
//        }
//    }


//    Question 12

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter username :");
//        String username = sc.nextLine();
//
//        System.out.println("Enter password : ");
//        String password = sc.nextLine();
//
//        if (username.equals("Admin") && password.equals("12345")) {
//            System.out.println("Welcome");
//        } else {
//            System.out.println("invalid");
//        }
//    }
//}

//Repeat Question
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter username");
//        String username = sc.nextLine();
//
//        System.out.println("Enter password");
//        String password = sc.nextLine();
//
//        if (username.equals("Admin") && password.equals("12345")) {
//            System.out.println("Welcome");
//        } else {
//            System.out.println("invalid");
//        }
//    }
//}

//Question no 14
//        int number1, number2, result = 0;
//        Scanner sc = new Scanner(System.in);
//        char op;
//        System.out.println("Enter any number : ");
//        number1 = sc.nextInt();
//
//        System.out.println(" Enter any number");
//        number2 = sc.nextInt();
//
//        System.out.println("Enter operator");
//        op = sc.next().charAt(0);
//
//        switch (op) {
//            case '+':
//                result = number1 + number2;
//                System.out.println(number1 + "+" + number2 + "+" + result);
//                break;
//
//            case '-':
//                result = number1 - number2;
//                System.out.println(number1 + "+" + number2 + "+" + result);
//                break;
//            case '*':
//                result = number1 * number2;
//                System.out.println(number1 + "+" + number2 + "+" + result);
//                break;
//
//            case '/':
//                result = number1 / number2;
//                System.out.println(number1 + "+" + number2 + "+" + result);
//                break;
//            default:
//                System.out.println("please valid number : ");
//                break;
//
//
//        }
//
//    }
//}

//repeat Question
//        int number1, number2, result;
//        int op;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1 :");
//        number1 = sc.nextInt();
//        System.out.println("Enter number2 :");
//        number2 = sc.nextInt();
//        System.out.println("Enter operator");
//        op = sc.next().charAt(0);
//
//        switch (op) {
//            case '+':
//                result = number1 + number2;
//                System.out.println(number1 + "+" + number2 + "=" + result);
//                break;
//
//            case '-':
//                result = number1 - number2;
//                System.out.println(number1 + "+" + number2 + "=" + result);
//                break;
//
//            case '*':
//                result = number1 * number2;
//                System.out.println(number1 + "+" + number2 + "=" + result);
//                break;
//
//            case '/':
//                result = number1 / number2;
//                System.out.println(number1 + "+" + number2 + "=" + result);
//                break;
//            default:
//                System.out.println("please enter valid number");
//                break;
//
//        }
//    }
        //}

//    Question 15
//        String name, address;
//        int age;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name :");
//        name = sc.nextLine();
//
//        System.out.println("Enter address : ");
//        address = sc.nextLine();
//
//        System.out.println("Enter age : ");
//        age = sc.nextInt();
//
////        System.out.println("your name is : " + name);
////        System.out.println("your address is :" + address);
////        System.out.println("your age is : " + age);
////        or
//        System.out.println("your name is : " + name +" & your address is : "+ address + "& your age is : " + age);
//    }
//}


//Question no 16
//        Scanner sc = new Scanner(System.in);
//        int num1, num2, result;
//        System.out.println("Enter num1 :");
//        num1 = sc.nextInt();
//        System.out.println("Enter num2");
//        num2 = sc.nextInt();
//        result = num1 - num2;
//        System.out.println("your result is :" + result);
//    }
//}

//Question no 16
//create a calculator
//        Scanner sc = new Scanner(System.in);
//        int op;
//        System.out.println("Enter number1 ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter number2 : ");
//        int num2 = sc.nextInt();
//
//        System.out.println("Enter operator");
//        op = sc.next().charAt(0);
//
//        if (op == '+') {
//            System.out.println("addition of two number :" + (num1+num2));
//        } else if (op == '-') {
//            System.out.println("subtraction of two number : "+ (num1 - num2));
//        } else if (op == '*') {
//            System.out.println("multiplication of two number :"+ (num1 * num2));
//        } else if (op == '/') {
//            System.out.println("division of two number : "+ (num1/num2));
//
//        } else {
//            System.out.println("please valid number : ");
//        }
//
//    }
//}

//Question no 17
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any name ");
//        String username = sc.nextLine();
//
//        if (!username.equals("alin")) {
//            System.out.println("welcome");
//        } else {
//            System.out.println("invalid");
//
//        }
//    }
//}

//Question no. 18
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any Character");
//        char ch = sc.next().charAt(0);
//
//        switch (ch) {
//            case 'a', 'e', 'i', 'o', 'u':
//                System.out.println(": is a  vowel letter :");
//                break;
//            default:
//                System.out.println(": is a consonant letter : ");
//                break;
//        }
//    }
//
//    }

//Question no 19
//Array
//        String name[] = {"Rameez", "adil", "amir", "talha"};
//        System.out.println(name[0]);
//        for (int i = 0; i <= name.length; i++) {
//            System.out.println(name[i]);
//        }
//    }
//}

//Question no 20

//        int num [] = {23, 56, 78, 9, 86, 554};
//        System.out.println(num[0]);
//        for (int i = 0; i <= num.length; i++)
//        {
//            System.out.println(num[i]);
//        }
//    }
//}


//Question no 21
//        int age[] = {34, 45, 55, 23, 32, 23} ;
//        System.out.println("zeroth element  " + age[0]);
//        System.out.println("ist element  " + age[1]);
//        System.out.println("2th element  " + age[2]);
//        System.out.println("3rd element  " + age[3]);
//        System.out.println("4th element  " + age[4]);
//        System.out.println("5th element  " + age[5]);
//    }
//}
//question no 22

//        int age[] = {41, 32, 65, 85, 33};
//        for (int i = 0; i <= age.length; i++) {
//            System.out.println(age[i]);
//        }
//    }
//}

//Question no 23
//        int age[] = {34, 56, 12, 20};
//        for (int a : age) {
//            System.out.println(a);
//        }
//    }
//}

//Question no 24
//        int number[] ={12, 3, 45, 2, 23, 14, 1};
//        int sum = 0;
//        double average;
//
//        for (int a : number) {
//            sum += a;
//        }
//        int arrayLength = number.length;
//        average = ((double) sum / (double) arrayLength);
//        System.out.println("Sum is " +  sum);
//        System.out.println("average " + average);
    }
}

