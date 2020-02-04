package com.java.Test;

public class Factorial {
	
	
	static int fact(int num)
	{
		int output;
		if ( num == 1 )
			return 1;
		else
			output = num * fact(num - 1);
			return output;
		
	}
	
public static void main(String[] args) {
		
		

		System.out.println("factorial is "+fact(15));
		
}

}




