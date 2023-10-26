package day01;

public class DataType {
	
	public static void main(String[] args) {
		
		byte a = -128; // -128 ~ 127
		byte a1 = 127;
		
		short a2 = -32768; // -32768~ 32767
		short a3 = 32767;
		
		int a4 = -2147483648;
		int a5 = 2147483647;
		
		long a6 = 3212315153131515234L; //L을 붙임
		
		// 2진수 - 0b 앞에
		// 8진수 - 0 앞에
		// 16진수- 0x 앞에
		
		int a7 = 0110; //8진수 형태 로도 저장 가능
		
		System.out.println(a7);
		System.out.println("-----------------------------------------------------------------------");
		
		float b1 = 3.141592F; // float은 F를 붙입니다.
		double b2 = 3.14159211122; // 15자리 신뢰
		
		System.out.println(b1);
		System.out.println(b2);
			
		//e 표기법
		double b3 = 0.000314e4;
		double b4 =314.15e-2;
		System.out.println(b3);
		System.out.println(b4);
		
		System.out.println("-----------------------------------------------------------------------");
		
		// boolean -
		
		boolean c1 = true;
		boolean c2 = false;
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("-----------------------------------------------------------------------");
		
		// 문자 타입
		
		//char - '한'
		//String - "문자열"
		
		char d1 = 'A'; //2byte
		char d2 = 65;
		
		System.out.println(d1);
		System.out.println(d2);
		
		// 아스키 코드 -> 크기를 2byte로 늘리고 , 65536개 글자에 숫자값을 지정
		char d3 =44032;
		char d4 ='가';
		char d5 = '\uAc00';
				
		System.out.println(d3 + "-" + d4 + "-" + d5);
		
		// 문자열
		String s1 = "hello ";
		String s2 = "wolrd!!";
		
		// 문자열의 연산
		// 문자열 + 로 붙이면 문자열을 붙인 결과를 가져옴
		System.out.println(s1 + s2);
		
		// 문자열과 서로 다른 타입의 + 연산 = 결과는 무조건 문자열
		System.out.println(200 + 200); // 같은 int 타입으로 200 + 200 값인 400이 나옴
		System.out.println(200 + "200"); // int + str형으로 결과값은 str값인 200200이 나옴
		System.out.println(200 + 200 + "200"); // 400200
		System.out.println("200" + 200 + 200); //200200200
		
		//?
		System.out.println("A" + 10); // A10
		System.out.println('A' + 10); // 75 / char의 값인 'A' 경우 65라는 숫자값을 가지므로 65+10의 결과값인 70이 나옴
	}

}
