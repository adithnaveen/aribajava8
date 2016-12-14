package com.ariba.defaultstatic;

interface IFirst{
	default void log(){
		System.out.println("Hi i'm from IFirst ");
	}
	
	public static void callMeFirst(){
		System.out.println("i'm there first ");
	}
}

interface ISecond{
	default void log(){
		System.out.println("Hi I'm from ISecond");
	}
}

class MyJob implements IFirst, ISecond{

	@Override
	public void log() {
		System.out.println("i'll have my logging stuffs.. ");
	}
	
}
public class DefaultEx1 {
	public static void main(String[] args) {
		MyJob mj = new MyJob();
		mj.log();
		
		IFirst.callMeFirst();
	}
}	
