package com.ariba.collectors;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsEx4 {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList(
				"apple", "banana", "Apple", "pineapple", "apple", "pineapple"
				);
		
		// 3 apple, 1 banana, 2 pineapple 
			
		Map<String, Long> result = 
				fruits.stream()
				.map(name -> name.toUpperCase())
				.collect(
						Collectors.groupingBy(Function.identity(), Collectors.counting())
						);
		
		
		System.out.println(result);
	}
}
