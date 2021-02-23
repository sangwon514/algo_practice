package ContainerWithMostWater;

public class Solution {
	 public int maxArea(int[] height) {
	        int width = 0;
			int length = 0;
			int left = 0;
			int right = height.length-1;
			int abs = 0;
			while(left < right) {
				width = Math.min(height[left], height[right]);//양쪽중 작은걸 높이로 결정
				length = right - left;//폭
				abs = Math.max(abs, width*length);//찾고있던 값과 지금 찾은 값중 큰것을 결과값으로 저장
				
				if(width == height[right]) {
					while(height[--right] < width);//더 큰 높이가 나올때까지 오른쪽에서 왼쪽이동
				}//오른쪽 길이가 더 작을경우
				else {
					while(height[++left] < width);//더 큰 높이가 나올때까지 왼쪽에서 오른쪽이동
				}//왼쪽 길이가 더 작을 경우
			}
			return abs;
	    }
}
