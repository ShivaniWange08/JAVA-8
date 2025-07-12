package StreamAPI_Fourteenth_June;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIforString {
	
	public static void main(String[] args) {
		
		List<String> animalName = Arrays.asList("Lion", "Tiger", "Tortoise", "eagle", "Dog");
		
		//list of animal starting with t
		List<String> listOne = animalName.stream().filter(m -> m.startsWith("T")).collect(Collectors.toList());
		System.out.println("List of Animal starting with t : "+listOne);
		System.out.println("******");
		
		//count of animal starting with t
		long count = animalName.stream().filter(l -> l.startsWith("T")).count();
		System.out.println("Count of animal satrting with t : "+count);
		System.out.println("******");
		
		//print all animal in upper case
		System.out.println("All animals in upper case : ");
		animalName.stream().map((l) -> l.toUpperCase()).forEach(k -> System.out.println(k));
		System.out.println("******");
		
		//print animal starting with t in upper case
		System.out.println("Animal starting with t in upper case : ");
		animalName.stream().filter(l -> l.startsWith("T")).map(m -> m.toUpperCase())
		.forEach(k -> System.out.println(k));
		System.out.println("******");
		
		//print animal in alphabetical order
		System.out.println("Animal in Alphabetical Order : ");
		animalName.stream()
		.sorted()
		.forEach(k -> System.out.println(k));
		System.out.println("******");
		
		//print animal in alphabetical order or skip first 2 animal
		System.out.println("Animal in Alphabetical Order after skipping 2 : ");
		animalName.stream()
		.sorted()
		.skip(2)
		.forEach(s -> System.out.println(s));
		System.out.println("******");
		
		//print animal from three
		System.out.println("Animal from three : ");
		animalName.stream()
		.limit(3)
		.forEach(l -> System.out.println(l));
		System.out.println("******");
	}

}
