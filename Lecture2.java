import java.util.Scanner;
public class Lecture2 {
    public static void main(String[] args) {
//        String name,address;
//        int age;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Name");
//        name = sc.nextLine();
//        System.out.println("Enter Address");
//        address = sc.nextLine();
//        System.out.println("Enter Age");
//        age = sc.nextInt();
//        System.out.println(name+" "+address+" "+age);




        Scanner sc = new Scanner(System.in);
        int num1,num2,result;
        System.out.println("Enter Number1");
        num1 = sc.nextInt();
        System.out.println("Enter Number2");
        num2 = sc.nextInt();
        result = num1+num2;
        System.out.println("Addition of two numbers is "+result);
    }
}
