package com.java.Test;

public class LambaClass {

	interface Operation
	{
		int operate(int x, int y);
	}
	static int operate(int x, int y,Operation op)
	{
		return op.operate(x, y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operation add = (x,y)-> x+ y;
		Operation sub = (x,y)-> x - y;
		int val = operate(2,3,add);
		int val1 = operate(5,2,sub);
		System.out.println("Value = "+val);
		System.out.println("Value1 = "+val1);
	}

}
