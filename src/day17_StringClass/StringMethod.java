package day17_StringClass;

public class StringMethod {
	public static void main(String[] args) {
		// ==
		
		  String str1 ="Hello Javengers";
	        String str2 ="Hello Javengers";
	        boolean R1 = str1 == str2 ;  // true
	        System.out.println(R1);
	        
	        String str3 = new String("Hello Javengers");
	        String str4 = new String("Hello Javengers");
	        boolean R2 = str3 == str4;  // false
	        System.out.println( R2 );
	        
	        boolean R3 =  str1 == str3;  // false
	        
	        System.out.println(R3);
	        
	    /*
	     Methods:
	        1. concat, 2. Length, 3. charAt, 4. toUpperCase,
	        5. toLowerCase      
	     
	     */
	    
	    /* 
	     concat(str): it takes String, and combines the two Strings
	        and returns it as new String Value
	        
	    */  
	        String a ="Cybertek";
	            a.concat(" School"); //  "Cybertek School"
	        System.out.println(a);
	            a = a.concat(" School"); //  a= "Cybertek School"
	    //  a = "Cybertek School";        
	        System.out.println(a);
	        
	        String A ="hello", B ="helloP";
	        System.out.println(A==B); // false, different values
	        
	        String C ="Hello", D ="hello";
	        System.out.println(C == D); // false , case sensitivity
	        
	    /* 
	     length(): it returns the total number of the characters as
	            an int value
	     
	     */
	        String LongName ="ABCDEFGHIJKLMN";
	                int num = LongName.length();
	                System.out.println(num);
	        
	        
	    /*
	    charAt(indexNum): it returns the character of the index number
	                    as a char value
	     
	     */
	            String name1 = "Muhtar";
	            // index:       012345
	            char ch = name1.charAt(5);
	            System.out.println( ch );  // r, index 5 is r
	        
	    /*
	     toUpperCase(): converts the String value to Upper case, 
	                    and returns it as NEW String vlaue
	                     
	     toLowerCase(): converts the String value to Lower case, 
	                    and returns it as NEW String vlaue
	     
	     */
	            String name2 ="cybertek";
	                    name2.toUpperCase(); //cybertek
	                 System.out.println(name2);
	                 
	                 name2 = name2.toUpperCase(); //CYBERTEK
	                 System.out.println(name2);
	            
	                 
	            String name3 = "CYBERTEK";
	                    name3.toLowerCase();
	            System.out.println(name3); // "CYBERTEK"
	            
	                    name3 = name3.toLowerCase(); //"cybertek"
	            System.out.println(name3);
	        
	        
	    /*
	        trim(): it's used for removing the unused spaces
	        returns a new string value
	     */
         String s1="      hello";
         s1.trim();
         System.out.println(s1);

         
         s1=s1.trim();
         System.out.println(s1);
         
         
         String s2="Cyberteck           School";
         s2=s2.trim();
         System.out.println(s2);
         
         
         String s3="  ";
         s3=s3.trim();
         System.out.println(s3);
         
         
         String s4="     Cybertek     School";
        		 s4=s4.trim();
         System.out.println(s4);

		/*
		 substring(beginning index): 
		              it creates the sub value of the stringfrom the beginnig index till the last index
		              and returns it as a New String value
		 */
		
         
         String Str="Cybertek School";
         //          0123456789
         
         String Str2=Str.substring(9);// School
         System.out.println(Str2);
         
         
         String Address ="Mclean VA 22000";
         //               123456789....
         String zipcode = Address.substring(10);
         System.out.println(zipcode);
         
         
         /*
          substring(beginning index,ending index):
                    it creates the sub value of the String from the beginnig index till the ending index 
                    but the ending index is excluded(ending index num will be excluded)

          */
		
         
         String Name="Hello Cyberteck School";
            ///       0123456789...
         
           Name.substring(6,13);//"Cybertek"
           System.out.println(Name);
               
           
           
           
           String fullName="Cyberteck school batch 12";
           String middleName=fullName.substring(9,15);//School
           System.out.println(middleName);
           
          
		 
		
	}

}
