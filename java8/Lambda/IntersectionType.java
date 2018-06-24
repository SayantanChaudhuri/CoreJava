package java8.Lambda;

@FunctionalInterface
interface Calculator {
	long calculate(long x, long y);
}

//@FunctionalInterface
interface NonFunction {
//	long calculate(long x, long y);
//	void print();
}

interface SubType extends NonFunction {
	
	void print();
	void show();
}

public class IntersectionType {

	public static void main(String[] args) {
		NonFunction nonFunction = (NonFunction & Calculator) (x,y)-> x + y;
		
		
//		System.out.println(nonFunction.calculate(5, 10));
	}

}
