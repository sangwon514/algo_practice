package Doll_Draw_Game;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
    	
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        		
        for(int i=0;i<moves.length;i++) {
        	int num = moves[i]-1;
        	int k = 0;
        	
        	for(int j=0; j<board[num].length; j++) {
        		if(board[j][num] != 0) {
        			k = board[j][num];
        			board[j][num]=0;
        			break;
        		}
        		
        	}
        	
        	if(k == 0) continue;
        	
        	if(stack.empty()) {
        		stack.push(k);
        	}else {
        		
        		if(stack.peek() == k) {
        			stack.pop();
        			answer+=2;
        		}else {
        			stack.push(k);
        			}
        		}
        	
        }
        return answer;
    }
}
