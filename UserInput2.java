package com.java.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput2 {


	    public static void main(String[] args) throws IOException {

	        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

	            System.out.println("Please enter your name : ");
	            String name = br.readLine();

	            System.out.println("Please enter your age : ");
	            
	            int age = Integer.parseInt(br.readLine());

	            System.out.println("Please enter your salary : ");
	            

	            double salary = Double.parseDouble(br.readLine());

	            System.out.format("Name : %s, Age : %d, Salary : %.2f", name, age, salary);

	        }

	    }
	

}
