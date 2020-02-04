package com.java.Test;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name");
		String name = s.nextLine();
		System.out.println("Name is "+name);
		int age = s.nextInt();
		System.out.println("Age is "+age);

	}

}
