

public class IceCream {
   	private String icecreamType ;
	private String icecreamCompany ;
	private double icecreamPrice ;
	 
	IceCream (){
		icecreamPrice = 0;
	}
	/* IceCream(){
		 
	 } */
	 
	 IceCream(String iceType, String iceComp, double icePrice ) {
		 icecreamType = iceType;
		 icecreamCompany = iceComp;
		 icecreamPrice = icePrice;
	 } 
	 public void setType(String typ) {
		 icecreamType = typ ;
	 }
	 public String getType () {
		 return icecreamType;
	 }
	 public void setComp(String comp) {
		 icecreamCompany = comp;
	 }
	 public String getComp() {
		 return icecreamCompany;
	 }
	 public void setPrice(double pric) {
		 icecreamPrice = pric;
	 }
	 public double getPrice() {
		 return icecreamPrice;
	 }
	 
	 public boolean equals(IceCream o) {
		 if (icecreamPrice == o.getPrice()) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public int compare (IceCream com) {
		 if(icecreamPrice > com.getPrice()) {
			 return 1;
		 }
		 else if (icecreamPrice < com.getPrice()) {
			 return 0;
		 }
		 else {
			 return -1;
		 }
	 }
	 
	public static void displayIcecream(IceCream obj) {
		 System.out.println("Icecream Type : " + obj.icecreamType);
		 System.out.println("Icecream Company : " + obj.icecreamCompany);
		 System.out.println("Icecream Price : " + obj.icecreamPrice);
		 System.out.println();

	 }

	
}
