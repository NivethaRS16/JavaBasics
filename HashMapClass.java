package com.java.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapClass {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(1, "A");
		hmap.put(5, "B");
		hmap.put(16, "C");
		hmap.put(2, "D");
		hmap.put(11, "E");
		
		System.out.println(hmap);
		
		//Iterate HashMap

		Set s1 = hmap.entrySet();
		Iterator i1 = s1.iterator();
		while(i1.hasNext())
		{
			Map.Entry m1 = (Map.Entry) i1.next();
			System.out.print("Key is: "+m1.getKey() + " & Value is: "+m1.getValue()+"\n");
	        
		}
		
		Map<Integer,String> hmap1 = new TreeMap<Integer,String>(hmap);
		
		Set s2 = hmap1.entrySet();
		Iterator i2 = s2.iterator();
		while(i2.hasNext())
		{
			Map.Entry m2 = (Map.Entry) i2.next();
			System.out.print("Key is: "+m2.getKey() + " & Value is: "+m2.getValue()+"\n");
	        
		}
		//Empty hashmap
		hmap.clear();
		System.out.println(hmap);
		
		//FInd if empty or not
		boolean b = hmap.isEmpty();
		System.out.println("Empty val "+b);
		
		//Sort hashMap
	}

}
