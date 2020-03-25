package mainStructures.saveStockpile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

import mainStructures.dataFramework.Table_database;



public class CyDatabase implements Serializable {
    private HashMap<String, Table_database> myTables = new HashMap<String, Table_database>();

    public void addTable (Table_database newTable) {
        myTables.put(newTable.getName(),newTable);
    }
    public Table_database getTable(String tableName){
        return myTables.get(tableName);
    }

	public HashMap<String, Table_database> getMyTables() {
		return myTables;
	}

	public void serializationSave(String fileName) {
		ObjectOutputStream stream;
		try {
			stream = new ObjectOutputStream(new FileOutputStream(fileName));
			
			Collection<Table_database> values = myTables.values();
			for (Table_database table : values) {
				stream.writeObject(table);
			}
			stream.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	

	public void serializationRead(String fileName) {
		try {
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName));
			Table_database table = null;
			while ((table = (Table_database) stream.readObject()) != null) {
				this.addTable(table);

			}
			stream.close();
		} catch (EOFException e) {
			// No message predefined, we have to write here our own message.
			System.out.println("End of file reading");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
