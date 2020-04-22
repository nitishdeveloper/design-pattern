package com.design.pattern.brige2;

public class PaymentApp {

	public static void main(String[] args) {
		Payment nb = new NetBanking(new SbiGateway());
		nb.process();
		
		Payment card = new Card(new HdfcGateway());
		card.process();
	}

}
