import java.util.Scanner;
public class Que1_5 {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter input: ");
       int n = sc.nextInt();
       int p;
       int sum=0;
       
       while(n>0){
        System.out.print("\nEnter input: ");
        int r = sc.nextInt();
        if(r==0)
        {
            break;
        }
        else
        {
            sum = sum +r;
        }
        
       }
       p = sum+n;
       System.out.printf("Sum is :%d ",p);


    }
}
