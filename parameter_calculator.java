import java.util.Scanner;

public class parameter_calculator {
    public static void main(String[] args) {
//        int num1,num2;
//
//        Scanner sc = new Scanner(System.in);
//        parameter_calculator pr = new parameter_calculator();
//        System.out.println("Enter any number : ");
//       num1 = sc.nextInt();
//
//        System.out.println("Enter any number : ");
//       num2 = sc.nextInt();
//      int op;
//       System.out.println("Enter any operator");
//       char ch = sc.next().charAt(0);
//        if(ch=='+')
//        {
//            pr.add(num1,num2);
//        }
//        else if (ch== '*'){
//           pr.mult(num1,num2);
//        }
//
//        else if (ch == '-'){
//            pr.sub(num1,num2);
//        }
//        else if (ch == '/'){
//            pr.subs(num1,num2);
//        }
//
//      else {
//            System.out.println("please enter valid operate");
//        }
//    }
//    public void add(int x , int y )
//    {
//            System.out.println(x+y);
//
//    }
//    public void mult(int x , int y )
//    {
//        System.out.println(x+y);
//
//    }
//
//    public void sub(int x , int y )
//    {
//        System.out.println(x-y);
//
//    }
//
//    public void subs(int x , int y )
//    {
//        System.out.println(x/y);
//
//    }
//
//}


//  same  Question
        Scanner sc = new Scanner(System.in);
        parameter_calculator pr = new parameter_calculator();
        System.out.println("Enter any number1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter any number2 :");
        int num2 = sc.nextInt();

        System.out.println("enter any operator");
        char ch = sc.next().charAt(0);

        if (ch =='+'){
            pr.add(num1,num2);
        } else if (ch =='-') {
            pr.mult(num1,num2);
        } else if (ch =='*') {
            pr.sub(num1,num2);
        } else if (ch == '/') {
            pr.subs(num1,num2);
        }
        else{
            System.out.println("enter valid operator");
        }

    }
    public void add(int x , int y){
        System.out.println(x+y);
    }

    public void mult(int x , int y){
        System.out.println(x*y);
    }

    public void sub(int x , int y){
        System.out.println(x-y);
    }

    public void subs(int x , int y){
        System.out.println(x/y);
    }
}
