package Replits;

import java.util.Scanner;
/*
 Complete a method fib() that will compute Fibonacci numbers
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34
 */
public class Fibonacci_155 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int aa = 0;
		int b = 1;
		int fin = 0;
		//System.out.print(aa + " " + b + " ");
		for(int i = 2; i <=a; i++) {
		int c = aa+b;
		aa = b;
		b = c;
		fin=c;
		}
		System.out.print(fin);
		
		
		}

}
