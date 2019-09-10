package day11_IfStatmentReview;

public class WarmUp {

	public static void main(String[] args) {
		/*
		 
		 
		 
		 */

		//

		int Year = 2000; // leap

		boolean LeapYear = Year % 4 == 0;

		if (LeapYear) {
			System.out.println("Year" + Year + "is a leap year");

		} else {
			System.out.println("Year" + Year + "is NOT a leap yar");
		}

		/*
		 * GRADE CALCULATOR
		 */

		int grade = 55;
		boolean A = grade >= 90 && grade <= 100;
		boolean B = grade >= 80 && grade <= 89;
		boolean C = grade >= 70 && grade <= 79;
		boolean D = grade >= 60 && grade <= 69;
		boolean ValidGrade = grade >= 0 && grade <= 100;

		if (ValidGrade) {

			if (A) { // > 90 grade >= 100
				System.out.println("You made A");
			} else if (B) { // 90> grade >=80
				System.out.println("You made B");
			} else if (C) { // 80> garde >=70
				System.out.println("You made C");

			} else if (D) { // 70 > grade >= 60
				System.out.println("You made D");
			} else { // 0 =< grade < 60
				System.out.println("You made F");
			}
		} else { // it only gets executed if the grade is invalid
			System.out.println("Invalid Grade");

		}

		/*
		 * declare a variable called Age boolean variable "good person"
		 * 
		 * age >= 18 => cigra age >= 21 => hookah age >= 25 => alcohol age >= 25 =>
		 * alcohol age < 18 => milk age :23
		 */

		int age = 30;
		boolean GoodPerson = false;

		if (age >= 18) {
			if (GoodPerson) {
				System.out.println("Alcohol is not good for your health");

			} else {// goodperson=false && age >=18
				System.out.println("you can buy cigrates");
			}
			if (age >= 21) {
				System.out.println("you can buy Hookah");
			}

			if (age >= 25) {
				System.out.println("You can buy alcohol");
			}

			else {
				System.out.println("go buy milk");

			}
		}
		/*
		 * 
		 * even number of 30 days: 4 and 6 odd number of days : 1,3,5,7
		 * 
		 */
		int month = 5;
		if (month > 0 && month < 13) {

			if (month == 1) {
				System.out.println("31 days");
			} else if (month == 2) {
				System.out.println("28 days");
			} else if (month == 3) {
				System.out.println("31 days");
			} else if (month == 4) {
				System.out.println("30 days");
			} else if (month == 5) {
				System.out.println("31 days");
			} else if (month == 6) {
				System.out.println("30 days");
			} else if (month == 7) {
				System.out.println("31 days");
			} else if (month % 2 == 0) {
				System.out.println("31 days");
			} else {
				System.out.println("you have 30 days");
			}
		} else {
			System.out.println("Invalid Entry");
		}

		/*
		 * 28 days:2 30 days: 4,6,9,11 31 days : 1,,3,5,7,8,10,12
		 */

		int Month2 = 5;
		if (Month2 > 0 && Month2 < 13) {

			if (Month2 == 2) {
				System.out.println("28 days");
			} else if (Month2 == 4 || Month2 == 6) {
				System.out.println("30 days");
			} else if (Month2 == 9 || Month2 == 11) {
				System.out.println("30 days");
			} else {
				System.out.println("31 days");
			}

		} else {
			System.out.println("Invalid Entry");
		}

	}

}
