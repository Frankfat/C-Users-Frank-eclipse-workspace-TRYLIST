package Replits;

import java.util.ArrayList;

public class ArrayList_Search {
	/*
	 search(["one apple","two orange","four banana"],"four")
returns:
"four banana"
("four banana" contains "four" so method returns "four banana")

search(["hello","world"],"goodbye")
returns:
"search failed"
(no "goodbye" in any element)
	 
	 */
	 public static String search(ArrayList<String> r, String find) 
	  {
		 String fina = "";
	    for (int i = 0; i < r.size(); i++) {
	    	if(r.get(i).contains(find)) {
	    		fina= r.get(i);
	    		
	    	}
	    	else {
	    		fina=find;
	    	}
			
		}
	    return fina;
	   
	   
	  }
	  
	  public static void main(String[] args)
	  {
	    
	    ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("2");
	    arr.add("6");
	    arr.add("foo bar");
	    arr.add("abc");
	    
	  
	    String find_tst = search(arr,"bar");
	    System.out.print(find_tst);//foo bar
	   
	  
	  }

}
