import java.util.Scanner;
public class Collage {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        Calculator cal = new Calculator();
        System.out.println("Enter Number1");
        int num1 = ac.nextInt();
        System.out.println("Enter Number2");
        int num2 = ac.nextInt();
        System.out.println("Enter operator");
        char op = ac.next().charAt(0);
        if(op=='+')
        {
            cal.add(num1,num2);
        } else if (op =='-') {
            cal.sub(num1,num2);
        }
        else if (op =='*') {
            cal.mult(num1,num2);
        }
        else if (op =='/') {
            cal.div(num1,num2);
        }
        else
        {
            System.out.println("please enter valid operator");
        }
    }
}
class Calculator{
    public void add(int x,int y)
    {
        System.out.println("addition of two numbers is"+(x+y));
    }
    public void sub(int x,int y)
    {
        System.out.println("subtraction of two numbers is"+(x-y));
    }
    public void mult(int x,int y)
    {
        System.out.println("multiplication of two numbers is"+(x*y));
    }
    public void div(int x,int y)
    {
        System.out.println("division of two numbers is"+(x/y));
    }
}

