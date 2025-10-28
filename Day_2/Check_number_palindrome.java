import java.util.Scanner;

public class Check_number_palindrome{

    public static boolean number_palindrome(String number,int num)
    {
        int num2=0;
        int compare=num;
        for(int i=1;i<=number.length();i++)
        {
            int a=num%10;
            num2=num2*10+a;
            num=num/10;
        }
        if(num2==compare)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        String number=sc.next();
        int num=Integer.parseInt(number);

        if(num<=0)
        {
            System.out.println("The number should be greater than 0");
        }else{
            boolean check=number_palindrome(number,num);
            if(check)
            {
                System.out.println("Enter the number is palindrome");
            }
            else{
                System.out.println("Enter the number is not-palindrome");
            }
        }
    }
}