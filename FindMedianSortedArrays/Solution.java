package FindMedianSortedArrays;



public class Solution {
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i=0, j=0, k=0;
        int n = nums1.length;
        int m = nums2.length;
        int len = n + m;
        int[] arr = new int[len];
        double result = 0;
        
        if(n == 0 && m == 0) {
        	return 0.0;
        }else if(n == 0) {
        	if(len % 2 == 0){
                double t = nums2[(len / 2) - 1];
                double s = nums2[(len / 2)];
                result = (t + s) / 2;
            }// nums2의 갯수가 짝수일 때
        	else{
                result = nums2[(len / 2)];
            }//num2의 갯수가 홀수일 때
        }//nums1에 아무 것도 없을 때
        else if(m == 0) {
        	if(len % 2 == 0){
                double t = nums1[(len / 2) - 1];
                double s = nums1[(len / 2)];
                result = (t + s) / 2;
            }//num1의 갯수가 짝수일 때
        	else{
                result = nums1[(len / 2)];
            }//num1의 갯수가 홀수일 때
        }//num2에 아무 것도 없을 때
        else {
        while(i < n && j < m){
            if(nums1[i] <= nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
            
            if(i >= n){
                while(j < m){
                    arr[k++] = nums2[j++];
                }
            }else if(j >= m){
                while(i < n){
                    arr[k++] = nums1[i++];
                    }
                }
            
            if(len % 2 == 0){
                double t = arr[(len / 2) - 1];
                double s = arr[(len / 2)];
                result = (t + s) / 2;
            }else{
                result = arr[(len / 2)];
            }
          }//nums1과 nums2를 비교하며 배열에 병합
        }//nums1과 nums2에 둘 다 들어 있을 때
        return result;
    }
}


