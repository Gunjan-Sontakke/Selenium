package Learning2;

public class Object_1 {
	public static void main(String [] args) {

		Human h1= new Human();
		h1.name= "Gunjan";
		h1.age= 27;
		
		Human h2= new Human();
		h2.name= "Gunjan";
		h2.age= 26;

		h1.speak("hello");
		h2.speak("hello");
       }
    }

class Human {
	String name; 
	int age;
	
     public void speak (String content) {

           System.out.println(name+" : " +age);

    } 
}