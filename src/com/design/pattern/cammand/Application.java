package com.design.pattern.cammand;

public class Application {
	
	public static void main(String...strings ) {
	
	FanReceiver fanReceiver = new FanReceiver();
	
	HomeAutomationRemoteInvoker invokerRemoteInvoker = new HomeAutomationRemoteInvoker();
	invokerRemoteInvoker.setCammand(new StartFanCommand(fanReceiver));
	invokerRemoteInvoker.pressButton();
	
	invokerRemoteInvoker.setCammand(new StopFanCommand(fanReceiver));
	invokerRemoteInvoker.pressButton();
	
	}
}
