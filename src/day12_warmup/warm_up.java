package day12_warmup;

public class warm_up {

	public static void main(String[] args) {
		
		
		int n1=5;
		int n2=5;
		int n3=6;
		
		
		if(n1==n2 && n1!=n3) {
			System.out.println("n1 and n2 equal");
		}
		else if(n2==n3 && n2!=n1) {
			System.out.println("n2 and n3 are equal");
			}
		else if(n1==n2 && n2==n3 && n1==n3) {
			System.out.println("all are equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
		
		
		
		
		
		
		// second
		
		int num1=5;
		int num2=5;
		int num3=5;
		
		
		if (num1==num2  && num2==num3) {
			System.out.println("all equal");
		}
		else if(num1==num2) {
			System.out.println("num1 and num2 are equal");
		}
		else if(num2==num3) {
			System.out.println("num2 and num3 are equal");
		}
		else if(num1==num3) {
			System.out.println("num1 and num3 ae equal");
		}
		else {
			System.out.println("non of them are equal");
		}
			
		
		// Nested if statment
		
		int A=5;
		int B=5;
		int C=5;

		if(A==B && B==C) {
			System.out.println("All are equal");
			
		}
		else {
			if(A==B) {
				System.out.println("A and B are equal");
			}
			
			else if(A==C) {
				System.out.println("B and C are equal");
			}
			else if(C==B) {
				System.out.println("C and B are equal");
			}
			else {
				System.out.println("none of them equal");
			}
		}
		
		/*
		 60~70=>D
		 70~80=>C
		 80~90=>b
		 90~100=>
		 */
		
		int garde=70;
		
		if(garde>=0 && garde<=100) {
		
		if(garde >=60) {
					
			if(garde >=90) {
			System.out.println("A");
		}
		else if(garde >=80) {
			System.out.println("B");
		}
		else if(garde >=70) {
			System.out.println("C");
		}
		else if(garde>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("Failed");
		}
		}
		else {
			System.out.println("invalid");
		}
		
		
		}
		
	}

}


