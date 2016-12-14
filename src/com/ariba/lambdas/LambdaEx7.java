package com.ariba.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// program to show working of custom consumer 
// this is for testing, replacing System.out :: println with 
/// out own customer function 


class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// you can so anything 
		System.out.println("Val " + t);
	}
}

public class LambdaEx7 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10; i++) list.add(i);
		
		// using consumer interface directly 
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Values is " + t);
			}
			
		});
		/////////////////////////// 
		
		
		System.out.println("----------------using custom consumer ---------------- ");
		
		MyConsumer mc = new MyConsumer();
		list.forEach(mc);
		
		
		
		
		
		
		
		
	}
}
