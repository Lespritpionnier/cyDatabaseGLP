package mainStructures.dataFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Row_table extends HashMap<String, Item_row>{
    /**
     * The keys of this HashMap are the names of the columns in the table
     */
    public Row_table() {
    }


//	public java.lang.String toString() {
//        Iterator<Entry<String, Item_row>> i = entrySet().iterator();
//        if (! i.hasNext())
//            return "???";
//        i.next();//Take off the first place
//        StringBuilder sb = new StringBuilder();
//        sb.append('(');
//        for (;;) {
//        	Entry<String, Item_row> e = i.next();
//        	String key = e.getKey();
//        	Item_row value = e.getValue();
//            sb.append(key);
//
//            if (! i.hasNext())
//                return sb.append(')').toString();
//            sb.append(", ");
//        }
//    }











/*
    public String[] getColumnsName(){
        String[] columnsName = new String[super.size()];
        return columnsName;
    }

 */
}
