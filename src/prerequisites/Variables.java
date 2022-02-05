package prerequisites; // This means we are importing a package called 'prerequisites'

public class Variables { // This class modifier is public which mean it is accessable from other classes and packages through command above.
	public int number;						// This is a variable that has a public modifier which mean as stated above this variable can be access for other class
	int date;								// This is a normal Integer variable, it can contain real number (e.g. 4, 104, 241, etc)
	private double money;					// This is a private modifier variable, it can only be accessed by this class only.
	final public double PI = 3.14;			// This is a constant variable, other classes can access it, but will never able to change its value.
	float height;							// This is a normal variable that can contain float number (e.g. 164.3221, 2994.3, -542.54334, etc)
	String name;							// A variable that contain a sentance, even more than just one. 'String' itself is not a primitive variable, like the others. Instead, 'String' is a static object. Which mean we don't need to make a new instance to access 'String'
	
	public Variables(String name) { 		// This is a constructor
		this.name = name;
	}
	
	public void printName() {				// A method that will print 'name' variable from a object
		System.out.println("My name is "+name);
	}
	
	
	public static void main(String[] args) { // This is a main() method. Your program will starts here.
		Variables obj = new Variables("John Smith");		// Making a object from class 'Variable' into 'obj' and gives an argument "John Smith"
		obj.printName();									// Calling 'printName()' method
	}
	
	
	
}


