package com.ariba.tuples;

import java.util.ArrayList;
import java.util.List;

class Tuple<A, B, C> {
	private final A a;
	private final B b;
	private final C c;

	public Tuple(A a, B b, C c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public A getA() {
		return a;
	}

	public B getB() {
		return b;
	}

	public C getC() {
		return c;
	}

}


class Emp{}

public class Ex1 {
	
	public static Tuple<String, Integer, Boolean> getMe(){
		return new Tuple<String, Integer, Boolean>("Hello",200, true);
	}
	
	public static Tuple<String, String, String> getMe1(){
		return  new Tuple<String, String, String>("hello", "how",  "are");
	}

	public static Tuple<String, String, Emp> getMe2(){
		return  new Tuple<String, String, Emp>("hello", "how",  new Emp());
	}
	
	
	public static void main(String[] args) {
		Tuple<String, String, String> myOjb = getMe1();
		
		System.out.println("first " + myOjb.getA());
		System.out.println("Second " + myOjb.getB());
		System.out.println("Third " + myOjb.getC());
		
		List<Tuple<String, String, String>> mylist = new ArrayList<Tuple<String, String, String>>();
	}
}















