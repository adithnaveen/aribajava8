package com.ariba.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

class OrderEntry{
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public OrderEntry(int amount) {
		super();
		this.amount = amount;
	}
	
	
	
}

public class CollectorsEx6 {
	public static void main(String[] args) {
		List<OrderEntry> list = new ArrayList<OrderEntry>();
		list.add(new OrderEntry(100));
		list.add(new OrderEntry(33));
		list.add(new OrderEntry(1212));
		list.add(new OrderEntry(22));
		list.add(new OrderEntry(9));
		
		IntSummaryStatistics stats = list.stream().mapToInt(
					(x) -> x.getAmount()
				).summaryStatistics();
		
		System.out.println("Average : " + stats.getAverage());
		System.out.println("Sum " + stats.getSum());
		System.out.println("Max " + stats.getMax());
		System.out.println("Count " + stats.getCount());
		System.out.println("Min " + stats.getMin());
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

		

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
				.reduce(0, (c, e) -> {
					return c+e;
				})
				);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
