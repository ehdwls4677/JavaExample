package day01;

public class Casting02 {
	
	public static void main(String[] args) {
		
		// 2. 크기가 큰 타입을 작은 타입에 저장할 때는 (type) 캐스팅 합니다.
		
		int i = 70;
		
		byte b = (byte)i; // int -> byte 형 변환
		
		char c = (char)i; // int -> char 형 변환
		
		System.out.println(b);
		System.out.println(c); // char 형으로 변환이 되었기 때문에 해당 숫자에 맞는 문자값이 나옴
		
		float f = 3.14F;
		
		int j = (int)f; // float -> int 형 변환
		
		System.out.println(f);
		System.out.println(j);
		
		// 주의할 점
		// 형 변환 시 저장 할 수 없는 범위가 들어오면 잘려나간 값이 저장됩니다. 
		int k = 1000;
		byte bb = (byte)k; // byte 경우 1000이라는 값을 받지 못 하므로 잘려 나간 후 -24라는 숫자 출력
		
		System.out.println(bb);
		
		// 예외적인 형 변환 - char -> short 형으로 변경할 때도 명시적으로 형 변환 해야 함 (char는 문자형 / short는 숫자형이기 때문에 형태가 다르기 때문에)
		char cc = 'A';
		short ss = (short)cc;
		
		}

}
