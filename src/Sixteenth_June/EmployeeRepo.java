package Sixteenth_June;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {
	
	public static List<Employee> getListOfEmployee(){
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee e = new Employee();
		e.setId(101);
		e.setFname("Shivani");
		e.setlName("Wange");
		e.setCity("Pune");
	    e.setGender("Female");
	    e.setAge(23);
	    e.setSalary(3000000);
	    
	    Employee e1 = new Employee();
	    e1.setId(102);
	    e1.setFname("Om");
	    e1.setlName("Wange");
	    e1.setCity("Amravati");
	    e1.setGender("Male");
	    e1.setAge(19);
	    e1.setSalary(35000000);
	    
	    Employee e2 = new Employee();
	    e2.setId(103);
	    e2.setFname("Shubham");
	    e2.setlName("Tadas");
	    e2.setCity("Pune");
	    e2.setGender("Male");
	    e2.setAge(30);
	    e2.setSalary(40000000);
	    
	    Employee e4 = new Employee();
		e4.setId(104);
		e4.setFname("Shreya");
		e4.setlName("Murhekar");
		e4.setAge(21);
		e4.setCity("pune");
		e4.setGender("Female");
		e4.setSalary(250000);
		
		Employee e5 = new Employee();
		e5.setId(105);
		e5.setFname("Gaurav");
		e5.setlName("Murhekar");
		e5.setAge(30);
		e5.setCity("pune");
		e5.setGender("Male");
		e5.setSalary(300000);
		
		Employee e6 = new Employee();
		e6.setId(106);
		e6.setFname("Morya");
		e6.setlName("Kavitkar");
		e6.setAge(32);
		e6.setCity("Banglore");
		e6.setGender("Male");
		e6.setSalary(200000);
		
		Employee e7 = new Employee();
		e7.setId(107);
		e7.setFname("Smit");
		e7.setlName("Murhekar");
		e7.setAge(31);
		e7.setCity("Banglore");
		e7.setGender("Male");
		e7.setSalary(220000);
		
		Employee e8 = new Employee();
		e8.setId(108);
		e8.setFname("Riya");
		e8.setlName("Sawwalakhe");
		e8.setAge(31);
		e8.setCity("Nagpur");
		e8.setGender("Female");
		e8.setSalary(210000);
		
		Employee e9 = new Employee();
		e9.setId(109);
		e9.setFname("Shubhada");
		e9.setlName("Murhekar");
		e9.setAge(23);
		e9.setCity("Aurangabad");
		e9.setGender("Female");
		e9.setSalary(150000);
		
		Employee e10 = new Employee();
		e10.setId(109);
		e10.setFname("sharavn");
		e10.setlName("Murhekar");
		e10.setAge(30);
		e10.setCity("Delhi");
		e10.setGender("Male");
		e10.setSalary(160000); 
		
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		empList.add(e9);
		empList.add(e10);
	    
	    return empList;
	    
	}

}
