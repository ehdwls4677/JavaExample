package day01;

public class Casting01 {
	
	public static void main(String[] args) {
	
		// 1. 크기가 작은 타입을 큰 타입에 저장할 때는 자동으로 형 변환이 일어남
		// JVM이 자동 형 변환 시킵니다.
		
		byte b = 10;
		
		short s = b; // byte -> short로 자동 형 변환
		int i = b; 	// short -> int로 자동 형 변환	
		long l = b; // int -> long으로 자동 형 변환
		
		char c = '가'; // 2byte
		int j = c; // char -> int로 자동 형 변환
		
		System.out.println(j); // char -> int 형 변환으로 인해 결과값 44032
		
		int k = 1000;
		double d = k; // int -> double
		
		System.out.println(d); //int -> double 형 변환으로 인해 결과값 1000.0 
		
		
	}

}
