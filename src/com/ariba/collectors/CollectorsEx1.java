package com.ariba.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsEx1 {
	public static void main(String[] args) {
		List<Office> offices = new ArrayList<Office>();
		
		offices.add(new Office("Ariba", "Bengaluru"));
		offices.add(new Office("Ariba", "USA"));
		offices.add(new Office("Google", "USA"));
		offices.add(new Office("Apple", "USA"));
		offices.add(new Office("Infosys", "Mangaluru"));
		offices.add(new Office("ProBits", "Bengaluru"));
		
		Map<String, Long> counting = offices.stream().collect(
				Collectors.groupingBy(Office::getName, Collectors.counting())
				);
				
				
		System.out.println(counting);
		
		System.out.println("-------------------------------------------");
		
		Map<String, Long> cityCount = offices.stream().collect(

				Collectors.groupingBy(Office::getCountry, Collectors.counting())
				);
		
		
		System.out.println(cityCount);
		
		
		System.out.println("------------------------------------------");

		Map<String, Long> cityCount1 = offices.stream().collect(

				Collectors.groupingBy(Office::getCountry, Collectors.counting())
				);
		
		
	}
}
