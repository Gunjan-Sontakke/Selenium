package Learning2;

import java.util.Scanner;

public class Positive_Negative {
	public static void main(String[] args) {

		double i;
        i= 0.00;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");{
			i= scan.nextDouble();
			if(i<0) {
			System.out.println("Number is Negative");

				}
		else {
			System.out.println("Number is Positive");
		}
      
	}

	}
}

//Steps to follow

// 1 - Create scanner class and take input

// 2 - check whether that input is positive or negative

// 3 - print "Number is Positive" if value is positive , print "Number is
// Negative" , if value is negative
