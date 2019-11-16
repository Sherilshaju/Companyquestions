package interviewQuestions;
import java.util.Scanner;
public class Armstrongnew {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=s.nextInt();
    int a=n;
    int b=n;
    int c=0;
    double sum=0;
    while(a!=0)
    {
    	
    	c++;
    	a=a/10;
    	
    }
    while(n!=0)
    {
    	int r=n%10;
    	sum=sum+Math.pow(r, c);
    	n=n/10;
    	
    }
    if(b==sum)
    {
    	System.out.println("Armstrong number");
    }
    else
    {
    	System.out.println("Not an Armstrong number");
    }
	}

}
