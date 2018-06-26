package java8.Lambda;

public class ReturnContextLambda {

	@FunctionalInterface
	interface Calculator {
		long calculate(long x, long y);
	}

	public static void main(String[] args) {
		System.out.println(create().calculate(2, 2));
	}

	private static Calculator create() {
		return (x, y) -> x / y;
	}
}
