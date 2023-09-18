import java.util.Scanner;
public class Parameters {

    //
    public static void main(String[] args) {
//        Parameters pr = new Parameters();
//        pr.add(100,200);
//    }
//
//    public void add(int x,int y)
//    {
//        int result = x+y;
//        System.out.println(result);
//    }
//}


//        Question no 2

//    int num1,num2;
//    Scanner sc = new Scanner(System.in);
//    Parameters pr = new Parameters();   // pr is a object.
//    System.out.println("Enter Number1");
//    num1 = sc.nextInt();
//    System.out.println("Enter Number1");
//    num2 = sc.nextInt();
//     pr.add(num1,num2);
//      }
//
//public void add(int x,int y)   //x and y are variable
//        {
//        int result = x+y;
//        System.out.println(result);
//        }
//        }


//    Question no 3   : Repeated Question

//        Parameters pr = new Parameters();
//        pr.add(300, 400);
//    }
//
//    public void add(int x, int y) {
//        int result = x + y;
//        System.out.println(result);
//    }
//}


//Question 5 repeated Question
//        Parameters pr = new Parameters();
//        pr.odd(400,500);
//    }
//
//
//    public void odd(int a , int b ) {
//    int result = a+b;
//        System.out.println(result);
//    }
//}


//Question 5  repeated

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        Parameters pr = new Parameters();
        System.out.println("Enter any number : ");
        num1 = sc.nextInt();
        System.out.println("Enter any second number : ");
        num2 = sc.nextInt();
        pr.add(num1,num2);
    }

    public void add(int x, int y) {
        System.out.println("Entered number are : ");
        int result = x + y;
        System.out.println(result);
    }
}