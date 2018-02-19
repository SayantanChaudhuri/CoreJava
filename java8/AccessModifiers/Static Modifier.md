
Static Modifiers used in

1. Class 
2. Variable
3. Method 

Notes:
===================================

1. Static block executes before constructor
2. Static block execute only one time
3. Static variable accessed by Class
4. Default static variable initialize to 0
5. Non Static Block execute for every object creation but execute before constructor
6. Non Static member cannot access inside static block or static method

Output:
================================

------------------------ Static Block ----------------------------------------
Inside Static Block :: Before Initialization :: serialNo = 0
Inside Static Block :: After Initialization :: serialNo = 10

----------------------- Object 1 ----------------------------------------------
Inside Non Static Block :: Before Initilization :: serialNo = 10 :: maxAccessed = 0
Inside Non Static Block :: After Initilization :: serialNo = 10::  maxAccessed = 20
Inside Static Modifier Constructor :: serialNo = 11 :: maxAccessed = 21
Inside Main :: object1 :: serialNo = 11
Inside Static Display :: serialNo = 11
Inside Non-Static Display :: serialNo = 11 :: maxAccessed = 21

----------------------- Object 2 ----------------------------------------------
Inside Non Static Block :: Before Initilization :: serialNo = 11 :: maxAccessed = 0
Inside Non Static Block :: After Initilization :: serialNo = 11::  maxAccessed = 20
Inside Static Modifier Constructor :: serialNo = 12 :: maxAccessed = 21
Inside Main :: object2 :: serialNo = 12
Inside Static Display :: serialNo = 12
Inside Non-Static Display :: serialNo = 12 :: maxAccessed = 21
