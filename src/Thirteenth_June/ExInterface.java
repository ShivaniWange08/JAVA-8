package Thirteenth_June;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExInterface {

	public static void main(String[] args) {
		
		Predicate<Integer> pred = (x) -> x%2==0;
		Function<Integer, Integer> func = (y) -> y*y;
		Supplier<Integer> supp = () -> 1212;
		Consumer<Integer> cons = (d) -> System.out.println(d);
		
		if(pred.test(supp.get())) {
			cons.accept(func.apply(supp.get()));
		}
	}
}
