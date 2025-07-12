package Thirteenth_June;

import java.util.function.BiConsumer;

public class BiConsumerInterface {

	public static void main(String[] args) {
		
		BiConsumer<String, String> bic = (x,y) -> {
			System.out.println("String a :" +x);
			System.out.println("String b :" +y);
		};
		bic.accept("Shivani", "Wange");
	}
}
