package interviewQuestions;
import java.util.Scanner;
public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		int i;
		String rev="";
		String str=s.next();
		int l=str.length();
		for(i=l-1;i>=0;i--)
		{
		rev=rev+str.charAt(i);
		
		}
		System.out.println(rev);

	}

}
