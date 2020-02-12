package com.java.Test;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector vec = new Vector(7); 
		  
	        // use add() method to add elements in the vector 
	        vec.add(1); 
	        vec.add(2); 
	        vec.add(3); 
	        vec.add(4); 
	        vec.add(5); 
	        vec.add(6); 
	        vec.add(7); 
	        vec.add(8);
	  
	        // checking capacity 
	        System.out.println("Size of vector: " + vec.size());
	        System.out.println("Capacity of vector: " + vec.capacity()); 
	}

}
