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