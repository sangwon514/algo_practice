package TwoSum;

import java.util.HashMap;

public class Solution {
	 public int[] twoSum(int[] nums, int target) {
	        int[] output = new int[2];
	        HashMap<Integer, Integer> map = new HashMap<>();
	        int remain;
	        
	        for(int i=0; i<nums.length; i++){
	            map.put(nums[i],i);
	        }
	        
	        for(int i=0; i<nums.length; i++){
	            remain = target - nums[i];
	            if(map.containsKey(remain)){
	                if(i != map.get(remain)){
	                output[0] = i;
	                output[1] = map.get(remain);
	                break;
	                }
	            }
	        }
	        return output;
	    }
}
