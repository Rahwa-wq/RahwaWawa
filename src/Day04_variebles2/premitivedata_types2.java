package Day04_variebles2;

public class premitivedata_types2 {
	/* 
	Perimitive:  byte,short,int,long,float,double,boolean,char
	
	boolean: takes either True or False boolean expressions 
	
	char: declared with in the single quote ''
	
	 */
	public static void main(String[] args) {
		
		boolean result  = true;
		boolean result2 = false;
		boolean result3 = 9<3;
		boolean result4 =1.3<2.5;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		//char:
		 
		
		char char1 ='a';
		char char2 ='3';
		char char3 ='#';
		
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		System.out.println("\n\n");
		
		// char with numbers
		char char4  = 67; //the onlytime we use '' for char is when we are declaring  single character
		System.out.println(char4);
		
		
		char char6 =123;
		char char7 ='{';
		System.out.println(char6);
		System.out.println(char7);// prints the number that has 123 from the ASCII table.
		
		
		//initializing char to other primitivies;
		char Mychar1 ='b';
				
		int MyInt   ='b'; //the number that represent b is initalized to the int 
		
		System.out.println(MyInt); //98
		
		
	//	byte MyByte =MyChar1  chars memory is 2 byte and bytes memory is one byte
		
		byte MyByte2 ='b'; // b's corrosponding number is 98		
		
		System.out.println(MyByte2);
		
		
	//	short ShortNum = MyChar1; // char memory is bigger than short
		
	short ShortNum2 ='b';
	System.out.println(ShortNum2);
	
	long LongNum1 = Mychar1; //longs memory is 8 bytes
	long LongNum ='b'; // the corresponding number is 98
			System.out.println(LongNum);
			System.out.println(LongNum1);
			
	float floatNum  = Mychar1;
	float floatNum2 ='b';
	System.out.println(floatNum2);
	System.out.println(floatNum);
	
	
	double doubleNum  = Mychar1;
	double doubleNum2 = 'b';
	System.out.println(doubleNum);
	System.out.println(doubleNum2);
	 
	
	char myCharvalue =200;
	System.out.println(myCharvalue);
	
	System.out.println("\tTmw is a great day");
	System.out.println("\\");
	System.out.println("\'Game of thrones\'");
	System.out.println("I like to read\"books\"");
		}

}
