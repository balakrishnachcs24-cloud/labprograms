import java.util.*;
public class quad
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = input.nextInt();
        System.out.println("Enter the value of b:");
        int b = input.nextInt();
        System.out.println("Enter the value of c");
        int c = input.nextInt();
        input.close();
        if(a==0)
        {
            System.out.println("It is not a quadratic equation");
        }
        else
        {
            double d = (b*b) - (4*a*c);
            if(d>0)
            {
                double r1 = (-b + Math.sqrt(d))/(2*a);
                double r2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("Two real and distinct roots" + r1 +"and" + r2 );
            }
            if(d==0)
            {
                double r = (-b + Math.sqrt(d))/(2*a);
                System.out.println("Two real and equal roots" + r +"and" + r );
            }
            if(d<0)
            {
                System.out.println("The roots are complex and imaginary");
            }
        }
    }
}

