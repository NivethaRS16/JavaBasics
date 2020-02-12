package com.java.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HasSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		 
	     //add elements to HashSet
	     hset.add("Abhijeet");
	     hset.add("Ram");
	     hset.add("Kevin");
	     hset.add("Singh");
	     hset.add("Rick");
	     // Duplicate removed
	     hset.add("Ram"); 
	     hset.add("Singh"); 
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: ");
	     for(String temp : hset){
	        System.out.println(temp);
	     }
	     
	     
	     //Sort HashSet
	     Set<String> tset = new TreeSet<String>(hset);
	     System.out.println(tset);
	     
	}

}
