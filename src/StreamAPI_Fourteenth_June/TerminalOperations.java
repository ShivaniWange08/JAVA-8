package StreamAPI_Fourteenth_June;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {
		
		//console
		//collection
		List<Integer> list = Arrays.asList(1,2,3,3,4,4,5);
		
		//consumer is the terminal operator
		//Consumer<Integer> c = (z) -> System.out.println(z);
		//for each -> print on console
	    list.stream().forEach((z) -> System.out.println(z));
	    
	    //print output in the form of list
	    List<Integer> li = list.stream().collect(Collectors.toList());
	    System.out.println("Output in List : "+li);
	    
	    //count of list
	    long count = list.stream().count();
	    System.out.println("Count of list : "+count);
	    
	    //unique numbers from the list
	    long count2 = list.stream().distinct().count();
	    System.out.println("count of unique numbers from list : "+count2);
	    
	    //sum of complete list
	    Optional<Integer> sum = list.stream().reduce((x,y) -> x+y);
	    System.out.println("Sum of total list : "+sum.get());
	    
	    //Short-Circuiting[Terminal Operators]
	    //anyMatch, allMatch, noneMatch
	    System.out.println("Student name having name length is four : ");
	    List<String> studentName = Arrays.asList("Shiavni", "Om","Ajay","Yogita","Shubham","Shreya","Shubhada","Gaurav","Mayur","Morya");
	    boolean v = studentName.stream().
	    		anyMatch(x -> x.length() == 4);
	    System.out.println(v);
	    
	    System.out.println("Student name having name greater than 3 : ");
	    boolean v1 = studentName.stream().
	    		anyMatch(y -> y.length() > 3);
	    System.out.println(v1);
	    
	    System.out.println("Student name which starts with S : ");
	    boolean v2 = studentName.stream().
	    		allMatch(z -> z.startsWith("S"));
	    System.out.println(v2);
	}
}
