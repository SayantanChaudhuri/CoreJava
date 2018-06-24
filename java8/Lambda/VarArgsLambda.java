package java8.Lambda;

import java.util.Arrays;
import java.util.function.Consumer;

public class VarArgsLambda {

	public static void main(String[] args) {
		
		Consumer<String []> printArray = (String ... strs) -> System.out.println(Arrays.toString(strs));
		
		printArray.accept(new String [] {"A", "B", "C"});
	}

}
