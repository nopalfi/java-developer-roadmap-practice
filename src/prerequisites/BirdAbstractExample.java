package prerequisites;

/*
 * In this class we extends from a abstrac class called 'AbstractClass' that have two methods 'makeSound()' and 'eat()'
 * after you use extends keyword to inherit an abstractClass, the IDE will warn you that you have to implement those methods and
 * override it with '@Override' annotation.
 * after that you make an object to whatever you want, for example 'bird' object, and then you call the abstract method like down below.
 * 
 */

public class BirdAbstractExample extends AbstractClass {

	@Override
	void makeSound() {
		 System.out.println("Tweet Tweet Tweet");
	}

	@Override
	void eat() {
		System.out.println("I eat seeds. Yummy!");
		
	}
	
	public static void main(String[] args) {
		BirdAbstractExample bird = new BirdAbstractExample();
		bird.makeSound();
		bird.eat();
	}

}
