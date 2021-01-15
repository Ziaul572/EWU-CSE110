import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Date;

public class StoreBeta extends ProductPurchase{
	
	StoreBeta(){
		
	}
	
	static ArrayList <ProductPurchase> stockList= new ArrayList<ProductPurchase> ();

	Iterator<ProductPurchase> itr = ProductPurchase.iterator();
    
	public void add(ProductPurchase obj) {
		stockList.add(obj);
	}
	public void remove(ProductPurchase obj) {
		stockList.iterator().remove();
	}

//	@Override
public String toString() {

		return super.toString();
	}
	
	
	}
