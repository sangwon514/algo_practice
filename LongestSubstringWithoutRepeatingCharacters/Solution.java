package LongestSubstringWithoutRepeatingCharacters;

public class Solution {

	 public int lengthOfLongestSubstring(String s) {
		int ans = 0;
		int[] index = new int[128];//기본 ASCII 문자의 갯수
		
		for(int i=0,j=0; j<s.length(); j++) {
			i = Math.max(index[s.charAt(j)], i); // j번째 문자가 전에 문자면 i를 전에 나온 문자 앞으로 옮김
			ans = Math.max(ans, j-i+1); // 현재 값과 지금 측정한 값중 큰 값을 저장
			index[s.charAt(j)] = j+1; //j번째 문자가 한번 나타났기 때문에 i를 j다음으로 옮기기 위한 위치 저장
		}
		return ans;
	 }
}
