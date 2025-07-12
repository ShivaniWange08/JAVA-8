package FunctionalInterface_Twelve_June;

import java.util.function.Predicate;

public class Main_PredicateFunction {

	public static void main(String[] args) {
		
		Predicate<Integer> p = (a) -> a%2 == 0;
		System.out.println(p.test(24));
	}
}
