package Replits;
import java.util.*;
import java.util.Arrays;
public class ReverseArray118 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    int arr [] = new int[nums.length];
	 int j =0;
	   for (int i = nums.length-1; i >=0; i--) {
		   arr[j]+=nums[i];
		   j++;
		   
		
	
	    
	    
		
	    } 
	    System.out.print(Arrays.toString(arr));
	}

}
