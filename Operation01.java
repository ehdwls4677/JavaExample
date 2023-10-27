package day01;

public class Operation01 {
	
	public static void main(String[] args) {
		
		// 부호 연산자 +, -
		int i = -3;
		int j = -i;
		
		// 증감 연산자 ++, --
		int k = 1; // 결과 값 2
		int h = k++; // 후위 연산 - > 먼저 값을 대입 , 그 다음에 자신 1 증가 // 결과 값 1
		
		System.out.println("k값:" + k);
		System.out.println("h값:" + h);
		
		int x = 1;
		int y = ++x; // 전위 연산 -> 먼저 값을 증가 , 그 다음에 대입
		
		System.out.println("x값:"+ x);
		System.out.println("y값:"+ y);
		
		// 일반 적인 사용
		x = 1;
		x++; 
		++x;
		
		System.out.println("x:" + x);
		
		x = 1;
		System.out.println(x++);
		System.out.println(++x);
		
		System.out.println("---------------------------------------------------");
		
		// 비트 연산자 ~ (많이 사용 x )
		byte b = 10; // 10을 2진법으로 나타냈을때 = 0000 1010
		System.out.println(~b); // ~ 을 이용 해서 비트 값을 반대로 뒤집어 줌 1111 0101이 발생하기 때문에 10진법일 경우 -11 발생
		
		System.out.println("---------------------------------------------------");
		
		// 논리 반전연산 ! (영어로 not)
		System.out.println(!true); // false
		
		boolean bool = !false;
		
		System.out.println(bool); // true
		
		
	}

}
