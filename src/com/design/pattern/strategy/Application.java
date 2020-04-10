package com.design.pattern.strategy;

public class Application {
	 public static void main(String... args) {
		 SocialMediaContext context = new SocialMediaContext();
		 
		 context.setSocialMediaStrategy(new FacebookStrategy());
		 context.connect("Govind Bajpai");
		 
		 System.out.println("--------------------------");
		 
		 
		 context.setSocialMediaStrategy(new InstgramStrategy());
		 context.connect("Govind Bajpai");
		 
		 System.out.println("--------------------------");
		 
		 context.setSocialMediaStrategy(new LinkedinStrategy());
		 context.connect("Govind Bajpai");
		 
		 System.out.println("--------------------------");
		 
		 TwitterStrategy twitterStrategy = new TwitterStrategy();
		 
		 context.setSocialMediaStrategy(twitterStrategy);
		 context.connect("Govind Bajpai");
	 }
}
