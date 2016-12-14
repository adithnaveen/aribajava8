package com.ariba.streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// program to show working of try with resources 
public class StreamEx1 {
	public static void main(String[] args) throws IOException {
		
		// in java upto 7 , the files has to be explicitly closed.  Failing which the lock for the file is taken 
		// data will not be persisted in the file 
		FileWriter fw = null ;
		BufferedWriter bw = null ; 
		try{
		 fw  = new FileWriter("sample.txt");
		 bw = new BufferedWriter(fw);
		
		bw.write("Hello");
		bw.newLine();
		bw.write("how");
		bw.newLine();
		bw.write("are");
		bw.newLine();
		bw.write("you");
		bw.newLine();
		
		
		System.out.println("Data Written... ");
		
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			try {
				bw.close();
				fw.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		// jdk 1.8
		
		try(
				FileWriter fw1 = new FileWriter("sample1.txt");
				BufferedWriter bw1= new BufferedWriter(fw1);
				){
					bw1.write("This is in java 8 version ");
					bw1.newLine();
					bw1.write("Another line for test");
					bw1.newLine();
		}
		
		
		
	}
}
