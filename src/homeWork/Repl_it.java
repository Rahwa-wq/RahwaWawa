package homeWork;
import java.util.Scanner;
public class Repl_it {
	public static void main(String[] args) {

		
		int first= 345565;
		int second=23423;
		
		System.out.println("first is"+first+"second"+second);
		
		int lan1=55;
		int lan2=66;
		
		System.out.println("I will learn "+lan1+"  and  "+lan2+"  at CybertekSchool ");
		
		
		
		
		
		
		//Question 
		/*
		 an automated test also needs a way to grade students.
		
		in this assignment you will get a grade int and using ifs output if its a passing grade or failure.

		if grade is bigger then 90 output "excellent" 

		if the grade is bigger then 70 and smaller then 90 output "good"

		if grade is bigger then 60 and smaller then 70 output "pass"

		if grade is smaller then 60 output "fail"

		hint: && is the operator for and in java.
		*/
		
		
		Scanner input = new Scanner(System.in);
		int Grade;
		
		System.out.println("Enter Grade");
	    Grade = input.nextInt();
	    
	    
	    if(Grade > 90) {
	    	System.out.println("Excellent");
	    }
	    else if(Grade > 70 &&  Grade < 90) {
	    	System.out.println("Good");
	    }
	    else if(Grade > 60   &&  Grade < 70) {
	    	System.out.println("Pass");
	    }
	    else if(Grade < 60) {
	    	System.out.println("Fail");
	    }
	   
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}













  }

