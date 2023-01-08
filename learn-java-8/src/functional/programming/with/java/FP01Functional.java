/**
 * 
 */
package functional.programming.with.java;

import java.util.List;

/**
 * @author gkrishna
 *
 */
public class FP01Functional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> listofNumbers = List.of(1, 2, 3, 45, 7, 12, 6, 23);
		List<String> listOfSubjects = List.of("Spring", "Spring boot", "api","microservices", "aws", "pcf", "docker", "kubernets");
		
		printListFunctional(listofNumbers);
		printOddNumbersfromList(listofNumbers);
		printAllCoursesIndividually(listOfSubjects);
		printCoursesContaining(listOfSubjects, "Spring");
		printCoursesWithLengthMoreThan(listOfSubjects, 4);
		printSquaresOfEvenNumbers(listofNumbers);
		printCubesOfOddNumbers(listofNumbers);
		printNumOfCharsInCourse(listOfSubjects);
	}
	
	

	private static void printNumOfCharsInCourse(List<String> listOfSubjects) {

		listOfSubjects.stream()
			.map(sub -> sub.length())
			.forEach(System.out::println);
	}



	private static void printCubesOfOddNumbers(List<Integer> listofNumbers) {
		
		listofNumbers.stream()
			.filter(num -> num%2 !=0)
			.map(num -> num*num*num)
			.forEach(System.out::println);
	}



	private static void printSquaresOfEvenNumbers(List<Integer> listofNumbers) {
		listofNumbers.stream()
			.filter(num -> num%2==0)
//			.forEach(n -> System.out.println(n*n))   //better way bellow
			.map(num -> num * num)
			.forEach(System.out::println);
		
	}



	private static void printCoursesWithLengthMoreThan(List<String> listOfSubjects, int threshold) {

		listOfSubjects.stream()
			.filter(sub -> (sub.length() > threshold))
			.forEach(System.out::println);
	}



	private static void printCoursesContaining(List<String> listOfSubjects, String str) {

		listOfSubjects.stream()
			.filter(sub -> sub.contains(str))
			.forEach(System.out::println);
	}



	private static void printAllCoursesIndividually(List<String> listOfSubjects) {
		
		listOfSubjects.stream()
			.forEach(System.out::println);
	}



	private static void printOddNumbersfromList(List<Integer> listofNumbers) {
		listofNumbers.stream()
			.filter(n -> n%2!=0)
			.forEach(System.out::println);
	}



	private static void print(int n) {
		System.out.println(n);
	}

	private static void printListFunctional(List<Integer> numbers) {

		numbers.stream()
			.forEach(FP01Functional::print);
		
		
		numbers.stream()
			.forEach(System.out::println);

		numbers.stream()
			.forEach(n -> System.out.println(n));
	}

}
