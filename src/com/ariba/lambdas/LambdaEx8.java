package com.ariba.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// program to show only +ve numbers 


public class LambdaEx8 {
	public static void main(String[] args) {
		Predicate<Integer> positive = i -> i> 0;
		
		// System.out.println(positive.test(-20));
		
		List<Integer> numList = Arrays.asList(1,2,-33,-4,5,-6, 100, -100);
		
		List<Integer> filteredList = filterList(numList, positive);
		
		filteredList.forEach(System.out :: println);
		
		
	}
	
	public static List<Integer> filterList(List<Integer> numList, Predicate<Integer> predicate){
		List<Integer> list = new ArrayList<Integer>();
		
		for(Integer temp : numList){
			if(predicate.test(temp)){
				list.add(temp);
			}
		}
		return list;
	}
	
}
