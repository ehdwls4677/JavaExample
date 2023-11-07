package day03;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		
		// 정렬 - 정렬 방법은 7가지 정도?
		// 정렬의 기본 - 선택정렬 , 버블정렬 ( 중첩 반복문이 들어가기 때문에 느린 정렬)
		// 정렬의 가장 빠른 정렬은 - 퀵정렬
				
		// 선택정렬 - 작은 값을 앞으로 가지고 온다.
		int[] arr = {5, 23, 1, 43, 200, 100, 40}; 
		
		//1, 23, 5, 43, 200, 100, 40 - 1회전
		//1, 5, 23, 43, 200, 100, 40 - 2회전
		//1, 5, 23, 43, 200, 100, 40 - 3회전
		//1, 5, 23, 40, 200, 100, 43 - 4회전
		//1, 5, 23, 40, 43, 200, 100 - 5회전
		//1, 5, 23, 40, 43, 100, 200 - 6회전
		
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				System.out.println(i + "-" + j);
				
				if( arr[j] < arr[i] ) { // 자리 바꾼다
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

}
