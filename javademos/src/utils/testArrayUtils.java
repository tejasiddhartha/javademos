package utils;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class testArrayUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray=new String[] {"Raj","Antony"};
		List<String> li=Arrays.asList(strArray);
		System.out.println(li);
		
		li.set(0, "Ram");
		System.out.println(Arrays.toString(strArray));
		System.out.println(li);
		
		Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));
		
		List<String>li1=new ArrayList<>();
		li1.add("Radhika");
		li1.add("Radha");
		System.out.println(li1);
		String arr[]= {"Roshan"};
		Collections.addAll(li1, arr);
		System.out.println(li1);
		
	}

}
