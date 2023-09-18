import java.util.Scanner;
public class Lecture_4 {
    public static void main (String[] args)
    {
        String name;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Any Name");
//        name = sc.nextLine();
//        if(!name.equals("alim"))
//        {
//            System.out.println("welcome");
//        }
//        else
//        {
//            System.out.println("not welcome");
//        }

        char ch;
        System.out.println("Enter Any Character");
        ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'a', 'e','o','i','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }


    }
}
