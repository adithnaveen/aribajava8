package com.ariba.collectors;

import java.util.Arrays;

public class CollectorsEx2 {
	public static void main(String[] args) {
		Number[][] myArray = new Integer [][] {
			{1,2,3, 44}, 
			{4,5,6}, 
			{11,22,33}
		};
		
		double [][] doubleArray = Arrays.stream(myArray)
				.map(
						
						// the pArray will take the array, which is 1 dimensional 
						// which is each row 
					pArray -> Arrays.stream(pArray)
					.mapToDouble(d -> d.doubleValue())
					.toArray()
					)
					.toArray(size -> new double[size] []);
				//.toArray(double[][] :: new);
		
		// tester 
		for(double [] temp : doubleArray){
			System.out.println(Arrays.toString(temp));
		}
	}
}
