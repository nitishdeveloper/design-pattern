package com.design.pattern.brige2;

public class NetBanking implements Payment{

	PaymentGateway gateway;
	
	public NetBanking(PaymentGateway gateway) {
		this.gateway = gateway;
	}


	@Override
	public void process() {
		gateway.gateway(this.getClass().getSimpleName()+" -> "+gateway.getClass().getSimpleName());
	}

}
