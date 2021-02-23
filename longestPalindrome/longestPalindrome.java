package longestPalindrome;

public class longestPalindrome {
	
	public String palindrome(String s) {
		if(s == null || s.length()<1) {return "";}
		
		int start=0;
		int end=0;
		
		for(int i = 0; i<s.length(); i++) {
			
			int len_1_center=aroundCenter(s,i,i); // 중앙이 한자리인 회문인 경우
			int len_2_center=aroundCenter(s,i,i+1); // 중앙이 두자리인 회문인 경우
			int len = Math.max(len_1_center, len_2_center);//위의 두개중 긴 것을 저장
			
			if(len > end - start) {
				start = i - (len -1) / 2;//중앙 인덱스를 내가 구한 len-1의 절반만큼 줄여줘서 시작지점을 구함
				end = i + len / 2;//중앙 인덱스를 내가 구한 len의 절반만큼 늘려서 끝지점을 구함
			}
		}
		return s.substring(start, end + 1);
    }
    //전달 받은 인덱스로부터 오른쪽 왼쪽이 같을때 늘려나감
    public int aroundCenter(String s, int left, int right) {
		int l=left;
		int r=right;
		while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}
		
		return r-l-1;
	}
}
