import java.util.Scanner;
public class Que1_4 {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("\nEnter edge1: ");
       float a = sc.nextFloat();
       System.out.print("\nEnter edge2: ");
       float b = sc.nextFloat();
       System.out.print("\nEnter edge3: ");
       float c = sc.nextFloat();
       if(a+b>=c&&b+c>a&&a+c>b)
       {
           System.out.printf("\nPerimeter of sides %f,%f and %f is: %f",a,b,c,a+b+c);
       }
       else{
           System.out.printf("\nInvalid input!");
       }
    }
}
