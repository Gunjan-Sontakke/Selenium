package Learning2;

import java.util.Scanner;

public class WeekdaysName {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:");
		int Number = scan.nextInt();

		if (Number == 1) {
			System.out.println("Monday");

		} else if (Number == 2) {
			System.out.println("Tuesday");
		} else if (Number == 3) {
			System.out.println("Wednesday");
		} else if (Number == 4) {
			System.out.println("Thursday");
		} else if (Number == 5) {
			System.out.println("Friday");
		} else if (Number == 6) {
			System.out.println("Saturday");
		} else if (Number == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Weekday does not exists.");
		}
	}
}
