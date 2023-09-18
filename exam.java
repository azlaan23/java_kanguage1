import java.util.Scanner;
public class exam {
    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = reader.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = reader.nextInt();


        System.out.println("Enter 3rd number");
        int num3 = reader.nextInt();

        System.out.println("Enter 4th number");
        int num4 = reader.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    System.out.println("num1 is greater");
                } else {
                    System.out.println("num4 is greater");
                }
            }

            else if (num3 > num4) {
                    System.out.println("num3 is greater");
                } else {
                    System.out.println("num4 is greater");
                }
            }
        else if (num2 > num3) {
            if (num2 > num4) {
                System.out.println("num2 is greater");
            } else {
                System.out.println("num4 is greater");
            }
        }
    else if(num3>num4)
            {
                System.out.println("num3 is greater");
            }
    else {
            System.out.println("num4 is greater");
        }


    }
}





//        Question 2 vowel and consonant

//Scanner sc = new Scanner(System.in);
//System.out.println("Enter Letter");
//char ch = sc.next().charAt(0);
//
//
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//        {
//            System.out.println(ch + ": is a vowel ");
//        }
//        else
//        {
//            System.out.println(ch + ":is a consonant ");
//        }
//
//
//    }
//}






//Question 3 even and odd


//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter any number : ");
//        int num1 = reader.nextInt();
//
//        if (num1 % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//
//        }
//
//    }
//        }































































































