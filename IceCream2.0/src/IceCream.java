

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
		 System.out.println("Icecream Type : " + obj.icecreamType);
		 System.out.println("Icecream Company : " + obj.icecreamCompany);
		 System.out.println("Icecream Price : " + obj.icecreamPrice);
		 System.out.println();

	 }
//	public int number(int y) {
//		//Scanner input = new Scanner (System.in);
//		//System.out.print("Enter Number of IceCreams :  ");
//		
//		//int n = input.nextInt();
//		//input.close();
//		
//		IceCream [] num = new IceCream[y];
//	}
	
}
