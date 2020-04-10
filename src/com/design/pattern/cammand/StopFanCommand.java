package com.design.pattern.cammand;

public class StopFanCommand implements ICammand{

	FanReceiver fanReceiver;
	
	public StopFanCommand(FanReceiver fanReceiver) {
		super();
		this.fanReceiver = fanReceiver;
	}

	@Override
	public void execute() {
		System.out.println("executing fan stop cammand");
		fanReceiver.stop();
	}

}
