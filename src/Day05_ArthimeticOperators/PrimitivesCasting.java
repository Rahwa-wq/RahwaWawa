package Day05_ArthimeticOperators;

public class PrimitivesCasting {
	
	
	/*
	 
	 casting: converting larger primitive to smaller size 
	  datatype variablenmae = (datatype) value
	  
	  castings :Explicit and Implicit
	 
	 primitives: byte,short,int,long,float,double
	 */
 
	public static void main(String[] args) {
		 //Explicit Casting:converting the larger number to smaller size
		int a=10;
		byte b= (byte)a; // explicit casting
		
		System.out.println(b);
		
		
		double DecimalNumber = 10.5;
	    float FloatNumber= (float)DecimalNumber; // DOuble is larger than float thats why we can not assign it to float			
		
		System.out.println(FloatNumber);
		
		long LongNum= 300L;
		
		int IntNum =(int)LongNum;//we could also use short,
		
		System.out.println(IntNum);

// Implicit Casting:converting smaller size to larger size is calle implicit casting
		
		byte ByteNum=100;
		int IntNum2 =ByteNum;
		System.out.println(IntNum2);
		
		int IntNum3 =(int)ByteNum;
		System.out.println(IntNum3);
		
		
		short ShortNum=100;
		long LongNum2=ShortNum;
		  //same with:
		long LongNum3=(long)ShortNum;
		
		
		//Explicit Casting Practices:
		double LargestNumber=100.8765;
				
		byte ByteValue=(byte)LargestNumber;   //long,short,
				System.out.println(ByteValue);
				System.out.println();
				System.out.println();
				
 // NAMEING VARIABLES
				
				int num1=100 ,  num2=200 , num3=300;
	}
}
