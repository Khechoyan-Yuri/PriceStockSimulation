import java.util.Random;			//Import Random Generator
import java.util.Scanner;			//Import Scanner Object

public class Stock {
	//Variables
	private String companyName;		//String object holding name of Company
	private String companySymbol;	//String object holding Stock Symbol
	private double currentPrice;	//Double holding Current Price of Stock
	private double nextPrice;		//Double holding Next Price of Stock
	private double randomNumber;	//Double holding random Number
	
	
	public Stock() {
		//Assigns default values for those variables
		companyName = "Microsoft";
		companySymbol = "MSFT";
		currentPrice = 46.87;
		nextPrice = 46.87;
	}
	
	public Stock(String n, String s, double cP, double nP) {
		//Stock Method that creates user instance of Stock details
		companyName = n;
		companySymbol = s;
		currentPrice = cP;
		nextPrice = nP;
	}
	
	public void setName(String n){
		//Method to set companyName to 'n'
		companyName = n;
	}
	
	public void setSymbol(String s) {
		//Method to set companySymbol to 's'
		companySymbol = s;
	}
	
	public void setCurrentPrice(double cP) {
		//Error Checking for: currentPrice > 0; otherwise set to 1
		if(cP > 0) {
			currentPrice = cP;
		}
		else {
			
			currentPrice = 1;
		}
	}
	
	public String getName() {
		//getName Method to access companyName variable
		return companyName;
	}
	
	public String getSymbol() {
		//getSymbol Method to access companySymbol variable
		return companySymbol;
	}
	
	public double getCurrentPrice() {
		//getCurrentPrice Method to access currentPrice variable
		return currentPrice;
	}
	
	public double getNextPrice() {
		//getNextPrice Method to access nextPrice variable
		return nextPrice;
	}
	
	public void priceChange() {
		//priceChange Method used to create 10% changes (Positive or Negative) 
		//changes to the Stock that user has entered prior
		Random randInt = new Random();
		randomNumber = randInt.nextInt(10);
		boolean decide;
		Random negOrPos = new Random();
		
		decide = negOrPos.nextBoolean();
		
		if(decide) {
			nextPrice = currentPrice-(currentPrice*randomNumber);
		}
		
		else {
			nextPrice = currentPrice+(currentPrice*randomNumber);
		}
		
	}
	
	public void printResults(String cN, String cS, double cP, double nP, double rn) {
		//Print results to screen for user to see the Stock Prices Fluctuation
		System.out.printf("%s\t%s\t%.2f\t%.2f\t%.2f\t%.2f\n", cN, cS, cP, nP, rn);
	}
	
}
