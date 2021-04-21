package programmers_lv1_greedy;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int n=3;
		int[] lost = {3};
		int[] reserve = {1};
		
		System.out.println(s.solution(n, lost, reserve));
	}

}
