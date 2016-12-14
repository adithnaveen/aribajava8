package com.ariba.collectors;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsEx5 {
	public static void main(String[] args) {
		List<Product> list   = Arrays.asList(
				new Product("laptop", 33, new BigDecimal("65000.00")),
				new Product("laptop", 11, new BigDecimal("23000.67")), 
				new Product("marker", 133, new BigDecimal("12.50")), 
				new Product("marker", 21, new BigDecimal("19.99")), 
				new Product("tag", 30, new BigDecimal("3.67")),
				new Product("paper", 32, new BigDecimal("3.67")),
				new Product("paper", 32, new BigDecimal("3.67"))
			);
		
		
		Map<String, Integer> sum = list.stream().collect(
				Collectors.groupingBy(Product ::getName, Collectors.summingInt(Product::getQty))
				);
		
		
		System.out.println(sum);
		
		System.out.println("--------------------------------------");
		
		Map<BigDecimal, List<Product>> groupByPriceMap = 
				list.stream()
				.collect(Collectors.groupingBy(Product::getPrice));
		
		System.out.println(groupByPriceMap);
		
		
		
		System.out.println("--------------------------------------");
		
		Map<BigDecimal, Set<Product>> groupByPriceMap1 = 
				list.stream()
				.collect(Collectors.groupingBy(Product::getPrice, Collectors.toSet()));

		System.out.println(groupByPriceMap1);

		

		System.out.println("--------------------------------------");
		
		Map<BigDecimal, Set<String>> groupByPriceMap2 = 
				list.stream()
				.collect(Collectors.groupingBy(Product::getPrice, Collectors.mapping(Product::getName, Collectors.toSet())));

		System.out.println(groupByPriceMap2);


		System.out.println("--------------------------------------");
		
		Map<BigDecimal, Set<Integer>> groupByPriceMap3 = 
				list.stream()
				.collect(Collectors.groupingBy(Product::getPrice, Collectors.mapping(Product::getQty, Collectors.toSet())));

		System.out.println(groupByPriceMap3);

		
		
	}
}
