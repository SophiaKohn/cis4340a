//Rule 03: User example
//NUM10-J
//Defective Code:

// Prints 0.1000000000000000055511151231257827021181583404541015625
// when run in FP-strict mode
System.out.println(new BigDecimal(0.1));


//Corrected code:
//Rule 03: User example
//NUM10-J

// Prints 0.1
// when run in FP-strict mode
System.out.println(new BigDecimal("0.1"));
