package java8.Lambda;

interface ThreeSumFunction<T1, T2, T3, R> {
	R threeSum(T1 t1, T2 t2, T3 t3);
}

class Sum {
	Integer doSum(String t1, String t2) {
		return Integer.parseInt(t1) + Integer.parseInt(t2);
	}
}

public class ThreeSumLambda {

	public static void main(String[] args) {

		ThreeSumFunction<Sum, String, String, Integer> ts = new ThreeSumFunction <Sum, String, String, Integer>() {

			@Override
			public Integer threeSum(Sum sum, String t2, String t3) {
				return sum.doSum(t2, t3);
			}

		};
		
		System.out.println("Final Result (Anonymous Function) : " + ts.threeSum(new Sum(), "2", "3"));
		
		ts = (Sum sum, String t1, String t2) -> sum.doSum(t1, t2);
		
		System.out.println("Final Result (Lambda Function)    : " + ts.threeSum(new Sum(), "2", "3"));
		
		
		ts = Sum :: doSum;
		
		System.out.println("Final Result (Method Function)    : " + ts.threeSum(new Sum(), "2", "3"));
	}
}
