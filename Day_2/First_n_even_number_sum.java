import java.util.Scanner;

public class First_n_even_number_sum{

    public static int[] first_N_Even_Number(int number)
    {
        int[] arr=new int[number];

        int count=0;
        for(int i=1;i<=number;i++)
        {
            if(i%2==0)
            {
                arr[count]=i;
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int sum=0;
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if(number <=0 )
        {
            System.out.println("Number should be greater than 0");
        }else{
            int[] arr=first_N_Even_Number(number);


        System.out.println("The Even numbers are\n");
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]!=0)
           {
             System.out.print("---> "+arr[i]);
             sum=sum+arr[i];
           }
        }

        System.out.println("\nThe sum of the First N Natural Even number is----> "+sum);
        }
        
    }
}