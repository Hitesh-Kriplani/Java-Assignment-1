import java.util.Scanner;
public class Que1_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int a = sc.nextInt();
        System.out.print("Enter ending number: ");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            System.out.printf("\n%c: %d",i,i);
        }
         
        
        
    }
}