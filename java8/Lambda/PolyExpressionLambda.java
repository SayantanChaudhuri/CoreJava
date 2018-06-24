package java8.Lambda;

/*********************************************************************
 *  Same Functional Interface can be used in Different context 
 *  Here 
 *  	polyExpression = () -> 10
 *  	polyExpression = () -> 10 + 5
 *********************************************************************/

@FunctionalInterface
interface IPolyExpression {
	
	int getValue();
}


public class PolyExpressionLambda {

	public static void main(String[] args) {

		IPolyExpression polyExpression = () -> 10;
		
		System.out.println(polyExpression.getValue());
		
		polyExpression = () -> 10 + 5;
		
		System.out.println(polyExpression.getValue());

	}
	
}
