package day01;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		// 1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		// 2. 스캐너가 가지고 있는 기능을 이용 해서 데이터를 받음
		System.out.print("이름을 입력 >");
		String name = scan.next(); // 문자열 입력 받아서 변수에 저장
		
		System.out.println("나이를 입력 >");
		int age = scan.nextInt(); // 정수 값 입력 받아서 변수에 저장
		
		System.out.println("키를 입력 >");
		double cm = scan.nextDouble(); // 실수 값 입력 받아서 변수에 저장
		
		System.out.println("자기 소개 하세요 >");
		scan.nextLine(); // 엔터 값을 소모 시킴
		String intro = scan.nextLine(); // 문자열 - nextLine 경우 줄 바꿈으로 표현 하기 때문에 엔터 값이 남아 있을 경우 엔터 값을 소모 시켜줘야 함  
		
		System.out.println("이름:" + name + " 나이:" + age + " 신장:" + cm );
		System.out.println("자기 소개: " + intro);
		
		// 스캐너 자원 해제
		scan.close();
		
		
	}

}
