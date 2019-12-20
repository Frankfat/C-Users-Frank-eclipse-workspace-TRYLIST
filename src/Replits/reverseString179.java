package Replits;
import java.util.*;
public class reverseString179 {
	public static void main(String[] args) {
		reverse("ali");
	}
	public static String reverse(String input)
	{
		
		char k = 34;
		System.out.print(k);
		for (int i = input.length()-1; i >=0; i--) {
			System.out.print(input.charAt(i));
			
		}
		System.out.print(k);
	   return input;
	   
	}

}
