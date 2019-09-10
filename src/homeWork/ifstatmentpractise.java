package homeWork;

public class ifstatmentpractise {

   	public static void main(String[] args) {
		/*
		 * A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
		 Ask user for their salary and year of service and print the net bonus amount.
		 */
		
		
		double salary = 100000;
		double year = -1;
	 
		             //double bonus = salary*0.05;
		
		
		
		
		
		if( year >=5) {
			 
			System.out.println(salary + (salary * .5));
			
		}else if(year <=0) {
			System.out.println("invalid Entry");
		}
		else {
			System.out.println("Work more years");
		}
		System.out.println("=========================================================");
		
	
		/*
		 A shop will give discount of 10% if the cost of purchase quantity is more that $1000.
		Ask user for quantity. Suppose, one unit will cost $100.
		Calculate and print total cost for user.
		*/
		
    int Cost=2000;
        
        if(Cost>=1000 ) {
            System.out.println(Cost - (Cost  * .10)  );
        }else if(Cost<=999) {
            System.out.println("please spend more money");
        }
		
		
		System.out.println("=================================================");
		
		/* if you wake up  bettweeen 6 and 8 you can have a productive day
		 * if you wake up at 6am you wiill do Gym.
		 * if you wake up at 7am you will eat breakfast
		 * if you wake up at 8am you will reach will reach work on time
		 
		 */
	
	
	   int wakeup= 7;
	   
	   if(wakeup>=6 && wakeup <=8) {
		   if(wakeup== 6) {
			   System.out.println("you will go Gym");
		   }
		   else if(wakeup==7) {
			   System.out.println("you will have chance to eat breakfast");
		   }
		   else if(wakeup==8) {
			   System.out.println("you better run to work");
		   }
	   }else {
     	   System.out.println("Honey you are fired");
	   }
	System.out.println("============================================================================================");
	
	/*
	 1) 300- 530  - below average (20%), (rent a room)
     2) 530 - 620 - not bad     (17%) affordable value (180_000)
     3) 621 - 700 - average     (15%),affordable value (350_000)
     4) 701 - 760 - good       (10%), affordable value (800_000)
     5) 761 - 850 - excellent  (5%), affordable value (1_500_000)
    
     1)we got 4 bracket of credit
     score, each bracket has to use different amount of down payment, for purchase
     of the house
     2) each bracket can afford different price range of purchased
     property ()
     3) to be able to buy a house you have to have 2 years of
     
     
    */
	int creditScore = 700;
	int workyear= 1;
	
	if(workyear>=2) {
	
			if (creditScore >= 300 && creditScore <= 530) {
				System.out.println("below average, rent a room");
			} else if (creditScore >= 530 && creditScore <= 620) {
				System.out.println("not bad");
			} else if (creditScore >= 621 && creditScore <= 700) {
				System.out.println("Average");
			} else if (creditScore >= 701 && creditScore <= 760) {
				System.out.println("Good");
			} else if (creditScore >= 761 && creditScore <= 850) {
				System.out.println("Excellent");
	}
	} else {
		System.out.println("use it for some more month/year");
	}
	
	   
	   
	   
	
	
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
