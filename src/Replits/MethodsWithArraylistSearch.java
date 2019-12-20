package Replits;

import java.util.ArrayList;

public class MethodsWithArraylistSearch {
	public static String search(ArrayList<String> r, String find) 
	  {
	
		String bbb="";
				
	    for(int i = 0 ; i<r.size();i++){
	    	if(r.get(i).startsWith(find)) {
	    		bbb+=r.get(i);
	    	}
	    
	      
	    }
	    return bbb;
	   
	   
	  }
	  
	  public static void main(String[] args)
	  {
	    
	    ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("one apple");
	    arr.add("two orange");
	    arr.add("four banana");
	    arr.add("abc");
	    
	  
	    String find_tst = search(arr,"four");
	    System.out.print(find_tst);//foo bar
	   
	    
	  }//end main
	}
	

