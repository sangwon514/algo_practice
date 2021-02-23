package RegularExpressionMatching;

public class Solution {
	 public boolean isMatch(String s, String p) {
		 if (p.isEmpty()) return s.isEmpty();
		 	
		 //s와 p의 첫 알파벳이 맞는지 판단
		 boolean first_match = (!s.isEmpty() &&
	                               (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
	        
		 //p의 두번째가 *인 경우, 기본s와 p의 * 다음을 비교 or 위에 첫알파벳이 맞는지 판단한 것 and 다음s와 기본p 비교
		 if (p.length() >= 2 && p.charAt(1) == '*'){
			 return (isMatch(s, p.substring(2)) ||
					 (first_match && isMatch(s.substring(1), p)));
			 }
		 //p의 두번째가 알파벳인 경우 처음 비교한 것과 다음s 다음p 비교
		 else{
			 return first_match && isMatch(s.substring(1), p.substring(1));
			 }
		 }
}
