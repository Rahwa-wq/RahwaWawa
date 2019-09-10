package Day08_ShortHand_Opertaor;

public class RelationalOperators {

	/*
	 * Relational Oprators returns boolean expression
	 * 
	 > : greater than 
	 >= : greater than or equal
	 < : less than
	 <= : less than or equal
	 == : equal
	 != : not equal
	 = : assign
	 ! : logical opposite 
	
	 */
	
	public static void main(String[] args) {
		
		System.out.println(10 > 9);
		
		boolean resultA =10>9;
		System.out.println(resultA);
		
		boolean resultB=10 >=9;
		System.out.println(resultB);
		
		boolean resultC = 10<=9;
		System.out.println(resultC);
		
		boolean resultD =1100< 1200;
		System.out.println(resultD);
		
		boolean resultE = 1000< 1000;
		System.out.println(resultE);
		
		boolean resultF = 1000<=1000;
		System.out.println(resultF);
		
		
// ==	
		
		boolean resultG = 19 == 19;
		System.out.println(resultG);
		
		
// !
		boolean resultH = 20!=20;
		System.out.println(resultH);
		
		
		boolean A = true == !false;
		System.out.println(A);
		
		
		
				
	}
	
}
