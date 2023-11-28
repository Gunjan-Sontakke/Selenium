package Learning2;

import java.util.Scanner;

public class ReadNumber {

	public static void main(String[] args) {
		double i = 0;

		// give input number

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		i = input.nextDouble();
		double number;
		number = i * 2;

		System.out.println("Print Square of "+i+" Number:" + number);
		number = i * 2 * 2;
		System.out.println("Print cube of "+i+" Number:" + number);
		number = i * 2 * 2 * 2;
		System.out.println("Print Forth power of "+i+" Number:" + number);
	}

}
