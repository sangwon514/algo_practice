package ZigZagConversion;

//주어진 문자열을 지그재그로 바꾼 문자열을 출력
//ex) "PAYPALISHIRING" -> "PAHNAPLSIIGYIR"
//P   A   H   N
//A P L S I I G
//Y   I   R 
//주어진 문자열을 지그재그로 바꾼뒤 1열부터 그대로 출력
public class main {

	public static void main(String[] args) {
		ZigZagConversion z = new ZigZagConversion();
		String s = "PAYPALISHIRING";
		int numRows = 3;
		
		System.out.println(s);
		System.out.println(z.convert(s, numRows));

	}

}
