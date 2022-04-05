package Mapdemo;

import java.util.Map;
import java.util.LinkedHashMap;

public class linkedHashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map3=new LinkedHashMap<>();
		map3.put("B", "b");
		map3.put("C", "c");
		map3.put("D", "d");
		map3.put("A", "a");
		System.out.println(map3);
		map3.get("A");
		System.out.println(map3);
		map3.get("B");
		System.out.println(map3);
		System.out.println("--------------------------------");
		Map <String, String> map4=new LinkedHashMap<String, String>(16, 0.75F,true);
		map4.put("B", "b");
		map4.put("C", "c");
		map4.put("D", "d");
		map4.put("A", "a");
		System.out.println(map4);
		map4.get("A");
		System.out.println(map4);
		map4.get("A");
		map4.get("B");
		System.out.println(map4);
		
		map4.get("A");
		System.out.println(map4);
		
		
		
	}
	

}
