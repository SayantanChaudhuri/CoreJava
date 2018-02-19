package java8.Modifiers;

/**
 * 
 * @author Sayantan
 *
 */

/**
 *  Final modifier used in
 *  
 *   Class
 *   Variable
 *   Method
 * 
 *   Final Class: Class cannot be inherited / extend. All method calls of a final class be resolved at compile time itself.
 *   			  It does not means all members not final unless final modifier add in declaration
 *   
 *   Final Variable: Value cannot be changed after assigned
 *   				 Non Static variable must be initialize inside constructor / non static block
 *   						 if not initialize at time of declaration
 *   
 *    				Static variable must be initialize inside static block
 *   						 if not initialize at time of declaration
 *    				 
 *   Final Method: cannot be overridden
 */


/**
 * Output
 * ---------------------------------
 * Inside FinalVehicleClass :: display :: vin = 0 :: modelName = null
 * Inside FinalVehicleClass :: display :: vin = 100 :: modelName = Ferari
 *
 */

final class FinalVehicleClass {
	
	int vin;
	static String modelName;
	
	void display() {
		
		System.out.println("Inside FinalVehicleClass :: display :: vin = " + vin + " :: modelName = " + modelName);
	}
}

class NonFinalVehicleClass /* extends FinalVehicleClass */ {
	
	final int vin;
	static final int madeInYear;
	static String modelName;
	
	static {
		madeInYear = 2018;
	}
	
	{
		modelName = "Ferari";
	}
	
	NonFinalVehicleClass() {
		vin = 100;
	}
	
	
	final void display() {
		
		System.out.println("Inside FinalVehicleClass :: display :: vin = " + vin + " :: modelName = " + modelName);
	}
}


class SubNonFinalVehicleClass extends NonFinalVehicleClass {
	
	/*void display() {
		
		System.out.println("Inside FinalVehicleClass :: display :: vin = " + vin + " :: modelName = " + modelName);
	}*/
	
	void show() {
		display();
	}
}

public class FinalModifier {

	public static void main(String[] args) {
		
		FinalVehicleClass fvc = new FinalVehicleClass();
		
		fvc.display();
		
		SubNonFinalVehicleClass snvc = new SubNonFinalVehicleClass();
		snvc.display();
	}

}
