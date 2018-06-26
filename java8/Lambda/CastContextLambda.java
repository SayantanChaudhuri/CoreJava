package java8.Lambda;

public class CastContextLambda {

	@FunctionalInterface
	interface IntCalculator {
		int calculate(int x, int y);
	}

	@FunctionalInterface
	interface LongCalculator {
		long calculate(long x, long y);
	}

	public static void main(String[] args) {
		engine((IntCalculator) ((x, y) -> x + y));
		engine((LongCalculator) ((x, y) -> x * y));
	}

	private static void engine(IntCalculator calculator) {
		int x = 2, y = 4;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}

	private static void engine(LongCalculator calculator) {
		long x = 3, y = 5;
		long result = calculator.calculate(x, y);
		System.out.println(result);
	}
}
