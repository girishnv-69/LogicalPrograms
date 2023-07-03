package com.Jspider.Demo;

import java.util.ArrayList;
import java.util.List;
public class Subsets_of_array {


		    public static List<List<Integer>> findSubsets(int[] nums, int sum) {
		        List<List<Integer>> result = new ArrayList<>();
		        List<Integer> path = new ArrayList<>();
		        dfs(nums, sum, 0, path, result);
		        return result;
		    }
		    private static void dfs(int[] nums, int sum, int index, List<Integer> path, List<List<Integer>> result) {
		        if (sum == 0) {
		            result.add(new ArrayList<>(path));
		            return;
		        }
		        for (int i = index; i < nums.length; i++) {
		            if (nums[i] <= sum) {
		                path.add(nums[i]);
		                dfs(nums, sum - nums[i], i + 1, path, result);
		                path.remove(path.size() - 1);
		            }
		        }
		    }
		    public static void main(String[] args) {
		        int[] nums = {5, 10, 12, 13,15, 18};
		        int sum = 30;
		        List<List<Integer>> result = findSubsets(nums, sum);
		        System.out.println(result);
		    }


		}

	


