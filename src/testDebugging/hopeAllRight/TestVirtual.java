package hopeAllRight;

import java.util.ArrayList;
import java.util.HashMap;

public class TestVirtual {
	
	public static void main(String[] args) {
		
		ArrayList<HashMap<String,String>> test1 = new ArrayList<HashMap<String,String>>();
		HashMap<String,String> test2 = new HashMap<String,String>();
	
		test2.put("a","b");
		test1.add(test2);
		System.out.println(test2);
		System.out.println(test1);
		ArrayList<HashMap<String,String>> test3 = new ArrayList<HashMap<String,String>>();
		ArrayList<HashMap<String,String>> test4 = new ArrayList<HashMap<String,String>>();
		test3=(ArrayList<HashMap<String, String>>) (test1.clone());
		test3.get(0).put("a", "c");
		
		 
		
		
		System.out.println(test3);
		System.out.println(test2);
		System.out.println(test1);
	}

}
