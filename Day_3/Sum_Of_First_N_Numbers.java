import java.util.Scanner;

public class Sum_Of_First_N_Numbers {

	
	public static int sum(int number)
	{
		int sum=0;
		while(number!=0)
		{
			int lastDigit=number%10;
			sum=sum+(lastDigit);
			number=number/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		
		int sum=sum(number);
		System.out.println("The sum is "+sum);

	}

}
