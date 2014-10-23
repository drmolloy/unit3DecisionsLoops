import java.util.Scanner;
public class LeapYear
{
     public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = s.nextInt();
        System.out.println("Enter the second number");
        int second = s.nextInt();
        System.out.println("Enter the third number");
        int third = s.nextInt();
        if (first > second && second > third)
        {
            System.out.println("They are decreasing");
        }
        else   if (first < second && second < third)
        {
            System.out.println("They are increasing");
        }
        else
        {
            System.out.println("Neither");
        }
    }
}