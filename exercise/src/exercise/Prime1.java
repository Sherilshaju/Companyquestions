package exercise;
import java.util.Scanner;
public class Prime1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	if(n==1)
	{
	System.out.println("neither prime nor composite");	

	}
	int i,c=0;
	for(i=2;i<=n;i++)
	{
	if(n%i==0)
	{
		c++;
	}
	}
	
	if(c==1)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("Not prime number");
	
	}
	}
}


