package day02;

import day01.Sysout;

public class WhileEx04 {
	
	public static void main(String[] args) {
		
		//int[] arr = new int [5];
		
		// 시작은 0에서 출발하고 끝은 9
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; // 배열의 길이는 항상 마지막 인덱스보다 1큼
		
		int a = 0; // index
		int sum = 0; // 합계 변수
		while( a < arr.length) { // 배열의 길이 보다 작다
			
			System.out.println("인덱스:" + a + "의 값:" + arr[a]);
			sum += arr[a];
			
			
			a++;
		}
		System.out.println("배열 요소의 합:" + sum);
		
	}

}
