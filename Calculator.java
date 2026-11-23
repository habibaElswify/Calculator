
public class Calculator {
	public static void calculate() {
		int a = 5;
		int b = 3;
		int c = 7;
	    int d = 2;
	    int sum = b + a;
	    int difference = c - d;
	    int product = c * b * a;
	    int quotient = (c+d)/b;
	    int remainder = b % d;
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
	}

	public static void main(String[] args) {
		calculate();
		
		
		
	}
}
