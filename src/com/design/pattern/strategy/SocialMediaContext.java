package com.design.pattern.strategy;

public class SocialMediaContext {
	
	ISocialMediaStrategy socialMediaStrategy;

	public void setSocialMediaStrategy(ISocialMediaStrategy socialMediaStrategy) {
		this.socialMediaStrategy = socialMediaStrategy;
	}
	
	public void connect(String mediaName) {
		socialMediaStrategy.connectTo(mediaName);
	}

}
