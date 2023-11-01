package day02;

import day01.Sysout;

public class DoWhileEx01 {
	
	public static void main(String[] args) {
		
		// while문으로 1~10까지 합계
		
		int i = 1;
		int sum = 0;
		
		while(i <= 10) {
			
			
			
			sum += i;
			i++;
			
			
			
		}
		System.out.println("1부터 10까지의 합계 " + sum);
		System.out.println("-------------------------------------------------------");
		
		// while문과 차이점은 첫번째 회전은 무조건 실행 됨
		int x = 1; // 제어 변수
		int sum2 = 0; // 누적 변수
		do {
			
			sum2 += x;
			x++;
			
		} while (x <= 10);
		System.out.println("1부터 10까지의 합계 " + sum2);
		
	}

}
