package day02;

public class ForEachEx01 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		// (변수 : 배열명)
		for(int a:arr ) {
			System.out.println(a);
		}
		
		// 일반 for
		for(int a = 0; a < arr.length; a++) {
			System.out.println(arr[a]);
		}
		
		System.out.println("-----------------------------------------------");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "토"};
		
		for(String a :arr2) {
			System.out.println(a + "요일");
			
		}
		System.out.println("-------------------------------------------------");
		
		int[] score = {33,44,52,17,34,54,90};
		// score의 합계 , 평균은 소수점 까지 향상된 포문으로 구해주세요
		int sum = 0;
		for(int a : score) {
			sum += a;
		}
		double avg = (double)sum / score.length;//
		avg = (int)(avg * 100) / 100.0;// 소수점 두자리 까지만 출력하는 방법 - 46.28로 출력
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum / score.length);
	}

}
