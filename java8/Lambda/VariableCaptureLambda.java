package java8.Lambda;

import java.util.function.Function;

public class VariableCaptureLambda {

	static String hindiGreeting = "Hi";
	
	public static void main(String[] args) {
		
		final String x = "Hello"; // Final variable used in Lambda
		
	    Function<String,String> func1 = name -> {return x + " "+ name ;};
	    
	    System.out.println(func1.apply("Sayantan Chaudhuri"));

	    
	    
	    String greetings = "Hi"; // Non final variable used in Lambda 
	    
	    Function<String,String> func2 = name -> {
	    	
	    	// greetings = "H2";  // it will give compilation error as local variable is effective-final variable
	    	
	    	return greetings + " "+ name ;
	    };
	    
	    System.out.println(func2.apply("Sayantan Chaudhuri"));
	    
	    
	    
	    // Non Local Variable can be change inside Lambda Expression
	    Function<String,String> func3 = name -> {hindiGreeting="Namste"; return hindiGreeting + " "+ name ;}; 
	    
	    System.out.println(func3.apply("Sayantan Chaudhuri"));
	}
}
