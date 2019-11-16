package interviewQuestions;
import java.util.Scanner;
public class Sumofprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=s.nextInt();
		int i,c=2;
		for(i=2;i<n;i++)
		{
		if(i%2!=0)
		{
			c=c+i;
		}
		}
		
			System.out.println(c);

	}

	}


