package com.ariba.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// program to show sorting of user defined objects 

class Person{
	private int pId;
	private String pName;
	
	
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	
	
}


public class LambdaEx4 {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person(101, "Harsha"), 
				new Person(44, "Lakshmi"),
				new Person(78, "Sudhanshu"), 
				new Person(100, "Ajay"), 
				new Person(50, "Rick"), 
				new Person(22, "Naveen")
				);
		
		
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getpName().compareTo(o2.getpName());
			}
		});
		
		for(Person temp : personList){
			System.out.println(temp);
		}
		
		
		// in lambda way 
		System.out.println("----------------------Descending order of Name---------------------------------");
		personList.sort((Person o1, Person o2) -> o2.getpName().compareTo(o1.getpName()));
		personList.forEach((person) -> System.out.println(person));
		
		System.out.println("--------------- Ascending Order of PID-------------- ");
		Comparator<Person> onPID = ( o1,  o2) -> o1.getpId() - o2.getpId();
		personList.sort(onPID);
		personList.forEach(System.out :: println);
		
		System.out.println("---------------- Descending order of PID ------------------- ");
		personList.sort(onPID.reversed());
		personList.forEach(System.out :: println);

	}
}
















