package com.java.Test;

public class EnumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(EnumInterface ei: EnumInterface.values())
			{
				String val = ei.asLowercase();
				System.out.println("Value is "+val);
			}
	}

}
