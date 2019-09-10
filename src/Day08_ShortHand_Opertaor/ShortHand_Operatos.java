package Day08_ShortHand_Opertaor;

public class ShortHand_Operatos {

		/*
	+= :addition assignment
	-= :
	*=: MULTIPLICATION ASSIGNMENT 
		 */
	
	
	
	public static void main(String[] args) {
		
		
		// +=:
	// a = a+3; //12
		int a=9;  
		//a=a+3
		System.out.println(a);
		
		int b=a+=5; //12+=55==>12+5 ==>17
		System.out.println(b);
		
		
		int c=a+=b;
		// 17+=17=34;
		System.out.println(c);
		
		int d=a+=c; //a=68, d=68, c=34, b=17
		//34+34
		System.out.println(d);

		
		
	int e = (d+=b) * 2;
		//	e = (d + b) * 2
			
		// e= 68 + 17 * 2
		//	 =85*2
	//		=170
			
	System.out.println(e);////d=85, b=17, e=170;
	System.out.println(d);
	System.out.println(c);
	System.out.println(b);
	
	int f= b+=d*2;
	//b+=170
	//17+=170===>187
	System.out.println(f);
	
	int g=101;
	int h=g-=1;
	//101-1-100
	System.out.println(h);//110
			
	int i = g+=h+5;// g = 205  i = 205  h=100
	//     g+= 100+ 5
		// 205
		
		System.out.println(i);
		
		int j=h+=g % i;
		// j= 100+=205 % 205
		  //  = 100+=0
		  //  = 100	
		System.out.println(j);
		
	int k = j-=h * 2 % 5;
	  //  = 100-=100 *2 %5
		//= 100-=200
			System.out.println(j);
			System.out.println(k);
		//= 100	
			
//MULTIPLICATION
			
		int A = 100;
		A*=200;// A = A * 200
		System.out.println(A);
		
		
		int B = 100;
			B = 100/10;
//          B*=100/10 			
			
		System.out.println(B);
		
		
			
			
	
	
	}

}
