package day01;

public class Operation05 {
	
	public static void main(String[] args) {
		
		// 3항 연산식
		
		// 랜덤한 값을 만드는 기능
		
		// System.out.println( Math.random() ); // 0 이상 ~ 1 미만의 랜덤한 값이 출력이 됨
		
		int d = (int)(Math.random() * 10) +  1; // 1 ~ 10의 랜덤한 정수 값
		System.out.println(d);
		System.out.println(d % 3 == 0 ? "3의 배수 입니다" : "3의 배수가 아닙니다");
		
		// 변수
		String s = d % 3 == 0 ? "3의 배수 입니다" : "3의 배수가 아닙니다";
		System.out.println(s);
		
		// Math.random() 이용 해서 -5 ~ 5 까지 랜덤한 정수를 생성
		// 반드시 절대값만 나올 수 있도록 3항 연산식을 작성해 보세요.
		int b = (int)(Math.random() * 11) - 5; // 0 이상 10에서 -5를 해서 -5 ~ 5 값을 랜덤 하게 나오게 만듬
		int a = (b < 0 ?  b * -1 : b ) ; // 만약 b가 0보다 작은 음수일 경우 -1을 *해 줘서 양수 값으로 변환 / b가 0보다 클 경우 그대로 출력
		System.out.println(b);
		System.out.println(a);
	
	}

}
