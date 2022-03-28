package prerequisites;

/*	In this class, i made an abstract class and a few of abstract methods.
 * In this abstract class, i just want to make 'blueprint' of methods so on the other classes they will implement this methods but the method will  be able
 * to use on any class. 
 * For example, i made 2 methods which is 'makeSound' and 'eat'. Those two actions are features of animals can do, so i want those methods got inhereted 
 * to other classes as well. 
 * To make abstract class or method, simply just put abstract behind the access modifier and behind method as well.
 * The method can have no implementation just yet, it also can have implementation inside it, it's your choice.
 * Abstract class can also have attributes
 * To use this abstract class, you have to extends it to the class that you need
 * Check out 'BirdAbstractExample' and 'DogAbstractExample' for the implementation.
 * 
 */

abstract public class AbstractClass {
	abstract void makeSound();
	abstract void eat();
}
