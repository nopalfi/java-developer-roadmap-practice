package prerequisites;

import java.util.Scanner;
/*
 * In this class, i'll try my best to practice what interface is.
 * Here, i have 3 methods that will be implemented inside main class.
 * after i created 'Car' interface. I use 'implements' keyword to implement my interface to 'InterfaceExample' class.
 * After the main method complete, i have to put all the methods from 'Car' interface outside of main method and fill the code inside the method.
 */

interface Car {
	
	void turnOn();
	void turnOff();
	void drive();
}

public class InterfaceExample implements Car {
	
	String state;

	public static void main(String[] args) {
		String choice = "Z";
		Scanner input = new Scanner(System.in);
		InterfaceExample car = new InterfaceExample();
		
		
		while(!choice.contains("Q")) {
			System.out.println("Your car current state is "+car.getState());
			System.out.println("What are you going to do? ");
			System.out.println("A. Turn On, B. Turn Off, C. Drive, Q. Exit");
			choice = input.next();
			if (choice.contains("A")) {
				car.turnOn();
			} else if (choice.contains("B")) {
				car.turnOff();
			} else if (choice.contains("C")) {
				car.drive();
			} else if (choice.contains("Q")) {
				System.out.println("Have a nice day!");
				break;
			}
		}
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("You turned on your car!");
		state = "turned on";
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("You turned off your car!");
		state = "turned off";
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("You put your car on drive!");
		state = "driving";
	}

}
