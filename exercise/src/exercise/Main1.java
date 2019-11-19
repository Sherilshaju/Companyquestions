package exercise;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 
		   String title=sc.nextLine();
		  MyMovie film=new MyMovie();
		    film.setTitle(title);
		  }
		}

		abstract class Movie{
			String title;
		  abstract void setTitle(String title);
		  public void getTitle(){
			  System.out.println("The title is: "+film.getTitle()); 
			
		  }
		
	}
		class MyMovie extends Movie{
			void setTitle(String title) {
				//System.out.println("The title is: "+getTitle());	
			}
			
		}


