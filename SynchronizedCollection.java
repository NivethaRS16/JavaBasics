package com.java.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method 1
		List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
		list.add(1);
		list.add(2);
		list.add(3);
		
		synchronized(list)
		{
			list.forEach(x -> System.out.println("List val is "+x));
		}
		
		//Method 2
		CopyOnWriteArrayList<String> a = new CopyOnWriteArrayList<String>();
		a.add("A");
		a.add("B");
		a.add("C");
		
		for(String str:a)
		{
			System.out.println("List is = "+str);
		}
		
		
	}
}