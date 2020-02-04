package com.java.Test;

public class Swap {
	
	static void swap(int a, int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swap "+a+","+b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(10,30);

	}

}
