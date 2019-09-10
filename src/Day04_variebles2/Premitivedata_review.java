package Day04_variebles2;

public class Premitivedata_review {
	public static void main(String[] args) {
		
		byte bNum= 127;
		System.out.println(bNum);
          // byte range : -128 to 127 (it can not take any decimal numbers)
		
		short sNum2= 1000;
		System.out.println(sNum2);
		  // short num= 126.5;   // short only takes whole numbers
		 
		
		// practice 
		/* 
		 8,  9,  #,  @,  8.5,    5.5F,
		 128,  40000,  9>10,  true.false
		 
		 
		
		 */
		// 8 :
		byte Bnum=8;
		short Snum=8;
		int Inum=8;
		long Lnum=8l;
		float Fnum=8f;
		double Dnum=8;
		char character='8';
		System.out.println(Bnum);//8
		System.out.println(Snum);//8
		System.out.println(Lnum);//8
		System.out.println(Inum);//8
		System.out.println("======================");
		
		System.out.println(Fnum);//8.00
		System.out.println(Dnum);//8.00
		System.out.println("=========================");
		
		
		System.out.println(character);//8
		
		//# $ @:
		 
		char character2= '#';
		char character3= '@';
		
		System.out.println(character2);
		System.out.println(character3);
		System.out.println("=============================");
	}

}
