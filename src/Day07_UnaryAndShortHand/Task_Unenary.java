package Day07_UnaryAndShortHand;

public class Task_Unenary {
	
	public static void main(String[] args) {
		
//Question 1
		
		int X = 2;
		int Y = X++; // Y = 2
		
		System.out.println(Y);
		
		
		
//Question 2
	 int x = 2;
	 System.out.println(x++); //x = 2
	 System.out.println(x); // x = 3
	 
	 
//Question 3
	 int x1 = 2;
	 
	 System.out.println(--x1);
	 

//Question 4
	 
	 int X1 = 8;
	 int Y1 = X1--;//8
	 
	 System.out.println(Y1);
	 System.out.println(X1);
	 
	 
/*
 TASK 2
 
write a java program that converts gallons to liters
        1 gallon = 3.785 liters;
        
        
 */
	 
	 int gallon = 100;
	 double liters = gallon * 3785; // converts gallons to liters
	 
	 System.out.println(gallon + " gallon equal to " + liters + " liters");
	 
	 
	//Question 2
	 //write a java program that converts liters to gallons
	 // 1 gallon = 3.785
	 
	 double L =1;
	 double G =L / 3.785;
	 System.out.println( L + " liters equal to "+ G + " gallons");
	 
	 
	 
	 
		
	}

}
