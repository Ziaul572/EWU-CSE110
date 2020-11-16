
public class fraction {
	private int numerator;
	private int denominator;
	
//	fraction (int nume, int deno){
//		numerator = nume;
//		denominator = deno;
//	}
	public void setNumo (int numo) {
		numerator = numo;
	}
	public int getNumo() {
		return numerator;
	}
	public void setDeno(int deno) {
		denominator = deno;
	}
	public int getDeno() {
		return denominator;
	}
	
	public static String toString(int numo, int deno) {
		String msg = numo + " / " + deno;
		return msg;
	}
	
	public static void add(fraction obj1, fraction obj2) {
		int numo, deno;
		numo = ((obj1.numerator * obj2.denominator) + (obj2.numerator * obj1.denominator)) ;
		deno = (obj1.denominator * obj2.denominator);
		System.out.println("Addition");
		
		System.out.println(toString(numo, deno));
	}
	public static void sub(fraction obj1, fraction obj2) {
		int numo, deno;
		numo = ((obj1.numerator * obj2.denominator) - (obj2.numerator * obj1.denominator)) ;
		deno = (obj1.denominator * obj2.denominator);
		System.out.println("Subtraction");
		
		System.out.println(toString(numo, deno));
	}
	public static void multiplication (fraction obj1, fraction obj2) {
		int numo, deno;
		numo = (obj1.numerator * obj2.numerator);
		deno = (obj1.denominator * obj2.denominator);
		System.out.println("Multiplication");
		
		System.out.println(toString(numo, deno));
	}
	public static void division(fraction obj1, fraction obj2) {
		int numo, deno;
		numo = (obj1.numerator * obj2.denominator);
		deno = (obj2.denominator * obj1.numerator);
		System.out.println("Division");
		
		System.out.println(toString(numo, deno));
	}
	
	public static void display(fraction obj1) {
		System.out.printf("The fraction is %d / %d. \n", obj1.numerator, obj1.denominator);
	}
	
}