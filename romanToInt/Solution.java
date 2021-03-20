package romanToInt;

import java.util.HashMap;

public class Solution {
	public int romanToInt(String s) {
		int result = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		
		for(int i=0; i<s.length(); i++) {
			if(i != s.length()-1) {
				if( hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))) {
					result += -1*hm.get(s.charAt(i));
				}//다음 문자의 가치가 더 크면 지금 벨류를 마이너스
				else {
					result += hm.get(s.charAt(i));
				}//다음 문자의 가치가 작거나 같을때 지금 벨류를 플러스
			}//마지막이 문자가 아닐때
			else {
				result += hm.get(s.charAt(i));
			}//마지막 문자 일때
		}
		return result;
	}
}
