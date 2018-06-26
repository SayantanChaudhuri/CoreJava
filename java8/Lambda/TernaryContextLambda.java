package java8.Lambda;

public class TernaryContextLambda {

	public static void main(String[] args) throws Exception {
		
		Double result = TernaryContextLambda.Calculator.calculate(666d, 777d, (a, b) -> a > b ? b : a);
		System.out.println(result); //666.0 
	}

	static class Calculator {
		 
	    public static Double calculate(Double op1, Double op2, DoubleOperator operator) {
	        return operator.apply(op1, op2); //delegate to the operator
	    }
	 
	}
	
	@FunctionalInterface
	public interface DoubleOperator {
	 
	    public Double apply(Double a, Double b);
	 
	}
}
