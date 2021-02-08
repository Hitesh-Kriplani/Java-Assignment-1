import java.util.Scanner;
public class Que1_3 {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter weight(in pounds): ");
    int wt = sc.nextInt();
    if(wt<=1 && wt>0)
      System.out.print("3.5");
    else if(wt>1 && wt<=3)
      System.out.print("5.5");
    else if(wt>3 && wt<=10)
      System.out.print("8.5");
    else if(wt>10 && wt<=49)
      System.out.print("10.5");
    else
      System.out.print("The package cannot be delivered");
  
}
    
}
