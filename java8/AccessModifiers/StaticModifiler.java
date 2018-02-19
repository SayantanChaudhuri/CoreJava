package java8.AccessModifiers;

/**
 * 
 * Important Notes
 * ==================================================
 * 1. Static block executes before constructor
 * 2. Static block execute only one time
 * 3. Static variable accessed by Class
 * 4. Default static variable initialize to 0
 * 5. Non Static Block execute for every object creation but execute before constructor
 * 6. Non Static member cannot access inside static block or static method
 */


/**
 * 
 * Output 
 * ------------------------ Static Block ----------------------------------------
 * Inside Static Block :: Before Initialization :: serialNo = 0
 * Inside Static Block :: After Initialization :: serialNo = 10
 *
 * ----------------------- Object 1 ----------------------------------------------
 * Inside Non Static Block :: Before Initialization :: serialNo = 10 :: maxAccessed = 0
 * Inside Non Static Block :: After Initialization :: serialNo = 10::  maxAccessed = 20
 * Inside Static Modifier Constructor :: serialNo = 11 :: maxAccessed = 21
 * Inside Main :: object1 :: serialNo = 11
 * Inside Static Display :: serialNo = 11
 * Inside Non-Static Display :: serialNo = 11 :: maxAccessed = 21
 * 
 * ----------------------- Object 2 ----------------------------------------------
 * Inside Non Static Block :: Before Initialization :: serialNo = 11 :: maxAccessed = 0
 * Inside Non Static Block :: After Initialization :: serialNo = 11::  maxAccessed = 20
 * Inside Static Modifier Constructor :: serialNo = 12 :: maxAccessed = 21
 * Inside Main :: object2 :: serialNo = 12
 * Inside Static Display :: serialNo = 12
 * Inside Non-Static Display :: serialNo = 12 :: maxAccessed = 21
 * 
 */

public class StaticModifiler {

	static int serialNo;
	
	int maxAccessed;
	
	static{
		
		System.out.println("------------------------ Static Block ----------------------------------------");
		System.out.println("Inside Static Block :: Before Initialization :: serialNo = " + serialNo);
		serialNo = 10;
		System.out.println("Inside Static Block :: After Initialization :: serialNo = " + serialNo);
	}
	
	{
		System.out.println("Inside Non Static Block :: Before Initilization :: serialNo = " + serialNo + " :: maxAccessed = " + maxAccessed);
		maxAccessed = 20;
		System.out.println("Inside Non Static Block :: After Initilization :: serialNo = " + serialNo + "::  maxAccessed = " + maxAccessed);
	}
	
	StaticModifiler() {
		
		serialNo++;
		maxAccessed++;
		
		System.out.println("Inside Static Modifier Constructor :: serialNo = " + serialNo + " :: maxAccessed = "+ maxAccessed);
	}
	
	static void staticDisplay() {
		
		System.out.println("Inside Static Display :: serialNo = " + serialNo);
	}
	
	void display() {
		
		System.out.println("Inside Non-Static Display :: serialNo = " + serialNo +  " :: maxAccessed = "+ maxAccessed);
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("\n----------------------- Object 1 ----------------------------------------------");
		
		StaticModifiler object1 = new StaticModifiler();

		System.out.println("Inside Main :: object1 :: serialNo = " + StaticModifiler.serialNo);
		StaticModifiler.staticDisplay();
		object1.display();
		
		System.out.println("\n----------------------- Object 2 ----------------------------------------------");
		
		StaticModifiler object2 = new StaticModifiler();
		
		System.out.println("Inside Main :: object2 :: serialNo = " + StaticModifiler.serialNo);
		
		StaticModifiler.staticDisplay();
		object2.display();
	}

}
