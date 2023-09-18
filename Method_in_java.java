
import java.util.Scanner;
public class Method_in_java {
   Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Method_in_java obj = new Method_in_java();
        obj.add();
//        obj.add();
    }
    public void add(){
        System.out.println("Enter Number1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2");
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
    }
}

