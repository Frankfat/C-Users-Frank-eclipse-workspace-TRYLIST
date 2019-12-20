package Replits;

import java.util.ArrayList;

public class ArrayList_CombineAll187 {
/*
 Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: 
an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, 
then add all the words (in order) from wordList2.  In other words, 
it is combining all the elements from the two parameters.
 */
	public static void main(String[] args) {
		
}
	public static ArrayList<String> combineAL(ArrayList<String>wordList,ArrayList<String> wordList2) {
		ArrayList<String> result = new ArrayList<>();
		result.addAll(0,wordList);
		result.addAll(wordList.size(),wordList2);
		
		
		return result;
	}	
}