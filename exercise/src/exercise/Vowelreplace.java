package exercise;

import java.util.Scanner;

public class Vowelreplace {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String Str=s.next();
		int l=Str.length();
		char[] c=new char[l];
		
	int i;
		for(i=0;i<l;i++)
		{
			char str1=Str.charAt[i];
			if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'||c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				Str=Str.replaceAll((String)c[i], "$");
			}
	 }
		System.out.println(Str);

	}

}
