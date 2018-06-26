package java8.Lambda;

import java.util.function.Function;

public class ScopeLambda {

	ScopeLambda() {

		// int x= 0; // This will throw error as same variable is used in input
		// of Lambda expression

		Function<String, String> func1 = x -> {
			
			System.out.println(this);
			return x;
		};

		System.out.println(func1.apply(""));
	}

	public String toString() {

		return "ScopeLambda";

	}

	public static void main(String[] args) {

		new ScopeLambda();
	}
}
