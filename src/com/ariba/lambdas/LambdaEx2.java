package com.ariba.lambdas;

// program to show working of custom lambda works 

// if we want an lambda then it should be functional interface, a functional interface 
// is an interface which has exactly 1 method in it 

@FunctionalInterface
interface Executable{
	 int execute(int a, int b);
}

@FunctionalInterface
interface StringExecutable {
	String stringExecute(String a, String b);
}

class Runner{
	public void run(Executable e){
		System.out.println("Executable blcok called... ");
		int val = 100;
		int val2 = 200;
		int returnValue = e.execute(val, val2);
		System.out.println("Returned Value got is " + returnValue);
	}
	
	public void run(StringExecutable se){
		System.out.println("Execute String Block Called... ");
		String str = se.stringExecute("hello", "World");
		System.out.println("Contact String is " + str);
	}
	
	
}



/*
 * 
 * Version 1.0 
 * // in lambda way 
		runner.run(() -> System.out.println("This is in lambda block") );
 * 
 */

/*
 * Version 2.0 
 * you can have multiple statement in the lambda block 
 * runner.run(() -> 
		{
			System.out.println("This is in main block ");
			System.out.println("i can do much more things here ");
		}
 */

/*
 * Version 3.0 
 * You can return the values from the lambda block
 * and make sure your execute method will also have the same signature  
 * runner.run(() -> 
		{
			System.out.println("This is in main block ");
			System.out.println("i can do much more things here ");
			return 20;
		}
 */

/*
 * Version 4.0 
 * you can return the value either by specifying return statement or without
 * runner.run(() ->  return 20); 
 * 		runner.run(() ->  20);
 */


/*
 * Version 5.0 
 * You can pass values to lambda 
 * runner.run((int a) -> 20+a);
 */

/*
 * Verion 6.0
 * You need not specify the datatype when using lambda, because its already defined in Interface  
 * 		runner.run(( a) -> 20+a);

 * 
 */

/*
 * Version 7.0 
 * When you have only one parameter then giving paranthesis is not required 
 * 		runner.run(a-> 20+a);
 * 
 */

/*
 *Version 8.0 
 * you can have multiple lines of code in lambda 
 * Note: you have to have return statement when you have multiple statements 
 *runner.run(a-> {
			System.out.println("you can have some business login in Lambda ");
			return 20+a;
			}); 
 * 
 */



public class LambdaEx2 {
	public static void main(String[] args) {
		Runner runner = new Runner();
		
		// old way 
		
		runner.run(new Executable() {
			
			@Override
			public int execute(int a, int b) {
				System.out.println("Execute called in ananymous block ");
				return 30 + a + b;
			}
		});
		
		
		System.out.println("-------------------------------- ");
		// in lambda way 
		
		// execute()
		// upto jdk 1.7 using the local variable in the anonymous functions were not allowed 
		// once you declare and initialize the values for the variable it cannot mutated 
		// it should be final or effectively final (only in 1.8) 
		 int d = 1000;
		 
		 // d = 2000;
		 
		 // when your runner class has multiple run methods the specifying the datatype is 
		 // mandatory if not its an ambigious call 
		runner.run((int a, int b)-> {
			
			int e = 333;
			
			System.out.println("you can have some business login in Lambda ");
			return 20+a +b +d;
			});
		
		
		System.out.println("----------------------------------------");
		
		
		Executable ex =  ( a,  b) -> a + b; 
	
		
		Object ex1 =  (Executable) ( a,  b) -> a + b; 
		
		System.out.println("Computation Result " + 
				ex.execute(20,30));
				
		System.out.println("Computation Result result stored in Object " + 
				((Executable) ex1).execute(200,300));
			
		
		runner.run((String str1, String str2) -> {
			System.out.println("Inside Lambda ");
//			return str1.
			return "hi";
		});
	}
}













