package Thirteenth_June;

import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) { 
		
		Consumer<String> c = (y) -> System.out.println(y);
		c.accept("Consumer Interface");
	}
}
