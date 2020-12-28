
public class Calculator {
	
	public double a;
	public double b;
	double res;
	
	Calculator(){
		
	}
	Calculator(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public double Add(double a, double b) {
		try {
	    res = a + b;
		//return res;
	    if (a < 0 || b < 0) { 
			
			System.out.println("ArithmeticException");
		}
	}
		catch(ArithmeticException e) {
			if (a < 0 || b < 0) { 
				
			System.out.println(e);
		}
		}
		return res;
		
	}
	
	
	public double Subtract(double a, double b) {
		try {
		res = a - b;
		  if (a < 0 || b < 0) { 
				
				System.out.println("ArithmeticException");
			}
	}
	
	catch(ArithmeticException e) {
		System.out.println(e);
	}
		return res;
	}
	
	public double Multiply(double a, double b) {
		try {
		res = a * b;
		  if (a == 0 || b == 0) { 
				
				System.out.println("ArithmeticException");
			}
	}
		catch(ArithmeticException e ) {
			System.out.println(e);
		}
		return res;
	}
	
	public double Division(double a, double b) {
		try {
			res = a / b;
		}
		catch(ArithmeticException e) {
		System.out.println(e);
		}
		return res;
	}
	
}
