package com.design.pattern.cammand;

public class StartFanCommand implements ICammand{

	FanReceiver fanReceiver;
	
	
	public StartFanCommand(FanReceiver fanReceiver) {
		super();
		this.fanReceiver = fanReceiver;
	}

	@Override
	public void execute() {
		System.out.println("executing fan stop cammand");
		fanReceiver.start();
		
	}

}
