package com.ariba.lambdas;

// program to work with lambda on mathematics 

@FunctionalInterface
interface MathOperation{
	int operation(int a, int b);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		// let's define the job 
		
		MathOperation addition = (int a, int b) -> a+b;
		MathOperation substraction = (a, b) -> a- b;
		MathOperation multiplication = (a, b) -> {return a * b;};

		LambdaEx3 le = new LambdaEx3();
		System.out.println("Addition is " + le.operate(100, 200, addition));
		System.out.println("Substraction is " + le.operate(200, 60, substraction));
		System.out.println("Multiplication " + le.operate(22, 33, multiplication));
	}
	
	
	private int operate(int a, int b, MathOperation mo){
		return mo.operation(a, b);
	}
	
}
