package com.ariba.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

// program to generate infinite random numbers and with limits and generate random numbers with sorted order 
public class LambdaEx9 {
	public static void main(String[] args) {
		
		
		
		//  i -> i> 0;
		List<String> strings = Arrays.asList("hello","","how","are", "you");
		List<String> filterString = strings.stream()
												.filter(string -> !string.isEmpty())
												.collect(Collectors.toList());
		
		filterString.forEach(System.out :: println);
		System.out.println("---------------------------------------------- ");
		Random random = new Random();
		// to generate infinite random numbers 
		// random.ints().forEach(System.out :: println);
		
		// the above can be given with limit 
//		random.ints().limit(10).forEach(System.out :: println);
		
		// the random numbers can be generated with sorted order 
//		random.ints().limit(10).sorted().forEach(System.out ::println);
		
		random.ints().sorted().limit(10).forEach(System.out::println);
		
	}
}
