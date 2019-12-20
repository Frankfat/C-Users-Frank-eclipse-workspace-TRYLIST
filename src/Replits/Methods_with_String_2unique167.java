package Replits;
import java.util.*;
import java.util.Scanner;

public class Methods_with_String_2unique167 {
	public static void main(String[] args) {
		/*
		uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.

	Examples:

	uniqueChars("java") ==> "jav"

	uniqueChars("mama") ==> "ma"

	uniqueChars("spoon") ==> "spon"

		 */
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	String result = "";


	for (int i = 0; i < str.length(); i++) {
		if(!result.contains(str.substring(i, i+1))) {
			result+=str.substring(i, i+1);
			
		}
		
	}
	System.out.println(result);
	
	/*
	 
import java.util.*;

class Main {
  public static void main(String[] args) {
    //test your code
    System.out.println( uniqueChars("wooden-spoon") ) ;
  }
  
  public static String uniqueChars(String str) {
//     Scanner scan = new Scanner(System.in);
// String str = scan.nextLine();
String result = "";


for (int i = 0; i < str.length(); i++) {
	if(!result.contains(str.substring(i, i+1))) {
		result+=str.substring(i, i+1);
		
	}
	
}
return result;
	 */
		    	}
		    	

}
