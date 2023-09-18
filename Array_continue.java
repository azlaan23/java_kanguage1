import java.util.Scanner;

public class Array_continue {
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter Number1");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered elements are:");
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


}