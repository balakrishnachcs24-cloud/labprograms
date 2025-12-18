import java.util.*;
public class calc
{
    public static  void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = input.nextInt();
        System.out.println("Enter the value of b:");
        int b = input.nextInt();
        System.out.println("Enter the operator");
        char op = input.next().charAt(0);
        input.close();
    if(op == '+')
    {
        System.out.println("The sum is"+(a+b));
    }
    else if(op=='-')
    {
        System.out.println("The difference is"+(a-b));
    }
    else if(op=='*')
    {
        System.out.println("The product is"+(a*b));
    }
    else if(op=='/')
    {
        System.out.println("The quotient"+(a/b));
    }
    } 
}
