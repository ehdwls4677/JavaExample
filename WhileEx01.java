package day02;

public class WhileEx01 {
	
	public static void main(String[] args) {
		
		int a = 1; // 1. 제어 변수 - 반복문의 횟수를 제어할 변수
		int sum = 0; // 누적할 변수는 밖에 생성 안에다 만들 경우 값이 계속 초기화가 일어남
		while(a <= 10) {  // 2. 제어변수로 조건을 생성
			
			sum += a; // sum = sum + a;
			
			a++; 	//3. 반복을 돌 때 마다 제어 변수를 증가 해서 언젠가는 조건이 false가 되게 함
		}
		
		System.out.println( "1-10의 합계:" + sum );
		
		/*
		 * int sum = 0; // 누적할 변수
		 * sum = sum + 1;
		 * sum = sum + 2;
		 * sum = sum + 3;
		 * sum = sum + 4;
		 * ....
		 * sum = sum + 10;
		 */
	}

}
