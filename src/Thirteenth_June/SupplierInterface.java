package Thirteenth_June;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		Supplier<String> s = () -> "Supplier Interface";
		System.out.println(s.get());
	}
}
