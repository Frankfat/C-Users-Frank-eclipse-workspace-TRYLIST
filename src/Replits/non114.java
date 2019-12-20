package Replits;
import java.util.*;
public class non114 {
	public static void main(String[] args) {
		/*
		  
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2

		 */
		  Scanner input = new Scanner(System.in);
		  int biggest =0;
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    for (int i = 0; i < nums.length-1; i++) {
		    	
		    	if(nums[i]>nums[i+1]) {
		    		biggest+=nums[i];
		    		
		    	}
				
			}
		    System.out.println(biggest);
		
	}

}
