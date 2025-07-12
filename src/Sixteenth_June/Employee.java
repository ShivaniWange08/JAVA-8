package Sixteenth_June;

public class Employee {

private int id;
	
	private String fname;
	
	private String lName;
	
	private String city;
	
	private String gender;
	
	private int age;
	
	private int Salary;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lName=" + lName + ", city=" + city + ", gender=" + gender
				+ ", age=" + age + ", Salary=" + Salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	
}
