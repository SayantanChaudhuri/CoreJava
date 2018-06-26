package java8.Lambda;

@FunctionalInterface
interface IntCalculator {
	int calculate(int x, int y);
}

@FunctionalInterface
interface LongCalculator {
	long calculate(long x, long y);
}

public class ParameterAmbiguityLamda {

	public static void main(String[] args) {
		
		// Here the interface has chosen internally by input type
		
		engine((int x, int y) -> x + y);
		engine((long x, long y) -> x * y);
		engine((int x, int y) -> y / x);
		engine((long x, long y) -> x % y);
		

		// In case if have specified input type like mentioned below then complier will say as Ambiguous
		// engine((x, y) -> x + y);
		
		// To avoid ambiguity we need explicitly type cast of lambda expression by the following ways
		// First way
		engine((IntCalculator)(x, y) -> x * y);
		
		
		// Second way
		IntCalculator intCalc = (x, y) -> x * y;
		engine(intCalc);
	}

	private static void engine(IntCalculator calculator) {
		int x = 2, y = 4;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}

	private static void engine(LongCalculator calculator) {
		long x = 3, y = 9;
		long result = calculator.calculate(x, y);
		System.out.println(result);
	}
}
