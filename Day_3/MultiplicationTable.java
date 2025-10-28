import java.util.Scanner;

public class MultiplicationTable {
	
	public static void table(int number) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+" * "+i+" = "+(number*i));
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to Print the Table");
		int number=sc.nextInt();
		
		table(number);
	}

}
