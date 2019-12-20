package Replits;

public class WordCount169 {

	/*
	This method gets a string and returns the word count of that string.

	example:

	wordCount("foo bar")
	returns 2

	wordCount("one two three")
	returns 3

	wordCount("bla")
	returns 1
	*/
	public static void main(String[] args) {
		int result = wordCount("f a t i h");
		System.out.println(result);
	}
	 public static int wordCount(String words) {
		int counter = 0;
		  for (int i = 0; i <words.length(); i++) {
			  if(words.charAt(i)==' ') {
				  counter++;
			  }
			
		}
		  return counter+1;
		    
	      
	  }
}
