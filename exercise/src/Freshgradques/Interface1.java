package Freshgradques;

import java.util.Scanner;

public class Interface1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Account a=new Account();
    System.out.println("1.Current Account\n2.Savings Account");
    int ch=s.nextInt();
    Currentaccount ca=new Currentaccount();
    Savingsaccount sa=new Savingsaccount();
    System.out.println("Name");
    String name=s.next();
    System.out.println("Account Number");
    String acc=s.next();
    System.out.println("Account Balance");
    int bal=s.nextInt();
    System.out.println("Enter the Start Date(yyyy-mm-dd)");
    String d=s.next();
    System.out.println("Enter the no.of years");
    int yrs=s.nextInt();
    switch(ch) {
    case 1:
    	ca.maintamount(yrs);
    	break;
    case 2:
    	sa.maintamount(yrs);
    	break;
    default:
    		System.out.println("Invalid input");
    	
    }
	}

}
interface maintanancecharge{
	public void maintamount(int yrs);
	
}
class Account{
	
}
class Currentaccount extends Account implements maintanancecharge{

	public void maintamount(int yrs) {
		double m=(100*yrs)+200;
		System.out.println(m);
	
		
	}
	
}
class Savingsaccount extends Account implements maintanancecharge {

	public void maintamount(int yrs) {
		
		double m=(100*yrs)+50;
		System.out.println(m);	
	}
}


