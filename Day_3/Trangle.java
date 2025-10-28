import java.util.Scanner;

public class Trangle {
	
	
	public static void pattern1(int row)
	{
		System.out.println("The First Pattern");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	
	
	public static void pattern2(int row)
	{
		System.out.println("The Second Pattern");
		for(int i=1;i<=row;i++)
		{
			for(int j= row - i;j > 0;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println("");
		}
	}
	

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		
		pattern1(row);
		
		pattern2(row);

	}

}
