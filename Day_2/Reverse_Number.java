import java.util.Scanner;

public class Reverse_Number {

    public static int number_Reverse(int number)
    {
        int reverse=0;
        while(number>0)
        {
            int num=number%10;
            reverse=reverse*10+num;
            number=number/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int number=sc.nextInt();

        if(number<=0)
        {
            System.out.println("The number should be greater than 0");
        }
        else{
            int reverse=number_Reverse(number);
            System.out.println("The Reverse Number is "+reverse);
        }
    }
}
