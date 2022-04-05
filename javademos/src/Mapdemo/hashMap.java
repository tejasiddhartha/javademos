package Mapdemo;

import java.util.Map;
import java.util.HashMap;

public class hashMap {
	public static void main(String args[]) {
		Map<String, Integer> map1 = new HashMap<String,Integer>();
		map1.put("John",25);
		map1.put("Ram", 32);
		System.out.println(map1);
		System.out.println(map1.containsKey("Ram"));
		Map<String,Map<String,Object>>userprofiles=new HashMap<>();
		Map<String, Object>profiles=new HashMap<>();
		profiles.put("depart", "admin");
		userprofiles.put("ram", profiles);
		System.out.println(userprofiles);
	}
}
