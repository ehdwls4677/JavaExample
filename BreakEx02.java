package day02;

import java.util.Scanner;

public class BreakEx02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 정답 맞추기
		int cnt = 0;
		while(true) {
			
			System.out.println("피카츄가 양파를 까면서 하는 말은?");
			System.out.print("정답을 입력하세요>");
			String answer = scan.next();
			cnt+=1; // 정답을 입력한 후에 카운트 체크
			if(answer.equals("언제언제까지나")) { //변수.equls("비교할문자") 자바에서 문자열은 해당 방법으로 비교를 해야함
				System.out.println(cnt + "번 만에 맞추셨네요");
				System.out.println("정답입니다 ^0^");
				break;
			}else {
				System.out.println("틀렸는데요?ㅋ");
			}
		}
		
	}

}
