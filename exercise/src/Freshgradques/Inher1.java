package Freshgradques;

import java.util.Scanner;

public class Inher1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("Name");
	    String name=s.next();
	    System.out.println("Age");
	    int age=s.nextInt(); 
	    System.out.println("Gender");
	    char gender=s.next().charAt(0); 
	    System.out.println("ID Number");
	    int id=s.nextInt(); 
	    System.out.println("Major");
	    String m=s.next();
	    System.out.println("CGPA");
	    float cgpa=s.nextFloat(); 
	    System.out.println("year");
	    int year=s.nextInt(); 
	    CollegeStudent cs=new CollegeStudent();
	    cs.main(name,age,gender,id,cgpa);
	    cs.display(m,year);
	}
}
class CollegeStudent extends Student{

	public void display(String m,int year) {
		System.out.println("Major:"+m);
		System.out.println("Year:"+year);
	}

	
}
class Student{
	public void main(String name, int age, char gender, int id, float cgpa) {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("ID:"+id);
		System.out.println("CGPA:"+cgpa);
	
		
	}
	
	
	
}