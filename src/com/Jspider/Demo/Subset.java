package com.Jspider.Demo;

public class Subset {
	public static void generateSubset(int[] nums, boolean[] include, int i, int target) {
		System.out.println(i);
//		 for(int i1=0;i1<=include.length-1;i1++)
//			   {
//				   System.out.println("includes"+ include[i1]);
//			   }
	    if (i == nums.length) {
	        int sum = 0;
	        for (int j = 0; j < nums.length; j++) {
	            if (include[j]) {
	                sum += nums[j];  
	            }
	        }
//	        System.out.println(sum);
	        if (sum == target) {
	            for (int j = 0; j < nums.length; j++) {
	                if (include[j]) {
	                    System.out.print(nums[j] + " ");
	                }
	            }
	            System.out.println();
	        }
//	        System.out.println("i value"+i);
	        return;
	    }
	    include[i] = true;
	    generateSubset(nums, include, i + 1, target);
	
	    include[i] = false;
	    generateSubset(nums, include, i + 1, target);
	}
	public static void printSubsetSum(int[] nums, int target) {
	    int n = nums.length;
	    boolean[] include = new boolean[n];   
//	   for(int i=0;i<=include.length-1;i++)
//	   {
//		   System.out.println("includes"+ include[i]);
//	   }
	    generateSubset(nums, include, 0, target);
	}
	public static void main(String[] args) {
		int[] nums = {5,10,12,13,15,18};
        int target = 30;
        printSubsetSum(nums, target);
	}
			}