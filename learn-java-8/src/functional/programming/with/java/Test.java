package functional.programming.with.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<String> llNames = new LinkedList<>();
		
		llNames.add("Gaurav");
		llNames.add("Rahul");
		llNames.add("pawan");
		llNames.add("John");
		
		llNames.add(2, "krisna");
		
		
		
		ArrayList<String> alNames = new ArrayList<>();
		
		alNames.add("Gaurav");
		alNames.add("Rahul");
		alNames.add("pawan");
		alNames.add("John");
		
		llNames.forEach(System.out::println);

	}

}
