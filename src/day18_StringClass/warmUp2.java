package day18_StringClass;
import java.util.Scanner;
public class warmUp2 {
	public static void main(String[] args) {
		/*
		 enter your first name
		 mUHTar
		 enter your last name
		 cYBerTek
		 
		 output:
		   Muhtar Cybertek
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName=scan.nextLine();
		// mUhtar
		firstName=firstName.substring(0,1).toUpperCase()
		           +firstName.substring(1).toLowerCase();
		System.out.println(firstName);
		
		
		 System.out.println("Enter your last name");
	        String lastName = scan.nextLine();
	        
	        lastName = lastName.substring(0,1).toUpperCase()
	                    + lastName.substring(1).toLowerCase();
	        
	        String FullName = firstName+" "+lastName;
	        System.out.println(FullName);

		
		
		
		
		
		
		
		
	}

}
