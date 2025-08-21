package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Map;

public class MyProperties {
	private Map map = new HashMap();
	
	public void put(String key, String value) {
		map.put(key, value);
	}
}
