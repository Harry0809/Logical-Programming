package com.logical.programming;


public class LogicalProgramming {

	public static void main(String[] args) {
		int number = 3735536, reverse = 0;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}
}