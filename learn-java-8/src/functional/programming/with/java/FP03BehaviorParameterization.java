/**
 * 
 */
package functional.programming.with.java;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author gkrishna
 *
 */
public class FP03BehaviorParameterization {

	/**
	 * @param args
	 */
	
	
	private static void print(String str) {
		System.out.println(str);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String> subjects = List.of("Spring", "Spring boot", "api","microservices", "aws", "pcf", "docker", "kubernets");
		
		
//		Constructor Reference
		Supplier<String> supplier = String::new;
		
		subjects.stream()
//			.map(str -> str.toUpperCase())
			.map(String::toUpperCase)
			.forEach(FP03BehaviorParameterization::print);
		
		
		
	}
 }
