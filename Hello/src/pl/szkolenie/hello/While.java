package pl.szkolenie.hello;

public class While {

	public static void main(String[] args) {
		int x = 5;
		int y = 1;
		do {
			y *= x;
		} while (--x > 0);

		System.out.println(y);
	}

}
