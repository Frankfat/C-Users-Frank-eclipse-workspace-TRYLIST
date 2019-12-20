package Replits;
import java.util.*;
public class Split_Email108 {
public static void main(String[] args) {
	/*
	 Given a String variable email, write code using 
	 split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:  
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:  
invalid email

email -> my@fancy@email.com
print:  
invalid email
	 */
	  Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    if (!email.contains("@") || email.indexOf("@")!=email.lastIndexOf("@")){
	        System.out.println("invalid email");
	      } else {
	          String[] arr = email.split("@");
	          System.out.println("Email id: " + arr[0]);
	          System.out.println("Email domain: " + arr[1]);
	      }

	   
			
	    	
	  
	  
}
}
