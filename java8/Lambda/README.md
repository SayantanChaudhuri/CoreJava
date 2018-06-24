# Lambda
Lambda is **Anonymous** method with no name which is used to provide implementation of method defined in **Functional Interface** 


## Functional Interface

Introduced in Java 8. It is having following features

	*   Must have Only One Abstract Method 
	*   It may have default and static method
	*   It may have Object method
	*   @FunctionalInterface annotation (Optional) could be used for forcefully checking this feature integrity
	*   It is also known as Single Abstract Method (STA)
	*   Variables used in lambda are Effective Final (the local variable whose value doesn't change after it is first assigned)  

## Some Valid Lambda Functions

	1.  () -> 10
	2.  (int x) -> x + x
	3.  x -> x % x
	4.  (int a, int b) -> (a + b) / (a / b) 



### Effective Final example
	
	interface IName {
		void getName();
	}
	
	public class EffectiveFinalExample {
		public static void main(String[] args) {
			String word = "Hello";
			IName suffixFunc = () -> System.out.println(word + ","); //This line give you error as word value changed after assigned
			word = "Hi"; 
			suffixFunc.getName();
		}
	}


#### Built in Functional Interface

	Predicate<T> --> boolean test(T t)
	Consumer<T> --> void accept(T t)
	Function<T, R> --> R apply(T t)
	Supplier<T> --> T get()
	
	BiPredicate<T, U> --> boolean test(T t, U u)
	BiConsumer<T, U> --> void accept(T t, U u)
	BiFunction<T, U, R> --> R apply(T t, U u)
	
	IntPredicate<T> --> boolean test(int value)
	LongPredicate<T> --> boolean test(long value)
	DoublePredicate<T> --> boolean test(double value)
	
	IntFunction<R>	--> R apply(int value)
	LongFunction<R>	--> R apply(long value)
	DoubleFunction<R> --> R apply(double value)
	
	ToIntFunction<R>	--> int applyAsInt(T value)
	ToLongFunction<R>	--> long applyAsLong(T value)
	ToDoubleFunction<R>	--> double applyAsDouble(T value)
	
	IntToLongFunction<R>	--> long applyAsLong(int value)
	IntToDoubleFunction<R>	--> double applyAsDouble(int value)
	
	LongToIntFunction<R>	--> int applyAsInt(long value)
	LongToDoubleFunction<R>	--> double applyAsDouble(long value)
		
	DoubleToIntFunction<R>	--> int applyAsInt(double value)
	DoubleToLongFunction<R>	--> long applyAsLong(double value)
	
	UnaryOperator<T> --> represents an operation on a single operand that produces a result of the same type as its operand. 
							This is a specialization of Function for the case where the operand and result are of the same type.
							
							UnaryOperator<String> i  = (x)-> x.toUpperCase();
							System.out.println(i.apply("Sayantan Chaudhuri")); // Sayantan Chaudhuri
							 	
	IntUnaryOperator<T>   --> IntUnaryOperator represents an operation on a single int-valued operand 
							  that produces an int-valued result. This is the primitive type specialization of UnaryOperator for int.
							  
							  --> applyAsInt applies this operator to the given operand
							  		
							  	IntUnaryOperator i = (x) -> x*x;
    								System.out.println(i.applyAsInt(2));  // Output : 4
    								
    						  --> compose returns a composed operator that first applies the before operator to its input, 
    						  	and then applies this operator to the result
							  		
							  	IntUnaryOperator i = (x) -> x*x;
    								System.out.println(i.compose(i).applyAsInt(2));  // Output : 16
    								
    						  --> andThen returns a composed operator that first applies this operator to its input, 
    						  	and then applies this operator to the result
							  		
							  	IntUnaryOperator i = (x) -> x*x;
    								System.out.println(i.andThen(i).applyAsInt(2));  // Output : 16
    							
    						  --> identity returns a unary operator that always returns its input argument. 
							  		
							  	IntUnaryOperator i = IntUnaryOperator.identity();
    								System.out.println(i.andThen(i).applyAsInt(2));  // Output : 2



#### Java Intersection Type

An intersection type is an intersection of multiple types.
An ampersand is used between two types as Type1 & Type2 to represent a new type that is an intersection of Type1, Type2.

<To Do - Need to explore more>



#### How we can pass Lambda expression as method parameter

*   [EventNumberLambda](EventNumberLambda.java "EventNumberLambda.java")
*   [ThreeSumLambda](ThreeSumLambda.java "ThreeSumLambda.java")
  

#### Lambda as Poly Expression

	The type of a lambda expression is inferred from the target type 
	thus the same lambda expression could have different types in different contexts. 
	Such an expression is called a Poly-Expression.

	e.g.
		polyExpression = () -> 10;
		polyExpression = () -> 10 + 5;
		
Java Code : [PolyExpressionLambda](PolyExpressionLambda.java "PolyExpressionLambda.java") 	

#### Method References

	*   To Static Method (ContainingClass::staticMethodName)
	*   To an instance method of an object of a particular type	 (containingObject::instanceMethodName)
	*   To an instance method of an existing object	(ContainingType::methodName)
	*   To a constructor	(ClassName::new)
	
Java Code : [MethodReferences](MethodReferences "MethodReferences.java") 

Some more examples
	
*   Runnable Lambda Expression [RunnableLambda](RunnableLambda "RunnableLambda.java") 
*   Callable Lambda Expression [CallableLambda](CallableLambda "CallableLambda.java")
*	Comparator Lambda Expression [ComparatorLambda](ComparatorLambda "ComparatorLambda.java")
