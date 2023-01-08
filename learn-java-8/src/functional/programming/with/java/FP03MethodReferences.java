/**
 * 
 */
package functional.programming.with.java;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author gkrishna
 *
 */
public class FP03MethodReferences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5 , 6, 7);
		
		
		Predicate<Integer> evenPredicate = x -> x%2 == 0;
		Predicate<Integer> oddPredicate = x -> x%2 != 0;
		
		filterAndPrint(numbers, evenPredicate);
		
		filterAndPrint(numbers, oddPredicate);
		
		filterAndPrint(numbers, x -> x > 4);

	}
	
	
/*
 * Here were are passing logic as a parameter to a method
 */
	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream()
			.filter(predicate)
			.forEach(System.out::println);
	}
}
