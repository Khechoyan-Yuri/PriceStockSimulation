import java.util.Random;

public class Stock {
	//Variables
	private String companyName;
	private String companySymbol;
	private double currentPrice;
	private double nextPrice;
	private int randomNumber;
	
	
	public Stock() {
		//Assigns default values for those variables
		companyName = "Microsoft";
		companySymbol = "MSFT";
		currentPrice = 46.87;
		nextPrice = 46.87;
	}
	
	public Stock(String n, String s, double cP, double nP) {
		
		companyName = n;
		companySymbol = s;
		currentPrice = cP;
		nextPrice = nP;
	}
	
	public void setName(String n) {
		
		companyName = n;
	}
	
	public void setSymbol(String s) {
		
		companySymbol = s;
	}
	
	public void setCurrentPrice(double cP) {
		if(cP > 0) {
			currentPrice = cP;
		}
		else {
			
			currentPrice = 1;
		}
	}
	
	public void setNextPrice(double nP) {
		if(nP > 0) {
			nextPrice = nP;
		}
		else {
			
			nextPrice = 1;
		}
	}
	
	public String getName() {
		
		return companyName;
	}
	
	public String getSymbol() {
		
		return companySymbol;
	}
	
	public double getCurrentPrice() {
		
		return currentPrice;
	}
	
	public double getNextPrice() {
		
		return nextPrice;
	}
	
	public double stockPriceChange() {
		Random randInt = new Random();
		randomNumber = randInt.nextInt(10);
		
		return randomNumber;
	}
}
