package programmers_lv_kakao_keypad;

/*
엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
*/
public class Solution {

	public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] key_pad = {{1,2,3},{4,5,6},{7,8,9},{'*',0,'#'}};
        int left_x = 0; // 첫 시작은 *
        int left_y = 3;
        int right_x = 2; // 첫 시작은 #
        int right_y = 3;
        
        for(int i = 0; i<numbers.length; i++) {
        	int recent_num = numbers[i];
        	if(recent_num == 1 || recent_num == 4 || recent_num == 7) {
        		answer += "L";
        		
        		switch(recent_num) {
        		case 1: left_x = 0; left_y = 0; break;
        		case 4:	left_x = 0; left_y = 1; break;
        		case 7:	left_x = 0; left_y = 2; break;
        		}
        	}else if(recent_num == 3 || recent_num == 6 || recent_num == 9) {
        		answer += "R";
        		
        		switch(recent_num) {
	    		case 3: right_x = 2; right_y = 0; break;
	    		case 6:	right_x = 2; right_y = 1; break;
	    		case 9:	right_x = 2; right_y = 2; break;
        		}
        	}else {
        		int cent_x = 1;
        		int cent_y = 0;
        		
        		switch(recent_num) {
        		case 2: cent_x = 1; cent_y = 0; break;
        		case 5:	cent_x = 1; cent_y = 1; break;
        		case 8:	cent_x = 1; cent_y = 2; break;
        		case 0:	cent_x = 1; cent_y = 3; break;
        		}
        		
        		
        		if(Math.ceil(Math.sqrt(Math.pow(cent_x-right_x, 2) + Math.pow(cent_y-right_y, 2)))
        				> Math.ceil(Math.sqrt(Math.pow(cent_x - left_x,2) + Math.pow(cent_y - left_y, 2)))) {
        			answer += "L";
        			left_x = cent_x;
        			left_y = cent_y;
        		}else if(Math.ceil(Math.sqrt(Math.pow(cent_x-right_x, 2) + Math.pow(cent_y-right_y, 2)))
        				< Math.ceil(Math.sqrt(Math.pow(cent_x - left_x,2) + Math.pow(cent_y - left_y, 2)))) {
        			answer += "R";
        			right_x = cent_x;
        			right_y = cent_y;
        		}else {
        			if(hand.equals("right")) {
        				answer+="R";
        				right_x = cent_x;
            			right_y = cent_y;
        			}else {
        				answer+="L";
        				left_x = cent_x;
            			left_y = cent_y;
        			}
        		}
        	}
        }
        
        return answer;
    }
	


}
