package com.design.pattern.observe2;

public class FacebookFriendB implements NotificationObserver{

	@Override
	public void update(String message) {
		System.out.println("sending update notification to FacebookFriendB "+message);
	}

}
