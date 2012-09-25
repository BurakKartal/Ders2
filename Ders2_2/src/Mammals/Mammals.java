package Mammals;
public class Mammals {

	String name;
	String colour;
	String types;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public Mammals() {

	}

	public Mammals(String name, String colour, String types){
		this.name = name;
		this.colour = colour;
		this.types = types;
	}

	public static void animalSound(){

		System.out.println("Animal sounds like hav hav or miyav");
	}
}

class Cat extends Mammals{

	int numberofcats;

	public Cat(String name, String colour, String types, int numberofcats) {
		super(name, colour, types);
		this.numberofcats = numberofcats;
	}

	public static void catSound(){

		System.out.println("Miyaaaavvvv");
	}
}
class Dog extends Mammals{

	String soundtype;

	public Dog(String name, String colour, String types, String soundtype) {
		super(name, colour, types);
		this.soundtype = soundtype;
	}


	public static void dogSound(){

		System.out.println("Haavvvv haaaavvv");
	}

}