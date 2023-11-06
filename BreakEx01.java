package day02;

import java.util.Scanner;

public class BreakEx01 {
	
	public static void main(String[] args) {
		
//		for(int i = 1; i <= 10; i++) {
//			
//			System.out.println(i);
//			
//			if(i == 5) {
//				break;
//			}
//			
//		}
		
		// 무한 반복문
		// 반복횟수를 정확히 모르고 있을 때, break으로 빠져나오는 형태
		// 자바에서 무한반복은 while(true) 를 사용합니다.
		int i = 1;
		while(true) {
			
			System.out.println(i);
			
			if(i == 10) break;
			
			i++;
		}
		System.out.println("---------------------------------------------------------");
		
		// 사용자가 입력한 값이 0일 때 까지 , 입력을 계속 받기
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("숫자를 입력 해주세요 >");
			int a = scan.nextInt();
			if(a == 0) {
				System.out.println("그만");
				break;
			}
		}
	}

}
