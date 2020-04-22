package com.design.pattern.brige2;

public class Card implements Payment{

	PaymentGateway gateway;
	
	
	public Card(PaymentGateway gateway) {
		this.gateway = gateway;
	}

	@Override
	public void process() {
		gateway.gateway(this.getClass().getSimpleName()+" -> "+gateway.getClass().getSimpleName());
	}

}
