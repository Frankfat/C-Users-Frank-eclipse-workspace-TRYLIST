package Replits;

import java.util.Scanner;

public class Methods_PrintNextThre_148 {
	/*
	 Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
	 */
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	System.out.println(retur(1));
	
}
	public static String  retur(int num) {
		String ne ="";
		for (int i = num+1; i < num+4; i++) {
			ne+=i+" ";
			
			
		}
		return ne;
		
		
	}
}
