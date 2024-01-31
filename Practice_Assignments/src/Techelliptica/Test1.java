/*
 * package Techelliptica;
 * 
 * public class Test1 {
 * 
 * public static void main(String[] args) {
 * System.out.println("Create Class file in different folder "); int Num1;
 * Test2.Number; int i=2; int j=2; ; }
 * 
 * class Test2 { public void Number(int i, int j) {
 * 
 * int Num1; Num1 = i - j; int Num2; Num2 = i + j;
 * 
 * if (i > 0) { System.out.println("Perform mathematical expression "); } else {
 * System.out.println("Not applicable");
 * 
 * } } } }
 */

package Techelliptica;

class Test1 {
	public static void main(String[] args) {
		System.out.println("empty class 1");

		Mn.mn();
		Mno.mn();
		Mnop.mn();
	}

	public static class Mn {
		public static void mn() {
			System.out.println("empty class 2");
		}
	}

	public static class Mno {
		public static void mn() {
			System.out.println("empty class 3");
		}
	}

	public static class Mnop {
		public static void mn() {
			System.out.println("empty class 4");
		}
	}
}