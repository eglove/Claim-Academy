package stock;
import java.text.DecimalFormat;

public class StockPurchase {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		
		int savings = 25000;
		int stockPrice = 989;
		
		int shares = savings / stockPrice;
		double cd = (double)savings - (double)(shares * stockPrice);
		
		System.out.println("Buy " + shares + " shares of stock.");
		System.out.println("Invest $" + df.format(cd) + " in CD account.");
	}

}
