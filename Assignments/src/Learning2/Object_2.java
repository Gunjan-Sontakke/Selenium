package Learning2;

public class Object_2 {
	public static void main(String[] args) {
		Object h1 = new Object();
		h1.age = 26;
		h1.name = "Rahul";

		Object h2 = new Object();
		h2.age = 27;
		h2.name = "Kartik";

		h1.xyz("Harshal");
		System.out.println("Print person 1: ");

		System.out.println(h2.age);

	}
}

class Object {
	String name;
	int age, i, j;

	public void xyz(String person) {

		for (i = 0; i < 5; i++) {

			for (j = 0; j < 5; j++) {

				System.out.println("Print person 3: " + j);
			}
		}

	}

}
