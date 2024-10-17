package com.practice;

public class This {
	  int x;

	  // Constructor with a parameter
	  public This(int x) {
	    this.x = x;
	  }

	  // Call the constructor
	  public static void main(String[] args) {
	    This myObj = new This(5);
	    System.out.println("Value of x = " + myObj.x);
	  }
	}