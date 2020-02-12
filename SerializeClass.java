package com.java.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SerializeClass {
	
    static void InputSerialise(HashMap<Integer,String> hmap)
    {
    	try {
			FileOutputStream fos = new FileOutputStream("out.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hmap);
			oos.close();
			fos.close();
			
			System.out.println("serialised data stored");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    
    static void OuputSerialse(String s1)
    {
    	HashMap<Integer, String> map = null;
    	FileInputStream fis;
		try {
			fis = new FileInputStream("out.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			map = (HashMap<Integer, String>) ois.readObject();
	    	ois.close();
	    	fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) 
        {
        	Map.Entry mentry = (Map.Entry)iterator.next();
        	System.out.print("key: "+ mentry.getKey() + " & Value: ");
        	System.out.println(mentry.getValue());
        }
    	
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(1, "A");
		hmap.put(5, "B");
		hmap.put(16, "C");
		hmap.put(2, "D");
		hmap.put(11, "E");
		
		System.out.println(hmap);
		
		InputSerialise(hmap);
		
		OuputSerialse("out.ser");
		
	}

}
