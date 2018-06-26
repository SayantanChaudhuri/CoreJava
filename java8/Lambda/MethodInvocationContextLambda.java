package java8.Lambda;

public class MethodInvocationContextLambda {

	@FunctionalInterface
	interface Calculator {
		long calculate(long x, long y);
	}

	public static void main(String[] args) {
		engine((x, y) -> y / x);
	}

	private static void engine(Calculator calculator) {
		long x = 2, y = 8;
		long result = calculator.calculate(x, y);
		System.out.println(result);
	}
}
