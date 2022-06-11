import java.util.Scanner;

public class student
{
    public static void main(String args[])
    {
        String name;
        int roll,per;
        int sub1,sub2,sub3,sub4,sub5;
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter your name ");
        name=abc.next();
        System.out.println("Enter your Roll no ");
        roll=abc.nextInt();
        System.out.println("Enter Hindi marks ");
        sub1 = abc.nextInt();
        System.out.println("Enter english marks ");
        sub2 = abc.nextInt();
        System.out.println("Enter math marks ");
        sub3 = abc.nextInt();
        System.out.println("Enter pol. science marks ");
        sub4 = abc.nextInt();
        System.out.println("Enter geo. marks ");
        sub5 = abc.nextInt();
        
        per=((sub1+sub2+sub3+sub4+sub5)*100)/500;
        System.out.println("The percentage of 5 subject is = "+per);

        



    }
}