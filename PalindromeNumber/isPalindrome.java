package PalindromeNumber;

public class isPalindrome {
	public boolean Palindrome(int x) {
		StringBuilder s = new StringBuilder();//속도를 빠르게 하기위해 StringBuilder로 String객체 생성
		int y = x;
		if(x < 0) {
			return false;
		}//음수인경우 false
		s.append(Integer.toString(x));//숫자를 문자열로 변환
		
		int p = (int)Math.pow(10, s.length() - 1) ;//맨 앞의 숫자 자릿수 찾기
		int k = 10;
		
		for(int i = 0 ; i < s.length() / 2; i++) {
			int front = x / p;//맨 앞자리
			int back = y % k;//맨 뒷자리
			
			if(front != back) {
				return false;
			}
			
			//앞과 뒤가 같으면 앞과 뒤를 잘라냄
			x -= front * p;
			y /= 10;
			p /= 10;
			
		}
		
		return true;
	}
	
	
}
