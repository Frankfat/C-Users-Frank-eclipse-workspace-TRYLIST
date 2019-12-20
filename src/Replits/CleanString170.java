package Replits;

public class CleanString170 {
	/*
	 This method gets two strings (text and badWord)  and returns a string.

basicly what it dose is take out all the occurrences of badWord in text.

for example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "
	 */
	public static void main(String[] args) {
		String fina = clean("one two three","two");
		System.out.println(fina);
	}
	public static String clean (String text ,String badWord) {
String result = "";

	      String split [] = text.split(" ");
	      String split1 [] = badWord.split(" ");
	      for (int i = 0; i < split.length; i++) {
	    	  if(!result.contains(split[i])) {
	    		  result+=split[i]+" ";
	    		  
	    	  }
			
		}
	      for (int i = 0; i < split1.length; i++) {
	    	  if(!result.contains(split1[i])) {
	    		  result+=split1[i]+" ";
	    	  }
			
		}
	      return result;
	  }
}
