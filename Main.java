
public class Main {
	public static void main(String[] args) {
		double a = 10.0;
		double b = 5.0;

		System.out.println("a = " + a + ", b = " + b);
		System.out.println("Add: " + Add.add(a, b));
		System.out.println("Subtract: " + Subtract.subtract(a, b));
		System.out.println("Multiply: " + Multiply.multiply(a, b));
		System.out.println("Divide: " + Divide.divide(a, b));

		// demonstrate divide-by-zero handling
		try {
			System.out.println("Divide by zero: " + Divide.divide(a, 0));
		} catch (IllegalArgumentException ex) {
			System.out.println("Caught error: " + ex.getMessage());
		}
	}
}