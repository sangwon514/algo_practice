package kakao_Failure_rate;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int N=5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		
		int[] result = s.solution(N, stages);
		
		System.out.println();
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i] +" ");
		}
		

	}

}
