package day13_QuizReview;

public class SwitchStatments {

	
	public static void main(String[] args) {
		
		int num= 5;
		
		switch(num) {
		
		case 7:
			System.out.println("Sunday");
			break; //used for exiting statement after the case is executed
			      // case closed or case dismissed 
			
			default:
				System.out.println("Invalid Entry");
				break;
				
			case 5: 
				System.out.println("Friday");
				break;
		}
		
		String days="Tuesday";
		
		switch (days) {
	
		
		case "Monday":
		System.out.println("Monday is fun day");
		
		
		
		case "Tuesday":
			System.out.println("Tuesday is great day");
			break;
			
		case "Wednesday":
			System.out.println("Wednesday is a day off");
			break;
			
		default:	
			System.out.println("Invalid");
			
		}
		
		// data types that are not accepted
		
		long N1=10;
		//switch (N1){}
		System.out.println(N1);
		
		float N2=100;//means 100.0f
		//switch(N2) {}
		System.out.println(N2);
		
		double N3=10;
		//switch(N3) {}
		System.out.println(N3);
		
		boolean N4=true;
	//switch (N4){}
		System.out.println(N4);
		
		char  ch='A';// this can be accepted
		switch(ch) {}
	
		
		
		//or logic
		char grade ='B';
		if(grade =='A' || grade=='B') {
			System.out.println("PAssed the exam");
		}else {
			System.out.println("Failed");
		}
		
		switch (grade) {
		case 'A':
		case 'B':
			System.out.println("passed the exam");
			break;
			
			default:
				System.out.println("failed the exam");
		}
		
		String US="USA";
		if(US=="USA" || US=="America") {
			System.out.println("America");
		}else {
			System.out.println("Not America");
		}
		switch(US) {
		case "US":
		case "USA":
		case"America":
			System.out.println("America");
			break;
			
			default:
				System.out.println("Not America");
				break;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
