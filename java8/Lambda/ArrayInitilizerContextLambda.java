package java8.Lambda;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class ArrayInitilizerContextLambda {

	public static void main(String[] args) {
		
		Stream<String> streamString = Stream.of("a", "b", "c");
		
		// Functional Interface
		IntFunction<String[]> intFunction = new IntFunction<String[]>() {
		    @Override
		    public String[] apply(int value) {
		        return new String[value];
		    }
		};

		streamString = Stream.of("a", "b", "c");
		String[] stringArray = streamString.toArray(intFunction);
		System.out.println("Using Functional Interface :");
		Arrays.stream(stringArray).forEach(System.out::println);
		
		// Lambda Expression
		streamString = Stream.of("a", "b", "c");
		stringArray = streamString.toArray(size -> new String[size]);
		System.out.println("Using Lambda Expression :");
		Arrays.stream(stringArray).forEach(System.out::println);
		
		// Method Reference
		streamString = Stream.of("a", "b", "c");
		System.out.println("Using Method Reference :");
		stringArray = streamString.toArray(String[]::new);
		Arrays.stream(stringArray).forEach(System.out::println);
		
		// Set All
		stringArray = new String[3]; 
		Arrays.setAll(stringArray, (index) -> String.valueOf(index));
		System.out.println("Using setAll :");
		Arrays.stream(stringArray).forEach(System.out::println);
		
		// Parallel Set All
		stringArray = new String[3]; 
		Arrays.parallelSetAll(stringArray, (index) -> String.valueOf(index));
		System.out.println("Using parallelSetAll :");
		Arrays.stream(stringArray).forEach(System.out::println);
	}
}
