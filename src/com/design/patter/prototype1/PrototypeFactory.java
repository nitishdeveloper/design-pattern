package com.design.patter.prototype1;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	
	public static class ColorType {
		public static final  String RED = "red";
		public static final  String BLUE = "blue";
		public static final  String GREEN = "green";
	}
	
	public static Map<String, ColorPrototype> colorMap = new HashMap<String, ColorPrototype>();
	
	static {
		colorMap.put(ColorType.RED, new Red());
		colorMap.put(ColorType.GREEN, new Green());
		colorMap.put(ColorType.BLUE, new Blue());
	}
	
	public static ColorPrototype getColor(final String key) {
		 return colorMap.get(key).colorClone();
	}
}
