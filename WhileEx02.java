package day02;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		// 어떤 수가 소수 인지 판별 하는 간단한 방법
		// 소수 = 나누어 떨어지는 수가 1 또는 자기 자신인 수
		
		System.out.println("소수 인지 판별할 수 입력>");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		// 시작할 수 를 2
		int a = 2;
		while(n % a != 0) {
			
			System.out.println(a);
			a++;
		}
		// n이 5일 경우 a는 5까지 증가
		// n이 6일 경우 a는 2
		if(n == a) { // n값과 a값이 같을 경우 자기 자신과 1로만 나눌 수 있기 때문에 소수이다.
			System.out.println(n + "은" + " 소수 입니다.");
		} else {
			System.out.println(n + "은" + " 소수가 아닙니다.");
		}
		
		System.out.println("---------------------------------------------------------------------------");
		
		// 소수 인지 판별하는 2번째 방법 - 2 부터 ~ 자기 자신 까지 나누면서 약수의 개수를 센다.
		
		int i = 2;
		
		int cnt = 0; // 약수의 개수를 셀 변수
		while( i <= n ) {
			
			// 나누어 떨어지는 수의 개수를 셈
			if(n % i == 0) { // i는 n의 약수
				cnt++; // count를 증가 시킴
			}
			i++;
			
		}
		if(cnt == 1) { // i가 2부터 시작 되었기 때문에 count 된 값이 1인 경우 소수
			System.out.println(n + "은 소수 입니다.");
		} else {
			System.out.println(n + "은 소수가 아닙니다.");
		}
		
	}
}
