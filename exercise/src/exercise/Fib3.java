package exercise;
import java.util.Scanner;
public class Fib3 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int a=0;
	int b=1;
	int c=0;
	//System.out.printf("%d %d ",a,b);
	for(int i=3;i<=n;i++)
	{
		c=a+b;
		a=b;
		b=c;
		
	}
	System.out.println(c);

	}

}
