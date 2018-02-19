/**
 * 
 */
package java8.Modifiers;

/**
 * @author Sayantan
 *
 */

/**
 *   Abstract modifier used in  
 * 		class
 * 		NOT variable
 * 		method
 *     
 *  Abstract class can have 
 *     Constructor
 *     Non Static Variable
 *     Static Variable
 *     Abstract Method
 *     Concrete Method
 *     
 *  Implemented class of Abstract class must implement
 *    Constructor other than default / no - argument constructor
 *    Abstract method
 *    
 *  Abstract Class can extends Other Abstract class
 *  Abstract Class can implement Interface
 */

/**
 *  Output 
 *  ----------------------
 *  Rose :: Type = Flower :: id = 1 ::  name = Mister Lincoln :: color :: Red
 * @author Sayantan
 *
 */

abstract class AbstractPart {
	
	String type;
}

abstract class AbstractFlower extends AbstractPart {
	
	String name;
	String color;
	static int id;
	
	AbstractFlower() {
		
		super.type = "Flower";
	}
	
	AbstractFlower(String name, String color) {
		
		this();
		
		id++;
		this.name = name;
		this.color = color;
	}
	
//	abstract static void setId(int id);
	
	abstract void show();
	
	void display() {
		this.show();
	}
}

class Rose extends AbstractFlower {

	Rose(String name, String color) {
		super(name, color);
	}

	@Override
	void show() {
		System.out.println("Rose :: Type = " + type + " :: id = " + id + " ::  name = " + name + " :: color :: " + color);
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
//		Flower misterLinconRose = (Rose) new Flower("Mister Lincoln", "Red");
		
		AbstractFlower misterLinconRose = (Rose) new Rose("Mister Lincoln", "Red");
		
		misterLinconRose.display();
	}

}
