package com.java.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class ImmutableListClass {
	
	static <T> void createList(List<T> list)
	{
		ImmutableList<T> l = ImmutableList.copyOf(list);
		System.out.println(l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create immutable list - Method1
		ImmutableList<String> list = ImmutableList.of("Geeks", "For", "Geeks");
		//System.out.println(list);
		//list.add("Add");
		System.out.println(list);
		
		//Create immutable list - Method 2
		List<String> l1 = new ArrayList<String>(Arrays.asList("Geeks", "For", "Geeks"));
		createList(l1);
		
		List<Integer> l11 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		createList(l11);
		
		//Create immutable list - Method 3
		List<String> a = List.of();
		//a.add(0, "Test");
		System.out.println(a);
		
		//Create immutable list - Method 4
		ImmutableList<String> list1 = ImmutableList.<String>builder().add("Immutable").build();
		//list1.add("test");
		System.out.println(list1);
		
		//Create immutable list - Method 5
		List<String> l2 = List.of("Test","immutable");
		ImmutableList<String> list2 = ImmutableList.<String>builder().addAll(l2).add("list").build();
		//list2.add("test");
		System.out.println(list2);
		
		//Create list add to immutable list created by unmodifiableList then add elements to list  - possible
		List<Integer> l12 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		List<Integer> list11 = Collections.unmodifiableList(l12);
		l12.add(10);
		System.out.println(list11);
		
		
		//Create list add to immutable list  then add elements to list  - not possible - error
		List<String> l22 = List.of("Test","immutable");
		ImmutableList<String> list12 = ImmutableList.copyOf(l22);
		l22.add("test");
		System.out.println(l2);
		
	}

}
