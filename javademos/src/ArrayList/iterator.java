package ArrayList;
import java.util.List;
import java.util.ArrayList;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
		strList.add("Hello");
		strList.add("world");
		strList.add("java");
		strList.add("coding");
		strList.add("is fun");
		
		for (String s : strList)
			System.out.println(s);
		
		System.out.println("--------------------------------------------");
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(4);
		intList.add(41);
		intList.add(42);
		intList.add(24);
		intList.add(34);
		for (Integer i : intList)
			System.out.println(i);
		

	}

}
