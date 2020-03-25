package hopeAllRight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class TestMap<String,Integer> extends HashMap<String,Integer>{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 public TestMap() {
	        super();
	    }

	public java.lang.String toString() {
        Iterator<Entry<String,Integer>> i = entrySet().iterator();
        if (! i.hasNext())
            return "???";
        i.next();//È¥³ýÊ×Ïî
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (;;) {
        	Entry<String,Integer> e = i.next();
        	String key = e.getKey();
        	Integer value = e.getValue();
            sb.append(key);

            if (! i.hasNext())
                return sb.append(')').toString();
            sb.append(", ");
        }
    }
}