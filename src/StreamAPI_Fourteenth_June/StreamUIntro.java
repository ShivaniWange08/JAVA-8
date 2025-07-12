package StreamAPI_Fourteenth_June;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamUIntro {
	
	//this class will explain source
	public static void main(String[] args) {
		
		//helps to achieve functional programming
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//source -> stream
		//stream of list
		Stream<Integer> list = l.stream();
		
		//stream of array
		Integer[] a = {1, 2, 3, 1, 4};
		Arrays.stream(a);
		
		//using stream.of method
		Stream<String> name = Stream.of("Shivani", "Wange");
		
		
	}
	

}
