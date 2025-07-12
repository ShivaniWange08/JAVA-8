package Sixteenth_June;

import java.util.List;
import java.util.Optional;

public class StreamMain {

	public static void main(String[] args) {
		
		List<Employee> elist = EmployeeRepo.getListOfEmployee();
		
		for(Employee e : elist) {
			//get firstName and Salary 
			System.out.println(e.getFname());
			System.out.println(e.getSalary());
			System.out.println("************");
			//get empName having salary > 200000
			if(e.getSalary() > 200000) {
				System.out.println(e.getFname());
			}
		}
		System.out.println("************");
		//to getTotalSalary
		int totalSalary = 0;
		for(Employee e1 : elist) {
			totalSalary = totalSalary +e1.getSalary();
		}
		System.out.println("Total Salary : "+totalSalary);
		
		System.out.println("--------------------------------------------------------------------------");
		//get firstName and Salary 
		elist.stream()
		.forEach(k -> {
			System.out.println(k.getFname());
			System.out.println(k.getSalary());
			});
		System.out.println("************");
		//get empName having salary > 200000
		elist.stream()
		.filter(k -> k.getSalary() > 200000)
		.forEach(x -> System.out.println(x.getFname()));
		
		System.out.println("************");
		// IN upper case
		elist.stream()
		.map(m -> m.getFname().toUpperCase())
		.forEach(k -> System.out.println("Emp in UpperCase : "+k));
		
		System.out.println("************");
		//get totalSalary using streamApi
		Optional<Integer> salarySum = elist.stream()
				.map(k -> k.getSalary())
				.reduce((x,y) -> x+y);
		System.out.println("Total Salary :"+salarySum.get());
	} 
}
