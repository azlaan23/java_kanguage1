//package ATMMachine;
//
//import javax.security.sasl.SaslClient;
//import java.util.Scanner;
//import java.util.stream.BaseStream;
//
//class ATM {
//    float Balance;
//    int PIN = 1234;
//
//    public void checkpin() {
//        System.out.println("Enter your pin :");
//        Scanner sc = new Scanner(System.in);
//        int enteredpin = sc.nextInt();
//        if (enteredpin == PIN) {
//            menu();
//        } else {
//            System.out.println("Enter a valid pin");
//        }
//    }
//
//    public void menu() {
//        System.out.println("Enter your Choice");
//        System.out.println("1 . Check A/C Balance");
//        System.out.println("2. Withdraw Money ");
//        System.out.println("3. Deposit Money");
//        System.out.println("4. EXIT");
//
//        Scanner sc = new Scanner(System.in);
//        int opt = sc.nextInt();
//
//        if (opt == 1) {
//            checkBalance();
//        } else if (opt == 2) {
//            withdrawmoney();
//        } else if (opt == 3) {
//            depositMoney();
//        } else if (opt == 4) {
//            return;
//        } else {
//            System.out.println("please enter valid number ");
//        }
//    }
//
//    public void checkBalance
//
//    {
//        System.out.println("balance " + Balance);
//        menu();
//    }
//
//    public void withdrawMoney
//
//    {
//        System.out.println("ENter ammount to with draw : ");
//        Scanner sc = new Scanner(Syttem.in);
//        float amount = sc.nextInt();
//        if (amount > Balance) {
//            System.out.println("Insufficient Balance");
//
//        }
//        esle{
//        Balance = Balance - amount;
//        System.out.println("with Draw Successful");
//    }
//
//    menu();
//
//      }
//      public void depositMoney(){
//          System.out.println("Enter the Amount");
// Scanner sc = new Scanner(System.in);
// float amount = sc.nextInt();
//Balance = Balance +amount;
//
//
//   }
//
//
//
//public class ATM_machine {
//    public static void main(String[] args) {
//
//    }
//}
//
//        }