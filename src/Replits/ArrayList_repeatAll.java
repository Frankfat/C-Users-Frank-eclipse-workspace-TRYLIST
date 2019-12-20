package Replits;

import java.util.ArrayList;

public class ArrayList_repeatAll {
/*
 Create a static method that:
is called repeatAL
returns nothing
takes in a single parameter - an ArrayList of Booleans

This method should modify its ArrayList parameter by repeating its ArrayList values.  

For example, if the parameter is 
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)
 */
	public static void main(String[] args)
	{
		ArrayList<Boolean> p = new ArrayList<>();
		p.add(true);
		p.add(false);
		p.add(false);

repeatAL(p);
		
	}
	//create your method below
	public static void repeatAL(ArrayList<Boolean> r){

r.addAll(r);
System.out.println(r);


	
	  
	}
	
}
