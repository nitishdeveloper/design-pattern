package com.design.pattern.factory;

public class Application {

	public static void main(String[] args) {
		Post post1 = PostFactory.createPost("blog");
		System.out.println(post1+"\n");
		System.out.println(post1.display());
		
		
		Post post2 = PostFactory.createPost("news");
		System.out.println(post2+"\n");
		System.out.println(post2.display());
		
		
		Post post3 = PostFactory.createPost("product");
		System.out.println(post3+"\n");
		System.out.println(post3.display());
	}

}
