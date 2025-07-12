package FunctionalInterface_Twelve_June;

import java.util.function.Function;

public class Main_FunctionInterFace {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = (x) -> x*2;
		int result = f.apply(8182027);
		System.out.println("multiplication is : "+result);
	}
}
