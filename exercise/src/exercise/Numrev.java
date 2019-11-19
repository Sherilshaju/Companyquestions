package exercise;
import java.util.Scanner;
public class Numrev {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int a=n;
	int r,rev=0;
	while(n!=0)
	{
	r=n%10;
	rev=(rev*10)+r;
	n=n/10;
	}
	//System.out.println(rev);
if(rev==a)
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not Palindrome");
}
	
	}

}
