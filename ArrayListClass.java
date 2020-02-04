package com.java.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ArrayListClass {

	private static final Consumer<? super String> String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> list = new ArrayList<String>();
			list.add("A");
			list.add("B");
			list.add("C");
			list.add(3, "D");
			list.addAll(list);
			list.remove("B");
			list.remove("B");
			int i = list.indexOf("A");
			int j = list.lastIndexOf(list);
			System.out.println(list);
			System.out.println("Index of a = "+i);
			System.out.println("Last index = "+j);
			Boolean b = list.contains("B");
			System.out.println("Boolean is = "+b);
			
			//Iterate List - Method 1
			for(String str:list)
			{
				System.out.println("List is = "+str);
			}
			
			//Iterate List - Method 2
			Iterator<String> itr = list.iterator();
			while(itr.hasNext())
			{
				System.out.println("Iterator list is = "+itr.next());
			}
			
			//Iterate List - Method 3
			list.forEach(s -> System.out.println("Foreach "+s));
			
			//Empty list
			list.clear();
			
			//Initialize list - Array to Array list - Method 1
			ArrayList<String> list1 = new ArrayList<String>(
					Arrays.asList("A","NULL","C")
					);
		
			for(String str:list1)
			{
				System.out.println("List is = "+str);
			}
			
			
			//Initialize list - Method 2
			ArrayList<String> list2 = new ArrayList<String>(){{
					add("Aa");
					add("AB");
					add("Ab");
			}};
		
			//Interate list using enumeration
			Enumeration<String> e = Collections.enumeration(list2);
			while(e.hasMoreElements())
			{
				System.out.println("List2 = "+e.nextElement());
			}
			
			//Sort list
			Collections.sort(list2);
			
		    System.out.println("List2 after sort= "+list2);
		    
		    //Reverse sort
		    Collections.sort(list2,Collections.reverseOrder());
		    
		    System.out.println("List2 after reverse sort= "+list2);
			
		    //Initialize list 
			ArrayList<Integer> list3 = new ArrayList<Integer>(Collections.nCopies(3, 5));
			for(Integer i1:list3)
			{
				System.out.println("Ncopies is = "+i1);
			}
			
			
			ArrayList<Integer> a = new ArrayList<Integer>(10);
			a.add(1);
			a.add(2);
			a.add(3);
			a.ensureCapacity(3);	//increase array capacity
			a.add(4);
			a.add(5);
			a.add(6);
			a.add(0,0);
			
			
			System.out.println("size is = "+a.size());			
			
			String val = a.get(0).toString();
			System.out.println(val);
			System.out.println(a);
			a.set(1,7);
			a.add(9);
			a.remove(1);
			System.out.println("aftr rem "+a);
			
			//Clone array
			ArrayList<Integer> a1 = (ArrayList<Integer>) a.clone();
			
			System.out.println(a1);
			a1.add(11);
			System.out.println(a1);
			
			//Empty array or not
			ArrayList<Integer> a2 = new ArrayList<Integer>(10);
			boolean b1 = a2.isEmpty();
			System.out.println(b1);
			
			//Empty array or not
			if(a2.size() == 0)
			{
				System.out.println("empty");
			}
			
	}

}
