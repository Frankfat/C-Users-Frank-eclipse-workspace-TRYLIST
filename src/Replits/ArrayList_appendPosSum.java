package Replits;

import java.util.ArrayList;

public class ArrayList_appendPosSum {
	public static void main(String[] args)
	{
		ArrayList<Integer> n =new ArrayList<>(); 
		n.add(10);
		n.add(-90);
		n.add(900);
		n.add(-7);
		n.add(9);
		n.add(-4);
		
		
		System.out.println(appendPosSum(n));
		
	}
public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
  ArrayList<Integer> num1  = new ArrayList<>();
  int sum=0;
  for(int i = 0; i<nums.size();i++){
    if(nums.get(i)>0){
      num1.add(nums.get(i));
      sum+=nums.get(i);
    }
  }
  num1.add(sum);
 
  return num1;
}

}
