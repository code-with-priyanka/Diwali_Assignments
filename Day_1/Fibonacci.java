import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
    

    Scanner sc=new Scanner(System.in);

    System.out.println("enter the no");
    int no=sc.nextInt();

    int a=0;
    int b=1;
 

    for(int i=0;i<no;i++){

        int c=a+b;
         System.out.println("febonacci series is:"+a);
        a=b;
        b=c;
       
    }
        sc.close();
    
}
}
