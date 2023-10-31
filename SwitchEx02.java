package day02;

import java.util.Scanner;

public class SwitchEx02 {
	
	public static void main(String[] args) {
		
		//switch문장은 else if 문장과 90% 유사합니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수 입력>");
		int point = scan.nextInt();
		
		String grade;
		
		switch (point / 10) { // 포인트 점수 / 10해서 각 케이스에 넣어줌
		case 9:
			if( point >= 95) { // if문은 case switch 내에서도 사용 가능 90점 이상일 경우 if문을 발동 시켜서 95이상은 그 미만은 A
				grade = "A+학점";
			}else {
				grade = "A학점";
			}
			break;
			
		case 8:
			grade = "B학점";
			break;
			
		case 7:
			grade = "C학점";		
			break;
		
		case 6:
			grade = "D학점";		
			break;
		
		default:
			grade = "F학점";
			break;
		}
		
		System.out.println("당신의 학점은" + grade + "입니다.");
	}

}
