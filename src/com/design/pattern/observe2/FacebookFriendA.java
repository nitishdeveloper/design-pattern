package com.design.pattern.observe2;

public class FacebookFriendA implements NotificationObserver{

	@Override
	public void update(String message) {
		System.out.println("sending update notification to FacebookFriendA "+message);
	}

}
