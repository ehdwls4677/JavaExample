package day01;

public class Operation02 {
	
	public static void main(String[] args) {
		
		int i = 7 / 3; // 몫 2
		int j = 7 % 3; // 나머지 1
		int k = 7 * 3; // 곱한 값 21
		
		// 비교 연산
		System.out.println(i == j); // 2 == 1 // false
		System.out.println(i != j); // 2 != 1 // true
		System.out.println(i >= j); // 2 >= 1 // true
		System.out.println(i < j);  // 2 < 1 // false
		System.out.println(k != 21); // 21 != 21 // false
		System.out.println(k % 2 == 1); // 1 == 1 // true 
		System.out.println(k % 2 != 0); // 1 != 0 // true
		
		System.out.println("---------------------------------------------------");
		
		
		// 비트 연산자 & |
		
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		
		System.out.println(a & b); // 0000 0001 둘 다 1이면 1, 아니면 0
		System.out.println(a | b); // 0000 0111 둘 중 하나만 1이면 1, 아니면 0
		System.out.println(a ^ b); // 0000 0110 다르면 1, 같으면 0
	
		// 비트 시프트 >> <<
		
		int h = 192;
		System.out.println(h << 3); // h가 3만큼 << 이동 // 1536
		
		
		
	}

}
