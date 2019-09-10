package homeWork;
import java.util.Scanner;
public class Loops {
 
	public static void main(String[] args) {

		/* i is 25
		   i is 24
		   i is 25
		   i is neither 25 or 24
		 */
		int i=26;
		
		
		if (i==25) {
			System.out.println("Print i is "+i);
		}
		else if(i==24) {
			System.out.println("print i is"+i);
		}
		else {
			System.out.println("invalid");
		}
		
		//Question 2
		  
		int number =5;
		
		if(number < 10) {
			number =number+10;
		}
		number++;
		System.out.println(number);
		
		
		//Question 3 
		
		Scanner scan =new Scanner(System.in); 
		
		System.out.println("Enter Number1: ");
		int number1 = scan.nextInt();
		
		System.out.println("Enter Number2: ");
		int number2 = scan.nextInt();
		
		
		System.out.println("Choices Available Are");
		System.out.println("1- Add");
		System.out.println("2- Subtract");
		System.out.println("3- Divide");
		System.out.println("4- Multiply");
		
		System.out.print("Enter Choice: ");
		int choice =scan.nextInt();
		
		
		System.out.println("Your Choices Are");
		System.out.println("Number1 "+number1);
		System.out.println("Number2 "+number2);
		System.out.println("Choice "+choice);
		
		
  if(choice==1) {
	System.out.println("Result "+(number1 + number2));
		}
  else if(choice==2) {
	  System.out.println("Result "+(number1 - number2));
  }
  
  else if(choice==3) {
	  System.out.println("Result "+(number1 / number2));
  }
  else {
	  System.out.println("Result "+(number1 * number2));
  }
  
  




		
	
			
			
		
  Scanner s = new Scanner(System.in);
  
  
  int n1 = s.nextInt();
  int n2 = s.nextInt();
  int n3 = s.nextInt();
  
  //your code here


 if(n1 > n2  && n1 > n3){
   System.out.println("n1 is bigger");
 }
 else if (n2 > n1 && n2>n3){
  System.out.println("n1 is bigger"); 
 }
 else {
   System.out.println("n3 is bigger");
 }
	
	
	
	
	
	
	
	} 
	
		
			

		
		

		
		
	}


