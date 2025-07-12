package Thirteenth_June;

import java.util.function.BiFunction;

public class BiFunctionInterface {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bf = (a, b) -> (a+b)/2;
		System.out.println("Avg of two numbers : " +bf.apply(20, 27)); 
	}
}
