package day02;

public class IfEx01 {
	
	public static void main(String[] args) {
		
		// 1 ~ 100 까지 랜덤한 정수 하나 생성
		
		int point = (int) (Math.random() * 100) + 1; // 1 ~ 100
		
		System.out.println("점수는:" + point + "입니다.");
		
		
		// 60점 합격 커트
		
		if(point >= 60) {
			
			System.out.println("축 합격 입니다!");
				
		} else {
			System.out.println("헐 불 합격 입니다 ㅠ..");
		}
		}

}