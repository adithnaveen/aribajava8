package com.ariba.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

// program to show working of parallel sort 
public class StreamEx4 {
	public static void main(String[] args) {
		String [] str = {"this", "is", "for", "testing", "when", "this", "has", "a", "sample"};
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		};
		
		Arrays.parallelSort(str, comparator);
		
		List<String> list = Arrays.asList(str);
		list.forEach(System.out::println);
		System.out.println("----------------------------------------");
		
		// in java 8 way 
		Arrays.parallelSort(str, (x,y ) -> y.compareTo(x));
		
		list = Arrays.asList(str);
		list.forEach(System.out::println);
		
		System.out.println("************************************");
		// with the limits 
		Arrays.parallelSort(str, 0, 4, comparator);
		
		list = Arrays.asList(str);
		list.forEach(System.out::println);
		
		
		
		
		
		
		
	}
}
