package TwoSum;

public class Main {

	//int 배열과 원하는 숫자를 넣으면 배열안에 있는 숫자를 합쳐서 원하는 숫자가 나오게 하는 인덱스를 출력(답이 항상 있음)
	//ex) intput : nums = [2,7,11,15], target = 9 / output : [0,1] 
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] results = s.twoSum(nums, target);
		
		
		System.out.print("[");
		for(int i = 0; i<results.length; i++) {
			System.out.print(results[i]);
			if(i != results.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		

	}

}
