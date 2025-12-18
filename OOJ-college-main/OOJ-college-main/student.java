import java.util.*;
public class student 
{
    String usn, name;
    int credits[],marks[],numsub,numcreds;
    int GP=0;
    int sgpa=0;
    int totalCredits=0;
    public void accept()
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the usn");
       usn = input.nextLine();
       System.out.println("Enter the name");
       name = input.nextLine();
       System.out.println("Enter the no of subjects");
       numsub = input.nextInt();
       System.out.println("Enter the no of credits");
       numcreds = input.nextInt();
       System.out.println("Enter the marks");
       for (int i = 0; i < numsub; i++)
        { 
            marks[i]=input.nextInt();
        }
        System.out.println("Enter the creds");
       for (int i = 0; i < numcreds; i++)
        { 
            credits[i]=input.nextInt();
            totalCredits += credits[i];
        }
        input.close();
    }
    public void calculate()
    {
        for (int i = 0; i < numsub; i++)
        { 
         if(marks[i]>=90)
         {
            GP+=10*credits[i];
         }
         else if(marks[i]>=80)
         {
            GP+=9*credits[i];
         }
         else if(marks[i]>=70)
         {
            GP+=8*credits[i];
         }
         else if(marks[i]>=60)
         {
            GP+=7*credits[i];
         }
         else if(marks[i]>=50)
         {
            GP+=6*credits[i];
         }
        }
        sgpa=GP/totalCredits;
    }
    public void display()
    {
        System.out.println("USN:"+usn);
        System.out.println("name:"+name);
        System.out.println("SGPA"+sgpa);
    }
    public static void main(String[] args)
    {
         marks = new int[numsub];
        credits = new int[numsub];
         student obj = new student();
         obj.accept();
         obj.calculate();
         obj.display();
    }
}
