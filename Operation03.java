package day01;

public class Operation03 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		// && 경우 앞 조건이 false 인 경우 뒤에를 실행 시키지 않아 주로 사용
		if( x != 10 && ++y == 20) { // && 앞에 조건이 false인 경우 뒤에를 실행하지 않았음
			System.out.println("참 입니다.");
			
		} else {
			System.out.println("거짓 입니다."); 
			
			x = 10;
			y = 20;
			
			if (x == 10 || ++ y == 20) { // ||는 앞이 true인 경우 뒤에 실행 하지 않음
				System.out.println("참 입니다.");
			} else {
				System.out.println("거짓 입니다.");
			}
			System.out.println("x는:" + x + ", y는 :" + y);
		}
		
	}
}

