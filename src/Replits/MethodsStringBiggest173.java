package Replits;

public class MethodsStringBiggest173 {
	/*
	 the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
	 */
	public static void main(String[] args) {
		System.out.println(biggerS("Sayisal","Sozel"));
	}
	public static String biggerS(String a ,String b)
	  {
	   if(a.length()>b.length()) {
		   
		   return a;
	   }else {
		   
		   return b;
	   }
	   
	  
}
}