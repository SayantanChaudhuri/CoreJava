package java8.Lambda;

import java.util.function.Function;

public class LoopBreakContinueReturnLambda {

	public static void main(String[] args) {

		Function<String, String> func1 = y -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				if (i == 4) {
					break;
				}
			}
			return y + " Sayantan";
		};
		System.out.println(func1.apply("Hi"));

		System.out.println("============================");

		for (int i = 0; i <= 5; i++) {

			if (i == 4) {

				Function<String, String> func2 = y -> {

					// break; // We cannot apply break inside Function to come
					// out from outer loop

					return y + " Sayantan";
				};
				
				System.out.println(func2.apply("Hi"));
				
			} else
				System.out.println(i);
		}
	}
}
