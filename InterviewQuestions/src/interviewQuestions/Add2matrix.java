package interviewQuestions;

import java.util.Scanner;

public class Add2matrix {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i,j;
	System.out.println("Enter the number of rows");
	int m=s.nextInt();
	System.out.println("Enter the number of Columns");
	int n=s.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];
    int c[][]=new int[m][n];
    System.out.println("Enter the elements of first Matrix");
    for(i=0;i<m;i++)
    {
    	for(j=0;j<n;j++)
        {
        	a[i][j]=s.nextInt();
        }
    	
    }
    System.out.println("Enter the elements of Second Matrix");
    for(i=0;i<m;i++)
    {
    	for(j=0;j<n;j++)
        {
        	b[i][j]=s.nextInt();
        }
    	
    }
    for(i=0;i<m;i++)
    {
    	for(j=0;j<n;j++)
        {
        	c[i][j]=a[i][j]+b[i][j];
        	System.out.print(c[i][j]+" ");
        }
    	System.out.println();
    }
    
    
	}

}
