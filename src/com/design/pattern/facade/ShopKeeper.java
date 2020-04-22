package com.design.pattern.facade;

public class ShopKeeper {
	
	MobileStore sumsung;
	MobileStore nokia;
	MobileStore iphone;
	

	public ShopKeeper() {
		sumsung = new Samsung();
		nokia = new Nokia();
		iphone = new Iphone();
	}
	
	public void haveSumsung() {
		sumsung.model();
		sumsung.price();
	}
	
	public void haveNokia() {
		nokia.model();
		nokia.price();
	}


	public void haveIphone() {
		iphone.model();
		iphone.price();
	}
}
