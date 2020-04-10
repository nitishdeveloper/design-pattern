package com.design.pattern.observe2;

import java.util.ArrayList;

public class Facebook implements NotificationSubject{

	private ArrayList<NotificationObserver> notificationList = new ArrayList<NotificationObserver>();
	
	@Override
	public void attach(NotificationObserver observer) {
		notificationList.add(observer);
	}

	@Override
	public void detach(NotificationObserver observer) {
		notificationList.remove(observer);
		
	}

	@Override
	public void notitfy(String message) {
		for(NotificationObserver notify : notificationList) {
			notify.update(message);
		}
	}

	
}
