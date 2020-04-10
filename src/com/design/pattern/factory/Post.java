package com.design.pattern.factory;

import java.time.LocalDateTime;

public abstract class Post {
	
	private Long id;
	private String title;
	private String content;
	private LocalDateTime createdAt;
	private LocalDateTime prostedAt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getProstedAt() {
		return prostedAt;
	}
	public void setProstedAt(LocalDateTime prostedAt) {
		this.prostedAt = prostedAt;
	}
	
	public String display() {
		return "Post :: \nid=" + id + "\nitle=" + title + "\ncontent=" + content + "\ncreatedAt=" + createdAt
				+ "\nprostedAt=" + prostedAt;
	}
	
	
	
}
