package setDemo;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myhashSet = new HashSet<String>();
		myhashSet.add("John");
		myhashSet.add("Alex");
		myhashSet.add("Max");
		myhashSet.add("Tracy");
		myhashSet.add("Tracy");
		System.out.println(myhashSet);
		
		Set<String> myhashSet2 = new LinkedHashSet<String>();
		myhashSet2.add("John");
		myhashSet2.add("Alex");
		myhashSet2.add("Max");
		myhashSet2.add("Tracy");
		System.out.println(myhashSet2);

	}

}