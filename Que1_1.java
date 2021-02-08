import java.util.*;
public class Que1_1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month no(1-12): ");
        int month = sc.nextInt();

        switch(month)
        {
            case 1,3,5,7,8,10:
             System.out.print("31 days");
             break;
            case 2:
             System.out.print("28 days");
             break;
            case 4,6,9,11:
             System.out.print("30 days");
             break;
        
            default:
             System.out.print("Please check your input and enter a correct integer!!");

            

            
            
             
        }
        


    }
}