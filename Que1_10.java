import java.util.Scanner;
public class Que1_10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int alpha = 65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)alpha+" ");
                alpha++;
            }
            System.out.println();

        }
    }
    
}
