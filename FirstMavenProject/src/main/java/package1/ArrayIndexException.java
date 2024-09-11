package package1;

public class ArrayIndexException {

	public static void main(String[] args) {

		try {
			int a[] = new int[2];
			a[3] = 10;
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array exception");

		}

		catch (ArithmeticException e) {

			System.out.println("Arithmetic exception");
		}

		catch (Exception e) {   //common exception class it will execute if no matching exception found

			System.out.println("Exception handled");

		} finally {   //finally block will execute no matter if it found error or not
			

			System.out.println("inside finally");
		}

	}

}
