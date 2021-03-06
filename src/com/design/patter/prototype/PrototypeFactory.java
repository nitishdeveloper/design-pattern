package com.design.patter.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

	public static class ModelType{
		public static final String MOVIE = "movie";
		public static final String ALBUM = "album";
		public static final String SHOW = "show";
	}
	
	public static  Map<String, PrototypeCapable> prototypes = new HashMap<String, PrototypeCapable>();
	
	static {
		System.out.println("enter in static BLOCK");
		prototypes.put(ModelType.MOVIE, new Movie());
		prototypes.put(ModelType.ALBUM, new Album());
		prototypes.put(ModelType.SHOW, new Show());
	}
	
	public static PrototypeCapable getInstance(final String key ) throws CloneNotSupportedException {
		System.out.println("Inside getInstance method ");
		return (PrototypeCapable)prototypes.get(key).clone();
	}
	
}
