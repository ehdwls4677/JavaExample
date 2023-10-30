package day01;

import java.util.Arrays;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		// 1. 배열의 선언
		int[] arr; 
		
		// 2. 배열의 생성 ** 크기 고정 (같은 타입)
		arr = new int[5];
		
		// 3. 
		System.out.println(arr); // 주소 값 - 배열의 실제 만들어진 위치
		
		// 4. 배열의 초기화 (배열 순서 마다 값을 넣어줌)
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		// arr[5] = 600; // 배열의 범위를 벗어나면 Array Index Out of Bound 라는 에러가 발생
		
		// 5. 배열의 사용 (배열명[배열 순서])
		System.out.println("배열의 첫번째 값:" + arr[0]); // 100
		System.out.println("배열의 세번째 값:" + arr[2]); // 300
		
		// 6. 배열의 저장된 값을 문자열로 보려면 (Arrays.toString(배열명) **
		System.out.println( Arrays.toString(arr) ); // [100, 200, 300, 400, 500]
		
		// 7. 배열의 길이를 알아보는 명령어 (배열명.length) 
		System.out.println("배열의 길이:" + arr.length);
		
		// 8. 배열의 선언과 생성을 동시에 하는 문법 *중요*
		int[] arr2 = new int[3]; // 크기가 3인 정수 배열 생성 
		
		// 9. 배열의 선언과 생성과 초기화까지 하는 문법 *중요*
		byte[] arr3 = new byte[] {1,2,3,4,5};
		
		byte[] arr4 = {1,2,3,4,5}; 
		
		System.out.println( Arrays.toString(arr4) );
		
		// 10. 배열은 초기값을 지정하지 않으면 자동으로 기본값 지정이 들어갑니다.
		// 정수는 0, 실수는 0.0, boolean false, 문자열은 null로 표기
		System.out.println( Arrays.toString(arr2) ); // [0, 0 ,0]
		
		// 크기가 3인 문자열을 저장하는 배열을 만들고 , 월요일 , 화요일 , 수요일로 초기화
		//"오늘은 수요일 입니다" 입니다.
		String[] arr5 = new String[] {"월요일", "화요일", "수요일"};
		
		System.out.println("오늘은 " + arr5[2] + " 입니다.");
		
		String[] arr6 = new String[3];
		arr6[0] = "월요일";
		arr6[1] = "화요일";
		arr6[2] = "수요일";
		
		System.out.println("오늘은 " + arr6[2] + " 입니다.");
		
		
	}

}
