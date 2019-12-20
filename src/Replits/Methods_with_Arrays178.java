package Replits;
import java.util.Arrays;
public class Methods_with_Arrays178 {
	/*
	 mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
	 */
	 public static int[] mergR(int[] a,int[] b) {
		 int length = a.length+b.length;
		 int newarr[] = new int[length];
		 int z = 0;
		 
		 for (int i = 0; i < a.length; i++) {
			 newarr[z]=a[i];
			 z++;
			
		}
		 for (int i = 0; i < b.length; i++) {
			 newarr[z]=b[i];
			 z++;
			
		}
		    return newarr;
		   
		    
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
		  int [] a = {1,2,3};
		  int [] b = {4,5,6};
		  
		  int length = a.length+b.length;
			 int newarr[] = new int[length];
			 int z = 0;
			 
			 for (int i = 0; i < a.length; i++) {
				 newarr[z]=a[i];
				 z++;
				
			}
			 z=a.length;
			 for (int i = 0; i < b.length; i++) {
				 newarr[z]=b[i];
				 z++;
				 
				
			}
			 System.out.println(Arrays.toString(newarr));
	  }

}
