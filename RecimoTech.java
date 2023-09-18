import java.util.Scanner;

public class RecimoTech {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        RecimoTech rc = new RecimoTech();
        System.out.println("enter any number : ");
       num1 = sc.nextInt();
        System.out.println("enter any number : ");
        num2 = sc.nextInt();
        System.out.println("Enter any operator");
        char ch = sc.next().charAt(0);
        if (ch=='+'){
            rc.sum(num1,num2);
        } else if (ch=='-'){
            rc.sub(num1,num2);
        } else if (ch=='*'){
            rc.multi(num1,num2);

        } else if (ch=='/'){
            rc.subs(num1,num2);
        }
        else {
            System.out.println("please enter valid number");
        }
    }


    public void sum(int x, int y){
        System.out.println(x+y);
    }

    public void sub(int x, int y){
        System.out.println(x-y);
    }

    public void multi(int x, int y){
        System.out.println(x*y);
    }


    public void subs(int x, int y){
        System.out.println(x/y);
    }
}
