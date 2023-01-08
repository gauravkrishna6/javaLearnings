/**
 * 
 */
package functional.programming.with.java;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author gkrishna
 *
 */
public class FP03FunctionalInterfaces2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5 , 6, 7);
		
		
		
		Predicate<Integer> isEvenPredicate = x -> x%2==0;
		Function<Integer, Integer> squaredFunction = x -> x * x;
		Consumer<Integer> printConsumer = System.out::println;
		
		numbers.stream()
			.filter(isEvenPredicate)
			.map(squaredFunction)
			.forEach(printConsumer);
		
		
		numbers.stream()
			.filter(x -> x%2 !=0)
			.map(x -> x*x)
			.forEach(System.out::println);
		
		
//		BinaryOperator<Integer> sumAccumulator = Integer::sum;
		BinaryOperator<Integer> sumAccumulator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				
				return t + u;
			}
		
		};
		numbers.stream()
			.reduce(0, sumAccumulator);
	}


}
