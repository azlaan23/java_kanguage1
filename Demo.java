import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo {
    public static void main(String[] args) {
//        int result;
//        Numbers rc = new Numbers();
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter number1 : ");
//        result = rc.Natural();
//        System.out.println(result);
//
//    }
//}
//class Numbers {
//    public int Natural() {
//        int sum=0;
//        for (int i = 0; i <= 10; i++) {
//            sum=sum+i;
//        }
//        return sum;
//    }
//}
Scanner sc = new Scanner(System.in);
Numbers nc = new Numbers();
int result;
System.out.println("Enter number1 : ");
result = nc.Natural();
System.out.println(result);
    }
}
class Numbers {
    public int Natural() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }
}