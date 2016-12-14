package com.ariba.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamEx3 {
	public static void main(String[] args) throws IOException {
		 Pattern pattern = Pattern.compile(",");
		 pattern.splitAsStream("a,b,c")
		 .forEach(System.out :: println);
		
		
		
		Pattern patt = Pattern.compile(":");

		try (Stream<String> st = Files.lines(Paths.get("sample.txt"))) {
			st.forEach(new Consumer<String>() {

				@Override
				public void accept(String t) {
					patt.splitAsStream(t).forEach(System.out:: println);
				}
			}
			);
		}

	}
}
