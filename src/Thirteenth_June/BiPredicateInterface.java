package Thirteenth_June;

import java.util.function.BiPredicate;

public class BiPredicateInterface {

	public static void main(String[] args) {
	BiPredicate<Integer, Integer>  bp = (x,y) -> (x+y)%2 == 0;
	System.out.println(bp.test(4,8));
}
}