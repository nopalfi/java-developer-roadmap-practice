package prerequisites;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Melon");
		fruitList.add("Mango");
		System.out.println(fruitList);

		fruitList.remove("Melon");
		System.out.println(fruitList.get(1));
	}
}
