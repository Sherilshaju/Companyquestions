package exercise;
import java.util.Scanner;
public class Prime2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int b=s.nextInt();
		int i,j,f=0;
		
		for(i=a;i<=b;i++)
		{
			for(j=i;j<=b;j++)
			{
			if(j%i==0)
			{
				f=1;
				break;
			}
			}
		
		
		if(f==1)
		{
			System.out.println(i);
		}
		
		}
	}
	}


