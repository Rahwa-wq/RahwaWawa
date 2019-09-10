package day14_Scanner;

public class Ternary {
public static void main(String[] args) {
	
	
	int num=0;
	
	if(true) {
		num=100;
	} else {
		num=50;
	}
	System.out.println(num);

	
	/*
	 if (condition)===>(condition)?
	 else          ===> :
	 else if(condition) :(condition)?
	 */
	int nu2=100;
	
	
	int n = (false) ? 100:50;
	System.out.println(nu2);
	System.out.println(n);
	
	
	
	String Schoolname="";
	boolean Batch12 =true;
	
	
	if(Batch12) {
		Schoolname ="Cybertek";
	}
	else {
		Schoolname="invalid";
	}
	
	
	System.out.println(Batch12 ? "Cybetek":"invalid"); 
	String BestSchool =Batch12 ? "Cybetek":"Invalid";
	System.out.println(BestSchool);
	
	
	
	double interestRate=0;
	boolean GoodCredit= true;
	
	
	 interestRate = (GoodCredit == true) ? 0.5:0.9;
	 System.out.println(interestRate);
	 
	 
	 
	 
	 byte garde=60;
	 boolean passed = (garde >=60) ? true :false;
	 System.out.println(passed);
	 
	 
	 char FinalGrade='A';
	 String Group="";
	 
	 
	Group= (FinalGrade=='A')?"Early bird":(FinalGrade=='B')?
			 "Group 1":"After Group 1";
	System.out.println(Group);
	 
	 
	Group=(FinalGrade=='A')?"Early Birds"
			:(FinalGrade=='B')?"Group 1"
			  :(FinalGrade=='C')?"Group 2"
			    :"After Group 2";
			    	System.out.println(Group);
	
			    	
			    	
			 
			   int score = 80;
			   char Finals =' ';
			    	
			    	
			    	if(score>= 80 && score <=100)
			    		Finals ='A';
			    	else if(score >=80 && score <= 89)
			    		Finals ='B';
			    	else if(score >=70 && score <=79)
			    		Finals ='C';
			    		else if (score >=60 && score <=69)
			    			Finals ='D';
			    			else if(score >=0 && score <=59)
			    				Finals ='F';
			    			else 
			    				Finals =' ';
			    	
			    	System.out.println(Finals);
			    	
			    	
			    	
			  Finals = (score >=80 && score <=100)?'A'
					  :(score >=80 && score <= 89)?'B'
					:(score >=70 && score <=79)?'C'	  
					 :(score >=60 && score <=69)?'D'
					 :(score >=0 && score <=59)?'F'
							 :' ';
			  
			  
			  
			  
			  
			  
			  
			  
			  
			 
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			    				
			    				
			    				
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
