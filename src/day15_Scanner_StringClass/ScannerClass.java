package day15_Scanner_StringClass;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
	 
		
		
		/*
		 *1. make a program that allows a person to go on vacation
          5000-10,000 is a cheap vacation
          10000-15,000 is average
          15000-20,000 is expensive
          2. ask the person to input budget
          have a statement that prints out for each one about whether it is “cheap, avg, or expensive”
          3. for cheap vacation give them the option
    1. west virginia OR Florida
       for the AVG vacation give them the option
      CANADA or MEXICO
      for the EXPENSIVE vacation JAPAN or ENGLAND
       and make the vacation “not possible ” if budget is under 5,000
		 */
		
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter amount you would like to spend");
		
		
		 int vacation = input.nextInt();
		 
		 
		 if(vacation >=5000  &&  vacation < 10000) {
			 System.out.println(" Cheap Vcation");
		 }
		 else if(vacation >10000  && vacation < 15000) {
			 System.out.println("Average Vacation");
		 }
		 else if(vacation >=15000 && vacation <= 20000) {
			 System.out.println("Expensive Vacation");
		 }
		 else {
			 System.out.println("Sorry Vcation not possible...you need to save more");
		 }
			
		 
		System.out.println();
		 
		 
		 String R=input.nextLine();
		        R=(vacation >=5000  &&  vacation < 10000)? "West Virginia OR Florida":
			    (vacation >10000  && vacation < 15000)?"Canada OR Mexico":
			    (vacation >=15000 && vacation <= 20000)? "England OR Japan"
			    		:"Invalid input";   
			    	                                                 
		 System.out.println("And your options are: "+R);
		 
		 
		 String destination=input.nextLine();
		 
		 switch(destination) {
		 
		 case "West Virginia":
			 System.out.println("blahhh");
			 break;
	     default:
				 System.out.println("Invalid Destination");
				break; 
		 }
		 
				
			
	
				
				
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
