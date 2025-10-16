package Abstraction;

public class Skoda extends Car {

	public static void main(String[] args) {

		Car car1 = new Skoda();
		car1.type();
		car1.feature();

	}

	public void type() {

		System.out.println("Engine Series 6");

	}

}
