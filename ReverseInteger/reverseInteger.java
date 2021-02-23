package ReverseInteger;

public class reverseInteger {
	public int reverse(int x) {
        int result = 0;
        
        while(x != 0){
        	
        	int remain = x % 10;//1의자리 찾고
        	x /= 10;//1의 자리를 때어냄
        	
            if(result > Integer.MAX_VALUE / 10 || 
            		(result == Integer.MAX_VALUE/10 && remain > 7)) {return 0;}//max를 넘는지 체크
            if(result < Integer.MIN_VALUE / 10 || 
            		(result == Integer.MIN_VALUE/10 && remain < -8)) {return 0;}//min보다 작은지 체크
            
            result = result *10 + remain;//result의 10을 곱해서 먼저 들어온 숫자를 왼쪽으로 밀고 remain을 더해서 그 자리를 채움
                
        }
        return result;
        
	}
}
