/* ========================================================================== */
/*	PROGRAM Price Stock Machine
    AUTHOR: Yuri Khechoyan & Jessie Wilkins
    COURSE NUMBER: CIS 210
    COURSE SECTION NUMBER: 01
    INSTRUCTOR NAME: Dr. Tian
    PROJECT NUMBER: 6
    DUE DATE: 9/29/2016
SUMMARY
	
	
INPUT


OUTPUT


ASSUMPTIONS
- None
*/

public class PriceStockSimulation {
	public static void main(String[] args){
		String companyName = new String();
		String companySymbol = new String();
		double currentPrice = 0;
		double nextPrice = 0;
		double priceChange = 0;
		double percentChange = 0;
		
		
		Stock object = new Stock();
		
		System.out.print("Please enter the name of the stock: ");
		object.setName(companyName);
		System.out.print("Please enter the symbol of the stock: ");
		object.setSymbol(companySymbol);
		System.out.print("Please enter yesterday's price: ");
		object.setCurrentPrice(currentPrice);
		object.priceChange();
		companyName = object.getName();
		companySymbol = object.getSymbol();
		currentPrice = object.getCurrentPrice();
		nextPrice = object.getNextPrice();
		
		
		
	}
}
