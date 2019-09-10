package Day07_UnaryAndShortHand;

public class Uneray_Shorthand {
	public static void main(String[] args) {
		
		/*
		 +: positive
		 -:negative
		 ++: increment
		 --: decrement
		 
		 when you have positive and negative numbers togethr it will return you positive
		 negative and negative is negative
		 */
		
		int a= 10;
		int b= -10;
		System.out.println(b);
		
		int c = +b; // +(-10)==> -10
		System.out.println(c);
		
		int d= -c; // (- 10)===> -10
		System.out.println(d);

		
		int f = - (10);
		System.out.println(f); //===> -10
		
		//INCREMENT
	//pre increment: operator is place before the variable;
		int num1= 100;
		
		System.out.println(++num1);
		
		
    // post increment
		
		int IntNum = 100;
		
		System.out.println( IntNum ++ ); //100
		System.out.println(IntNum ); //101
		
		
		int IntNum2 = IntNum++; //IntNum2 =101
		
		System.out.println(IntNum2);//===>100
		System.out.println(IntNum);//===>102
		
		
		int x = 100;
		int y = x++ -1; 
		// y = 100 - 1		
		 System.out.println(y);
		 
		 
		 //DECREMENT
		 
  // pre increment
		 
		 
		 int Z = 100;
		 System.out.println(Z);//99
		    System.out.println(--Z); //98
		 
		    
 // post decrement
		    
		    int Y= 95;
		    System.out.println(Y--); //95
		    System.out.println(Y); //94
		    
		    
		    int T=25;
		    System.out.println(++T);//26
		    System.out.println(T);
		    
		    
		    int P = 50;
		  //  P=--P + P++ + P-- + P++
		    //pre  post  post  post
		    // 49 + 49 + 50 +	49
		    System.out.println(P);
		    
		    	
		   int W = 1;
		 //  W = - W-- + W ++ / -W-- * --W;
		//      post  post   post   pre   
		//     -1    + 0  / -1  * -1
		    // -1 +0 * -1
		    //-1 + 0
		    // -1
		    System.out.println(W);
		
		    	
		    		
		    		
		    
		
		
		
	}

}
