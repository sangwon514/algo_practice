package ZigZagConversion;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if(numRows == 1) {return s;}
		String[] resultString = new String[numRows];
		int x = 0;
		int direction = 0; // 0 올라가는 방향, 1 내려오는 방향
		
		for(int i = 0; i<resultString.length ; i++) {
			resultString[i] = "";
		}//초기화
		
		for(int i = 0; i < s.length(); i++) {
			if(direction == 0) {
				resultString[x++] += s.charAt(i);
				if(x == numRows) {
					direction = 1;
					x -= 2;
				}//배열을 하나씩 늘려가며 한글자씩 넣다가 마지막 인덱스에 도달하면 방향을 바꾸고 인덱스에 -2를 해서 지그재그 모양을 만듬
			}else {
				resultString[x--] += s.charAt(i);
				if(x == -1) {
					direction = 0;
					x += 2;
				}//첫번째 인덱스에 도달하면 방향을 바꾸고 인덱스에+2를 하여 지그재그 모양을 만든다.
			}
		}
		
		
		String result = "";
		for(int i = 0 ; i<resultString.length; i++) {
			result += resultString[i];
		}
		return result;
	}
}
