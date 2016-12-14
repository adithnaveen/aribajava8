package com.ariba.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StreamEx5 {
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get("."))
			.map(Path:: getFileName)
			// peek is basically to do additional job for each iteration 
			.peek(e -> System.out.println("Filtered value: " + e)) 
			.forEach( file -> someThingForFile(file));
		
		
		System.out.println("---------------------------------");
		
		Files.list(Paths.get("."))
		.map(Path::getFileName)
		.map(Path:: toString)
		.filter(name -> name.endsWith(".java"))
		.limit(3)
		.sorted()
		.forEach(System.out :: println);
		
	}	
	
	
	public static void someThingForFile(Path file){
		System.out.println("File is " + file.getFileName());
	}
}
