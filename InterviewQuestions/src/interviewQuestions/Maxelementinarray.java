package interviewQuestions;

import java.util.Scanner;

public class Maxelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	      int m=0;
	      System.out.println("Enter the size of an array");
	      int n=s.nextInt();
	      int[] a=new int[n];
	      System.out.println("Enter the elements of the array");
	      for(int i=0;i<n;i++)
	      {
	           a[i]=s.nextInt();
	        
	      }
	      for(int i=0;i<n;i++)
	      {
	        if(a[i]>=m)
	        {
	          m=a[i];
	        }
	      }
	      System.out.printf("%d is the maximum element in the array",m);
	    }
	}
	


