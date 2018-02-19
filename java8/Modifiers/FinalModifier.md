
Final modifier used in
  
	*   Class
	*   Variable
	*   Method
    
  
Final Class: 
	Class cannot be inherited / extend. All method calls of a final class be resolved at compile time itself.
    			  It does not means all members not final unless final modifier add in declaration
    
Final Variable: 
	* Value cannot be changed after assigned
    * Non Static variable must be initialize inside constructor / non static block if not initialize at time of declaration
    * Static variable must be initialize inside static block if not initialize at time of declaration
     				 
Final Method: cannot be overridden



Output
-------------------
Inside FinalVehicleClass :: display :: vin = 0 :: modelName = null
Inside FinalVehicleClass :: display :: vin = 100 :: modelName = Ferari