package com.ariba.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorEx3 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("---------------------------");
		IntStream.range(20, 30)
		.forEach(i -> list.add(i));
		
		list.forEach(System.out:: println);
		
		list.clear();
		System.out.println("---------------------------------------");
		// to have start inclusive, and end inclusive  
		IntStream.rangeClosed(20, 30)
		.forEach(i -> 
			{
					list.add(i);
			});
		
		list.forEach(System.out :: println);
		
		System.out.println("-------------------------------");
		list.clear();
		
		// we can start with double and increment with any value like int, double 
		Stream.iterate(30.4, i -> i+3.3).limit(10)
		.forEach(System.out :: println);
		
		list.forEach(System.out:: println);

	}
}
