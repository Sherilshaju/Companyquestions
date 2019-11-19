package exercise;
import java.util.Scanner;
public class Stringrev {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	//int a[]=new int[10];
    String a=s.next();
    int l=a.length();
   String rev="";
   String a1=a;
   for(int i=l-1;i>=0;i--)
   {
	   rev=rev+a.charAt(i);
   }
   if(a1.equals(rev))
   {
	   System.out.println("Palindrome");
   }
   else
   {
	   System.out.println("Not Palindrome"); 
   }
    
   
	}

}
