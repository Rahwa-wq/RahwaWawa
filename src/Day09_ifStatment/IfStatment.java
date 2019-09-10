package Day09_ifStatment;

public class IfStatment {
	
	public static void main(String[] args) {
		
		/*
		 if statments: 
		 single if statment:
		 
		 if(boolean expression){
		   some codes to run
		   }
		   
		   if block only gets executed if the condition is true
		 */
		
		
		if (true) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("tommorrow is day off");
			System.out.println("class starts on Monday");
		}
		
        int a=1000;
		
		if (a++ == 1001) {
	//     1000 == 1001 ===> false		
			a = 2000;
			System.out.println("a is increased");
		}
		
		
		int X=987654320;
		if (X%2 == 0) {
			System.out.println("it is an even number");
		}
		
		if (X%2  !=0) {
			//false
			System.out.println(X);
			System.out.println("it is an odd number");
		}
		
		
		
		
		
		
		
		
	}
	
	

}
