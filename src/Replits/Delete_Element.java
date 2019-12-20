package Replits;

import java.util.Arrays;

public class Delete_Element {
/*
 deleteR, gets an int array, and an int. the method returns an int array.

It removes element int from the array.

example use (pseudo code):

deleteR([1,2,3],2)
returns [1,3]

deleteR([19,99,9,9999],9)
returns [19,99,9999]

deleteR([1,5,3,4],5)
returns [1,3,4]
hint:
create a new arry for  return with -1 the length of arr
And add all elements from arr except for  the element that matches element value
return that new array
 */
	public static void main(String[] args) {
		int [] arr = {12,24,36};
	int a=12;
		int [] arr1 = new int[arr.length-1];
		
	
		
	for (int i = 0; i < arr.length-1; i++) {
		
	if(arr[i]!=a){
			arr1[i-1]=arr[i];
		}
		
	}
	System.out.println(Arrays.toString(arr1));
		
	}
}
