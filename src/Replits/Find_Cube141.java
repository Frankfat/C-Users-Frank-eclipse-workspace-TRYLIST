package Replits;

import java.util.*;

public class Find_Cube141 {
	/*
	 * Given method called cube. Write all required code inside this method in order
	 * to asks the user for a number and then prints the cubed value of that number:
	 * 
	 * Example:
	 * 
	 * input: 5 output: 125
	 * 
	 * hint: cube of a number n = n*n*n
	 */

	public static void cube() {
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
a=a*a*a;
System.out.println(a);
	}

	public static void main(String[] args) {

		cube();

	}
}
