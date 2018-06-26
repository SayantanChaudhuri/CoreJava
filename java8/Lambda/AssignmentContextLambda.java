package java8.Lambda;

public class AssignmentContextLambda {

	@FunctionalInterface
	interface Calculator {
		int calculate(int x, int y);
	}
	
	public static void main(String[] args) {
		Calculator iCal = (x,y)-> x + y;
	    System.out.println(iCal.calculate(1, 2));
	}
}
