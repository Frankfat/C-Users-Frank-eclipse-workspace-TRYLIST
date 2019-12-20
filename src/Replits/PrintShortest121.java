package Replits;
import java.util.*;
public class PrintShortest121 {
	public static void main(String[] args) {
		
		/*
		 Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings.  Print array with Arrays.toString() method. Sort array before printing. 
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
		 */
		  Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		String split[] = str.split(",");
		Arrays.sort(split);
		String small = "";

		// String arr[] = new String[split.length];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < split.length; i++) {
			if (split[i].length() < min) {
				min = split[i].length();
				small = split[i];

			}

		}
		String second = "";
		for (int j = 0; j < split.length; j++) {
			if (small.length() == split[j].length()) {
				second += split[j] + " ";

			}

		}
		String arr[] = second.split(" ");
		System.out.println(Arrays.toString(arr));
		 
		    	 
		    		
		    	
				
			}
		   
		  


}
