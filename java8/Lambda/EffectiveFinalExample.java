package java8.Lambda;

/*
 *  It gives complication error as local variable value is change after assigned
 */

interface IName {

	void getName();
}

public class EffectiveFinalExample {

	public static void main(String[] args) {
		String word = "Hello";
		IName suffixFunc = () -> System.out.println(word + ",");
		word = "Hi";
		suffixFunc.getName();
	}
}
