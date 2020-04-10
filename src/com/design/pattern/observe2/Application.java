package com.design.pattern.observe2;

public class Application {
	public static void main(String... args) {
		FacebookFriendA friendA = new FacebookFriendA();
		FacebookFriendB friendB = new FacebookFriendB();
		Facebook facebook = new Facebook();
		facebook.attach(friendA);
		facebook.attach(friendB);
//		facebook.detach(friendA);
		facebook.notitfy("Nitish");
	}
}
