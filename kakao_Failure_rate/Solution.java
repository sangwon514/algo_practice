package kakao_Failure_rate;

import java.util.Arrays;

public class Solution {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; // 답을 넣을 배열
        int[] array = new int[N+1]; //stage를 지나친 사람 배열
        int k = 0; // stage를 지나친 사람 수
        int j = array.length; //array 인덱스
        int i = stages.length-1; //stage 인덱스
        
        Arrays.sort(stages); // stage를 미리 정렬해서 뒤에서부터 접근
        
        while(i>=0) {
        	if(j <= stages[i]) {
        		k++;
        		array[j-1] = k;
        		i--;
        	}//j번째 stage를 넘었으면 array[j-1]에 추가
        	else {
        		j--;
        		array[j] = k;
        	}//그게 아니면 j를 감소
        	
        }
        
        
        double[] farray = failuer_rate(array);
        double[] sort_farray = new double[farray.length];
        
        for(i=0;i<farray.length;i++) {
        	sort_farray[i] = farray[i];
        }
        Arrays.sort(sort_farray);
        
        
        k=0;
        for(i = sort_farray.length-1; i>=0; i--) {
        	for(j=0;j<farray.length;j++) {
        		if(sort_farray[i] == farray[j]) {
        			answer[k++] = j+1;
        			farray[j] = -1;
        		}
        	}
        	
        }
        
        
        
        
        return answer;
    }
	
	public double[] failuer_rate(int[] array) {
		double[] f_array = new double[array.length-1];
		
		for(int i = 0; i<array.length-1; i++) {
			if(array[i] == array[i+1]) {
				f_array[i] = 0;
			}else {
				f_array[i] = (double)(array[i] - array[i+1]) / (double)array[i];
			}
			
		}
		
		return f_array;
	}
}
