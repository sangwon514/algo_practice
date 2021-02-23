package myAtoi;

public class myAtoi {
	public int Atoi(String s) {
		int sign = 1;//기본 결과값을 양수라고 결정
		int result = 0;
		int i=0;
		
		while(i < s.length() && s.charAt(i) == ' ') {
			i++;
		}//선행공백 무시
		
		if(i < s.length() && s.charAt(i) == '-' || s.charAt(i) == '+') {
			sign = (s.charAt(i++) == '+' ? 1 : -1);
		}//공백 무시후 결과값 부호 결정
		
		while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			if(result > Integer.MAX_VALUE / 10 || 
					(result == Integer.MAX_VALUE /10 - '0'&& 
					s.charAt(i) > Integer.MAX_VALUE % 10)) {
				
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}//범위 안에 있는지 확인
			
			result = result * 10 + (s.charAt(i++) - '0');//문자열의 숫자를 숫자로 변경
		}//숫자 읽기
		
		return sign * result;
		
	}
}
