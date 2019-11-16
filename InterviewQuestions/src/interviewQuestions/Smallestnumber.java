package interviewQuestions;

import java.util.Scanner;

public class Smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	     
	      System.out.println("Enter the size");
	      int n=s.nextInt();
	      int[] a=new int[n];
	      int m=a[0];
	      for(int i=0;i<n;i++)
	      {
	           a[i]=s.nextInt();
	        
	      }
	      for(int i=0;i<n;i++)
	      {
	        m=Math.min(m, a[i]);
	      }
	      System.out.printf("%d is the minimum element in the array",m);
	    }
	}

