/**
 * 
 */
package functional.programming.with.java;

import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @author gkrishna
 *
 */
public class FP02FunctionalInterfaces {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5 , 6, 7);
		
		
//		FunctionalInterfaces
		Predicate<Integer> isEvenPredicate = x -> x%2==0;
		
		Function<Integer, Integer> squaredFunction = x -> x * x;
		Function<Integer, String> stringOutputFunction = x ->  x + " ";
		
		Consumer<Integer> printConsumer = System.out::println;
		Consumer<Integer> printConsumer1 = x -> System.out.println(x);
		
//		No input Return something
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
//		System.out.println(randomIntegerSupplier.get());
		
		BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x + y;
		
		UnaryOperator<Integer> unaryOperator = x -> 3 * x ;
		
		
//		BiPredicate<T, U>
//		BiFunction<T, U, R>
//		BiConsumer<T, U>
		
		
//		IntBinaryOperator
//		IntConsumer
//		IntFunction<R>
//		IntPredicate
//		IntSupplier
//		IntToLongFunction
//		IntToDoubleFunction
//		IntUnaryOperator
		
		// Boolean Long Double Float
		
		
		
		numbers.stream()
			.filter(isEvenPredicate)
			.forEach(printConsumer);
		
	}


}
