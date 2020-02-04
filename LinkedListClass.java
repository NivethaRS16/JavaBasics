package com.java.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a linked list
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Vijaya");
		l1.add("Nivi");
		l1.add("Harshi");
		l1.addFirst("Senthil");
		l1.addLast("Vignesh");
		
		//iterate through using ListIterator both forward and backward
		ListIterator it = l1.listIterator();
	
		while(it.hasNext())
		{
			System.out.println("Linked list "+it.next());
		}
		
	/*
		while(it.hasPrevious())
		{
			System.out.println("Reverse order "+it.previous());
		}

		//Sorted
		
		Collections.sort(l1);		
		System.out.println("Sorted "+l1);
		
		//Reverse Sort - Method 1
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("Reverse Sorted "+l1);
		
		//Reverse Sort - Method 2
		
		Iterator t1 = l1.descendingIterator();
		while(t1.hasNext())
		{
			System.out.println("Reverse sorted list "+t1.next());
		}
	
		//LinkedList to Array
		
		String[] array = l1.toArray(new String[l1.size()]);
		for (int i = 0; i < array.length; i++)
	    {
	       System.out.println(array[i]);
	    }
		
		//LinkedList to ArrayList
		
		ArrayList<String> a1 = new ArrayList<String>(l1);
		for(String str: l1)
		{
			System.out.println(str);
		}
		*/
		l1.push("Pushing new");
		System.out.println("After push "+l1);
		
		l1.pop();
		System.out.println("After pop "+l1);
		System.out.println("After push "+l1);
		
		Object o = l1.peek();
		System.out.println(" peep value "+o);
		System.out.println("After push "+l1);
		
		Object o1 = l1.peekLast();
		System.out.println(" peep last value "+o1);
		System.out.println("After push "+l1);
		
		Object o2 = l1.poll();
		System.out.println(" poll value "+o2);
		System.out.println("After push "+l1);
		
		Object o3 = l1.pollLast();
		System.out.println(" poll value "+o3);
		System.out.println("After push "+l1);
		
		Enumeration e1 = Collections.enumeration(l1);
		while(e1.hasMoreElements())
		{
			System.out.println("List "+e1.nextElement());
		}
	}

}
