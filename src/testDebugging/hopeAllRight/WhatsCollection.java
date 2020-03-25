package hopeAllRight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WhatsCollection {

	
	
	public static void main(String[] args) {
		TestMap<String,Integer> map1 = new TestMap<String,Integer>();
		String[] array1= new String[3];
		
		array1[0]="a";
		array1[1]="b";
		array1[2]="c";
		System.out.println(Arrays.toString(array1));
		String[] array2= new String[3];
		array2[0]="a";
		array2[1]="b";
		array2[2]="c";
		
		map1.put("a", 1);
		map1.put("b", 1);
		map1.put("c", 1);
		System.out.println(map1.toString());
		
		String a = Arrays.toString(array1);
		String b = map1.toString();
		
		System.out.println(a.equals(b));
		System.out.println(a.length());
	}

}


