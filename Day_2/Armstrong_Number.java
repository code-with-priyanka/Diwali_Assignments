import java.util.Scanner;

public class Armstrong_Number {

    private static boolean armstrong_or_not(int number) {
        int sum=0;
        int compare=number;
        while(number>0)
        {
            int num=number%10;
            sum+=(num*num*num);
            number=number/10;
        }
        if(sum==compare)
        {
            return true;
        }

        return false;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether the number is Armstrong or not");
        int number=sc.nextInt();

        if(number<=0){
            System.out.println("Number should be greater than 0");
        }else{
            boolean check=armstrong_or_not(number);
            if(check)
            {
                System.out.println("The number is Armstrong");
            }else{
                System.out.println("The number is Not-Armstrong");
            }
        }
    }

    
    
}
