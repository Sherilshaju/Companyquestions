package exercise;

import java.util.Scanner;

public class Assessmentnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=s.nextLine();
		String str=str1.toUpperCase();
		int freq[]=new int[str.length()];
		char c[]=str.toCharArray();
		int i;int j;
		for(i=0;i<c.length;i++)
		{
			freq[i]=1;
			for(j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					freq[i]++;
					c[j]='0';
				}
				
			}
		}
		for(i=0;i<freq.length;i++)
		{
			if(c[i]!='0'&& c[i]!=' ')
			{
				System.out.println(c[i]+"-"+freq[i]);
			}
			}
		}

	



		  


	}


