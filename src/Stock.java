import java.util.Random;
import java.util.Scanner;

public class Stock {
	//Variables
	private String companyName;
	private String companySymbol;
	private double currentPrice;
	private double nextPrice;
	private double randomNumber;
	
	
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
	
	public void setName(String n){
		
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
	
	public void priceChange() {
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
		System.out.printf("%s\t%s\t%.2f\t%.2f\t%.2f\t%.2f\n", cN, cS, cP, nP, rn);
	}
	
}
