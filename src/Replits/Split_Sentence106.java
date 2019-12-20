package Replits;

import java.util.*;

public class Split_Sentence106 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String split[] = sentence.split(" ");

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);

		}

	}
}
