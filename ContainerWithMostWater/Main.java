package ContainerWithMostWater;

//수조관의 높이가 주어지면 그 높이들중 가장 많은 물을 담을 수 있는 높이 찾기 높이간 거리는 1
//ex) [1,8,6,2,5,4,8,3,7]이면 두번째 8과 마지막 7을 높이로 잡으면 밑변7 최대 높이7로 49의 결과가 나온다.
public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(s.maxArea(height));

	}

}
