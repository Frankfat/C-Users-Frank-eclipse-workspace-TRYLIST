package Replits;

public class HamletLogic160 {
	/*
	 * The danish prince most famous quote is "to be or not to be". thats a classic
	 * example of boolean logic.
	 * 
	 * the hamletQuote method only returns true if one of or both of the boolean
	 * parameters is true.
	 * 
	 * example:
	 * 
	 * hamletQuote(true, false) returns true
	 * 
	 * hamletQuote(false,true) returns true
	 * 
	 * hamletQuote(true,true) returns true
	 * 
	 * hamletQuote(false,false) returns false
	 */
	public static void main(String[] args) {
		boolean what = hamlet(true, true);
		System.out.println(what);
	}

	public static boolean hamlet(boolean a, boolean b) {
		boolean result = true;

		if (a == true || b == true) {
			result = true;
		}else{
			result = false;
		}
		return result;
	}
}
