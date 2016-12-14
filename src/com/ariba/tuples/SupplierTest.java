package com.ariba.tuples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("David");
		names.add("Sam");
		names.add("Ben");

		names.stream().forEach((x) -> {
			printNames(() -> x);
		});

	}

	static void printNames(Supplier<String> arg) {
		System.out.println(arg.get());
	}
}