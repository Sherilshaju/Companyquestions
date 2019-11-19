package exercise;
import java.util.Scanner;
public class Armstrong1 {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		int n=s.nextInt();
		int a=n;
		int c=n;
		int r = 0;
		int count=0;
		double sum=0;
		while(c!=0)
		{
			count++;
			c=c/10;
		}
		while(n!=0)
		{
		r=n%10;
		sum=sum+Math.pow(r, count);
		n=n/10;
		
		}
		//sum=sum+Math.pow(r, c);
		if(a==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
		

	}

}
