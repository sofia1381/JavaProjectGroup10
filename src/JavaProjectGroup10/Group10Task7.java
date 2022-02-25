package JavaProjectGroup10;

public class Group10Task7 {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;

		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;// swap method
			b = c;// swap method

	}

}
}