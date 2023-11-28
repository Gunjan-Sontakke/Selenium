package Learning2;

public class B {
	public static void main(String[] args) {

		int i, j;

		String MP = "Dot net";
		{

			for (i = 1; i < 12; i++) {

				for (j = 1; i < 12 - i; i++)

					System.out.print(j + " ");
			}

			for (i = 1; i < 12; i++) {

				for (j = 1; i < 12 - i; i++)

					System.out.println(j + " ");
			}
			
			

			// Copied above code

			{

				for (i = 1; i < 12; i++) {

					for (j = 1; i < 4 - i; i++)

						System.out.print(j + " ");
				}

				for (i = 1; i < 12; i++) {

					for (j = 1; i < 12 - i; i++)

						System.out.print(j + " ");
				}
			}

		}
	}
}