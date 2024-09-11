package package1;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			int a = 2 / 0;
		}

		catch (ArithmeticException e) {

			System.out.println("Division by zero not possible");
		}

	}
}