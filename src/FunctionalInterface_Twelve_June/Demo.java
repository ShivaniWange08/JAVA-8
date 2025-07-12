package FunctionalInterface_Twelve_June;

public class Demo {

	public static void main(String[] args) {
		
		Calculator c = (a, b) -> a+b;
		int sum = c.doOperation(28, 34);
		System.out.println("Addition of Two Numbers : "+sum);
		
		Calculator d = (a, b) -> a-b;
		int sub = d.doOperation(34, 28);
		System.out.println("Substraction of Two Numbers : "+sub);
		
		Calculator e = (a, b) -> a*b;
		int mul = e.doOperation(67678, 897);
		System.out.println("Multiplication of Two Numbers : "+mul);
		
		Calculator f = (a, b) -> a/b;
		int div = f.doOperation(50, 25);
		System.out.println("Division of Two Numbers : "+div);
				
		
	}
}
