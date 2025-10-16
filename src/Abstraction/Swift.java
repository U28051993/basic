package Abstraction;

public class Swift {

	public static void main(String[] args) {

		Car c = new Maruti();
		c.type();
		Swift swift = new Swift();
		swift.feature();

	}

	public void feature() {

		System.out.println("we don't provide sunrood");
	}

}
