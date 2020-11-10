
public class IceCream {
	 String icecreamType ;
	 String icecreamCompany ;
	 double icecreamPrice ;
	 
	 IceCream(){
		 
	 }
	 
	 IceCream(String iceType, String iceComp, double icePrice ) {
		 icecreamType = iceType;
		 icecreamCompany = iceComp;
		 icecreamPrice = icePrice;
	 }
	 
	public static void displayIcecream(IceCream obj) {
//		 System.out.println("Icecream Type : " + icecreamType);
//		 System.out.println("Icecream Company : " + icecreamCompany);
//		 System.out.println("Icecream Price : " + icecreamPrice);
//		 System.out.println();
		 
		 IceCream.displayIcecream(obj);
	 }
	 
	public static void main () {
		IceCream i1 = new IceCream();
		
		i1.icecreamType = "Vanilla" ;
		i1.icecreamCompany = "Igloo" ;
		i1.icecreamPrice = 45.50 ;
		
		System.out.print("Hello");
		IceCream i2 = new IceCream("Chocolate", "Polar", 35 ) ;
	
		IceCream.displayIcecream(i2);
	
}
	
 }
