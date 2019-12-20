package Replits;

import java.util.Arrays;

import Assignment.forlo;

public class CopyCertain117 {
	/*
	 * Given a String array arr with the following elements ["zero", "one",
	 * "two","three","four"]
	 * 
	 * Create another array fewValues and copy words that have letter "e" in them
	 * 
	 * You need to know how many element contain "e" and create array accordingly
	 * 
	 * Values in fewValues array need to be["zero", "one","three"]
	 * 
	 * Examples: arr -> ["aa", "be", "lol", "lel", "oreo"] fewValues -> ["be",
	 * "lel", "oreo"]
	 * 
	 * arr -> ["e", "hey", "bye", "furey", "spoon"] fewValues ->["e", "hey", "bye",
	 * "furey"]
	 * 
	 */
	public static void main(String[] args) {

		String arr[] = { "aa", "be", "lol", "lel", "oreo" };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e")) {
				count++;

			}

		}
		String fewValues[] = new String[count];

		for (int j = 0; j < fewValues.length;) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].contains("e")) {

					fewValues[j] = arr[i];
					j++;
				}

			}

		}

		System.out.println(Arrays.toString(fewValues));

	}

}
