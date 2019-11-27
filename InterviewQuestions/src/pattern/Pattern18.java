package pattern;
import java.util.Scanner;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int i,j,k,p;
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    for(i=1;i<=n;i++)
	    {
	    	for(j=1;j<=i;j++)
	    	{
	    		System.out.print("C");
	    	}
	    	for(k=1;k<=i;k++)
	    	{
	    		System.out.print("S");
	    	}
	    	for(p=1;p<=i;p++)
	    	{
	    		System.out.print("K");
	    	}
	    	System.out.println();
	    }
	    
	    }
	}


