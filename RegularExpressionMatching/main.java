package RegularExpressionMatching;

//문자열이 규칙에 맞게 되어 있는지 판별
//알파벳+*은 알파벳이 연속되거나 없음을 의미
//.을 모든 알파벳을 하나 대체할 수 있음
public class main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String s = "aaaaaa";
		String p = "d*c*a*";
		//d 0개, c 0개 a 여러개 이므로 true
		
		System.out.println(solution.isMatch(s, p));
	}

}
