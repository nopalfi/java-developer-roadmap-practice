package prerequisites;

/*
 * In this class we extends from a abstrac class called 'AbstractClass' that have two methods 'makeSound()' and 'eat()'
 * after you use extends keyword to inherit an abstractClass, the IDE will warn you that you have to implement those methods and
 * override it with '@Override' annotation.
 * after that you make an object to whatever you want, for example 'dog' object, and then you call the abstract method like down below.
 * 
 */

public class DogAbstractExample extends AbstractClass {

	@Override
	void makeSound() {
		System.out.println("Woof Woof Woof");		
	}

	@Override
	void eat() {
		System.out.println("I eat dogs food. Delicious!");
		
	}
	
	public static void main(String[] args) {
		DogAbstractExample dog = new DogAbstractExample();
		dog.makeSound();
		dog.eat();
		
	}

}
