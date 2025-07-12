package StreamAPI_Fourteenth_June;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperation_ {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,56,7,32,1,4);
		//filter
		// case 1 - print even
		list.stream().filter(x -> x%2 == 0).forEach(t -> System.out.println(t));
		
		//case 2 - store even in list
		List<Integer> evenList = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		System.out.println("List of even numbers : "+evenList);
		
		//case 3 - count of even no
		long countEven = list.stream().filter(x -> x%2 == 0).count();
		System.out.println("Count of even numbers is : "+countEven);
	}
}
