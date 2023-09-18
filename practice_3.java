import java.util.Scanner;

public class practice_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();

//        we can use of (.equals) to instant to (==)

        if (username.equals("Admin") && password.equals("12345")) {
            System.out.println("welcome");
        } else {
            System.out.println("invalid");
        }
    }
}





































































































