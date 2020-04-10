package com.design.pattern.observe;

public class Application {
	public static void main(String... args) {
		Newspaper newspaper = new Newspaper();
		Internet internet = new Internet();
		
		Loan personalLoan = new Loan("Personal Loan",12.10f,"SBI");
		personalLoan.registerObserve(internet);
		personalLoan.registerObserve(newspaper);
		personalLoan.setInterest(4.4f);
		personalLoan.notifyObserve();
		
		System.out.println();
		
	}
}
