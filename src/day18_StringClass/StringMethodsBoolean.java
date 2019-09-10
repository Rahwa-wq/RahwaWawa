package day18_StringClass;

public class StringMethodsBoolean {

	public static void main(String[] args) {
		
		/*
		 Empty();
		 
		 */
		
		
		
		String str ="Cyberteck";
		boolean R1=str.isEmpty();
		System.out.println(R1);
		
		
		String str2="";
		if(str2.isEmpty()){
		System.out.println("it's empty String");	
		}else {
			System.out.println("it's  not empty String");
		}
		
		
		/*
		 equals(str): checks if the two Strings face value are equal or not
		 */
		
		String A1="Cybertek";
		String A2=new String("Cybertek");
		System.out.println(A1==A2);//false
		
		boolean R2=A1.contentEquals(A2);
		System.out.println(R2);
		
		
		System.out.println("java".contentEquals("Java"));// false coz 
		
		
		
	}
}
