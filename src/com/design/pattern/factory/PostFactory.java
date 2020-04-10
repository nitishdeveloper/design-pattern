package com.design.pattern.factory;

import java.time.LocalDateTime;

public class PostFactory {

	public static Post createPost(String postType) {
		switch (postType) {
		case "blog":
			BlogPost blogPost = new BlogPost();
			blogPost.setAuthor("Nitish");
			String words = "coron,virus,india,victim";
			blogPost.setTag(words.split(","));
			blogPost.setId(1L);
			blogPost.setTitle("coron-virous");
			blogPost.setProstedAt(LocalDateTime.now());
			blogPost.setCreatedAt(LocalDateTime.now());
			return blogPost;
		case "news":
			NewsPost newsPost = new NewsPost();
			newsPost.setHeadline("The corona");
			newsPost.setContent("corona virus");
			newsPost.setId(2L);
			newsPost.setTitle("coron-virous");
			newsPost.setProstedAt(LocalDateTime.now());
			newsPost.setCreatedAt(LocalDateTime.now());
			return newsPost;
		case "product":
			ProductPost productPost = new ProductPost();
			productPost.setImageUrl("image/user/path/product.jpg");
			productPost.setName("corona");
			productPost.setId(3L);
			productPost.setTitle("coron-virous");
			productPost.setProstedAt(LocalDateTime.now());
			productPost.setCreatedAt(LocalDateTime.now());
			return productPost;
		default:
			throw new IllegalArgumentException("invalid post type");
		}

	}
}
