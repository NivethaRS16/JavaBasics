package com.java.Test;

public class Reverse {
	static int reverse(int a)
	{
		int rev = 0;
		//System.out.println(a);
		while(a !=0)
		{
			rev = rev * 10;
			rev = rev + a % 10;
			a = a/10;
		}
		return rev;
		
	}
	public static void main(String[] args) {
		
		//Reverse r = new Reverse();

		System.out.println("Reverse is "+reverse(1234));
		
	}

}
