public class MainClass {
	public static void main(String[] arg) {
		IceCream i1 = new IceCream();
		
		i1.icecreamType = "Vanilla" ;
		i1.icecreamCompany = "Igloo" ;
		i1.icecreamPrice = 45.50 ;
		
		System.out.print("Hello");
		IceCream i2 = new IceCream("Chocolate", "Polar", 35 ) ;
	
		IceCream.displayIcecream(i2);
	
}
}
