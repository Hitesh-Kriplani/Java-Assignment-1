import java.util.Scanner;
public class Que1_6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("\n%d*%d=%d",n,i,n*i);
        }
    }
}
