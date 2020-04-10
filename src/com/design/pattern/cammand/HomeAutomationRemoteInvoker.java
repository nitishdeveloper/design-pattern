package com.design.pattern.cammand;

public class HomeAutomationRemoteInvoker {
	ICammand cammand;

	public void setCammand(ICammand cammand) {
		this.cammand = cammand;
	}
	
	public void pressButton() {
		System.out.println("pressed button");
		cammand.execute();
	}
}
