package JavaProjectGroup10;

public class Group10Task5 {

	public static void main(String[] args) {
		int first = 30;
		int second = 40;
		System.out.println("Before swap");
		System.out.println("First value : " + first);
		System.out.println("Second value : " + second);

		first = first - second;
		second = first + second;
		first = second - first;
		System.out.println("After swap");
		System.out.println("First value : " + first);
		System.out.println("Second value : " + second);


}

	}


