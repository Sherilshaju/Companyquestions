package exercise;
import java.util.Scanner;
public class Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner s=new Scanner(System.in);
			  int i;
			  String a[]=new String[5];
			  for(i=0;i<5;i++)
			  {
				  a[i]=s.next();
			  }
			  for(int j=i-1;j>=0;j--)
			  {
				  System.out.println(a[j]);
			  }
			  
		  }
		

	}


