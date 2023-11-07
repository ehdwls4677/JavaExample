package day03;

import java.util.Scanner;

public class ArraySearch {
	
	public static void main(String[] args) {
		
		// 탐색(순회)
		
		int[] arr = {54, 23, 12, 76, 56, 45, 1, 2, 3};
		
		// 입력 받은 값이 배열에 있는가?
		Scanner scan = new Scanner(System.in);
		
		System.out.print("찾을값 >");
		int search = scan.nextInt();
		
		boolean bool = false; // 찾았다? 못 찾았다?
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == search) {
				
				System.out.println(search +"는 " + i + "번째 인덱스에 있습니다.");
				bool = true; // bool true 라는 것은 if문을 실행 했다는 의미
				break;
			}
			
		}
		
		if(bool == false) { // bool이 false와 같은 경우 if가 실행되지 않았다는 것으로 해당 값은 없다는 뜻
			System.out.println(search + "는 없습니다.");
		}
		
		
	}

}
