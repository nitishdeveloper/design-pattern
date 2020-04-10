package com.design.pattern.factory;

import java.util.Arrays;

public class BlogPost extends Post{
	private String author;
	private String[] tag;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String[] getTag() {
		return tag;
	}
	public void setTag(String[] tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "BlogPost :: \nauthor=" + author + "\ntag=" + Arrays.toString(tag) + "]";
	}
	
	
	
}
