package Replits;

public class Extract_Number_186 {
/*
 extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23
extractNum("aa2") ==> 2
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10

hint:
you can use:
 Character.isDigit(ch)
 or conditions
 */
	public static void main(String[] args) {
		String result =extractNum("la5kjshfaljfha12'./..;'");
		System.out.println(result);
	}
	public static String extractNum(String s) {
		//char del = 'A';
		String fina="";
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				fina+=s.charAt(i);
				
			}
		}
		return fina;
		   
	  }
}