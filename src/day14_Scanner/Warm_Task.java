package day14_Scanner;

public class Warm_Task {
	
	public static void main(String[] args) {
		/* 
		 1.write a program that can display the days
		       if today is monday or tuesday :
		       Java class days
		       
		    if the days is Thursaday or Friday
		    Selleniuem class days 
		    
		      if days is Wednesday or 
		 */
		
		
		String day="Tuesday";
		
		switch(day) {
		
		      case "Monday":
		        System.out.println("Java class ");
		          break;
		      case "Tuesday":
		      System.out.println("Java class ");
		      break;
		      
		      case "Wednesday":
		      System.out.println("SQL class");
		      break;
		      
		      case "Tursday":
		      System.out.println("Selenium");
		      break;
		      case "Friday":
		    	  System.out.println("Selenium");
		    	  break;
		      case "Saturday":
		    	  System.out.println("SQL");
		    	  break;
		    	  
		    	  default:
		    		  System.out.println("Day off");
		 }
	
	// second method
		
		
		switch(day) {
		case"Monday":
		case "Tuesday":
			System.out.println("Java class");
		break;
			
		case"Wednsday":	
		case"Saturday":
			System.out.println("SQL class");
		break;
			
		case"Thursday":
		case"Frieday":
			System.out.println("Selenium");
		break;
		default:
			System.out.println("Day off");
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
		
		
		
		
		
	}


