package programmers_lv1_greedy;

import java.util.HashSet;

public class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<lost.length; i++) {
        	set.add(lost[i]);
        }
        
        for(int i=0;i<reserve.length;i++) {
        	if(set.contains(reserve[i]-1)) {
        		set.remove(reserve[i]-1);
        	}else if(set.contains(reserve[i]+1)) {
        		set.remove(reserve[i]+1);
        	}else if(set.contains(reserve[i])){
                set.remove(reserve[i]);
            }
        	
        	if(set.isEmpty()) {
        		return n;
        	}
        	
        }
        
        answer = n- set.size();
        
        return answer;
    }
}
