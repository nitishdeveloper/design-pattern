package com.design.pattern.observe2;

public interface NotificationSubject {
		public void attach(NotificationObserver observer);
		public void detach(NotificationObserver observer);
		public void notitfy(String message);
}
