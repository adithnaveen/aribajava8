package com.ariba.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		// for loop 
		System.out.println("-----------Using For Loop--------------------");
		for(int i=0; i<numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
		
		// enchance for loop 
		System.out.println("-------------using enhance for loop ---------------- ");
		for(int temp : numbers){
			System.out.println(temp);
		}
		
		// in lambda way 
		System.out.println("------------ in lambday way ------------------ ");
		numbers.forEach((Integer temp ) -> System.out.println(temp) );
		
		
		// better version in lambda way 
		System.out.println("------------ in lambday way 2------------------ ");
		numbers.forEach(( temp ) -> System.out.println(temp) );
		
		// with method references 
		System.out.println("------------with method refernces ------------------- ");
		numbers.forEach(System.out :: println);
		
		// with consumer 
		System.out.println("-------------- With Consumer ----------------- ");
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		
		// to multiply numbers 
		int res = 0;
		for(int temp : numbers){
			res += temp * 2;
		}
		
		System.out.println("Result is "+ res);
		
		/// using streams 
		System.out.println("Using streams " + 
				numbers.stream()
				.map(e -> e*2)
				.reduce(0, (c, e) -> c+e)
				);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}









