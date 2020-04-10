package com.design.pattern.observe;

import java.util.ArrayList;


public class Loan implements Subject{

	 private ArrayList<Observe> observerslist = new ArrayList<Observe>();
	
	 private String type;
     private float interest;
     private String bank;
	 
     
     
	public Loan(String type, float interest, String bank) {
		this.type = type;
		this.interest = interest;
		this.bank = bank;
	}

	public String getType() {
		return type;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	public String getBank() {
		return bank;
	}


	@Override
	public void registerObserve(Observe observe) {
		observerslist.add(observe);
		
	}

	@Override
	public void removeObserve(Observe observe) {
		observerslist.remove(observe);
	}

	@Override
	public void notifyObserve() {
		for(Observe obs : observerslist) {
			System.out.println("Notifying Observers on change in Loan interest rate");
			obs.update(this.interest);
		}
	}

}
