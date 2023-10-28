package coffee;

import java.util.Scanner;

public class Coffee {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Scanner 함수로 입력 창 만들기
		
		String coffee ; // 커피 이름
		int price; // 커피 가격
		int num ; // 커피 수량
		int sum = 0 ; // 총 금액 (누적 변수)
		
		String a = "아메리카노"; // 커피 메뉴들에 대한 str 변수 선언
		String b = "녹차라떼";  
		String c = "아이스티"; 
		String d = "레몬에이드";
		String e = "에스프레소";
		
		String berry = "딸기케이크"; // 디저트 메뉴들에 대한 str 변수 선언
		String kakao = "초코케이크";
		String scon = "스콘";
		String mac = "마카롱";
		String bake = "바게뜨";
		
		String hot = "핫"; // 핫 과 아이스 타입 주문이 가능한 메뉴들에 넣을 타입들 str 변수 선언
		String ice = "아이스";
		
		
		while(true) { // 무한 반복문 실행
			System.out.println("원하시는 메뉴를 선택 해 주세요"); // 메뉴 선택 해 달라는 안내 및 원하는 메뉴 입력 
			System.out.println("1.커피 2.디저트 3.결제");
			int item = scan.nextInt();
			
			if(item == 1) {  // 1.커피라는 메뉴를 1번을 입력해서 선택 했을 경우 1번 커피 메뉴 실행
				System.out.println("1.아메리카노 2.녹차라떼 3.아이스티 4.레몬에이드 5.에스프레소  ");
				int menu = scan.nextInt();
				if(menu == 1) { // 1번 메뉴에 이하 조건문을 더 만들어 1번 아이스 아메리카노를 선택 했을 경우 실행
					System.out.print("1.hot 2.ice >"); 
					price = 3000; // 아메리카노 선택시 아메리카노는 3000원이라는 가격 선언
					int type = scan.nextInt(); // 아메리카노 경우 핫과 아이스 타입 선택 메뉴
					if(type == 1) { // 타입 1번은 핫 아메리카노 주문으로 간주 및 해당 금액 안내 및 수량 입력
						System.out.println(hot + " " + a + " " + price + "원");
						System.out.print("수량을 선택해 주세요 >");
						int num1 = scan.nextInt();
						System.out.println(hot + " " + a + " " +num1 +"개" + " " + (price*num1) + "원"); // 핫 아메리카노 총 주문 수량 및 금액
						sum += price*num1; // 마지막 결제 창에서 총 금액을 출력 할 것으로 해당 금액 sum 변수에 누적
					} // 이하 밑에 조건문들도 모두 같은 구조로 만듬
					if(type == 2) {
						System.out.println(ice + " " + a + " " + price + "원");
						System.out.print("수량을 선택해 주세요 >");
						int num1 = scan.nextInt();
						System.out.println(ice + " " + a + " " +num1 +"개" + " " + (price*num1) + "원");
						sum += price*num1;
					}
				}
				if(menu == 2) {
					System.out.print("1.hot 2.ice >");
					price = 4500;
					int type = scan.nextInt();
					if(type == 1) {
						System.out.println(hot + " " + b + " " + price + "원");
						System.out.print("수량을 선택해 주세요 >");
						int num1 = scan.nextInt();
						System.out.println(hot + " " + b + " " +num1 +"개" + " " + (price*num1) + "원");
						sum += price*num1;
					}
					if(type == 2) {
						System.out.println(ice + " " + b + " " + price + "원");
						System.out.print("수량을 선택해 주세요 >");
						int num1 = scan.nextInt();
						System.out.println(ice + " " + b + " " +num1 +"개" + " " + (price*num1) + "원");
						sum += price*num1;
					}
				}
				if(menu == 3) {
					price = 3000;
					System.out.println(c + " " + price + "원");
					System.out.print("수량을 선택해 주세요 >");
					int num1 = scan.nextInt();
					System.out.println(c + " " +num1 +"개" + " " + (price*num1) + "원");
					sum += price*num1;
			}
				if(menu == 4) {
					price = 5000;
					System.out.println(d + " " + price + "원");
					System.out.print("수량을 선택해 주세요 >");
					int num1 = scan.nextInt();
					System.out.println(d + " " +num1 +"개" + " " + (price*num1) + "원");
					sum += price*num1;
				
			}
				if(menu == 5) {
					price = 2000;
					System.out.println(e + " " + price + "원");
					System.out.print("수량을 선택해 주세요 >");
					int num1 = scan.nextInt();
					System.out.println(e + " " +num1 +"개" + " " + (price*num1) + "원");
					sum += price*num1;
			}
				}
			if(item == 2) {
				System.out.println("1.딸기케이크 2.초코케이크 3.스콘 4.마카롱 5.바게뜨  ");	
				int cake = scan.nextInt();
				if(cake == 1) {
					price = 5000;
					System.out.println(berry + " " + price + "원");
					System.out.print("수량을 선택해 주세요 >");
					int num2 = scan.nextInt();
					System.out.println(berry + " " +num2 +"개" + " " + (price*num2) + "원");
					sum += price*num2;
				}
				if(cake == 2) {
					price = 5000;
					System.out.println(kakao + " " + price + "원");
					System.out.print("수량을 선택해 주세요 >");
					int num2 = scan.nextInt();
					System.out.println(kakao + " " +num2 +"개" + " " + (price*num2) + "원");
					sum += price*num2;
				}
				if(cake == 3) {
					price = 3000;
					System.out.println(scon + " " + price + "원");
					System.out.print("수량을 선택해 주세요 >");
					int num2 = scan.nextInt();
					System.out.println(scon + " " +num2 +"개" + " " + (price*num2) + "원");
					sum += price*num2;
				}
				if(cake == 4) {
					price = 3000;
					System.out.println(mac + " " + price + "원");
					System.out.print("수량을 선택해 주세요 >");
					int num2 = scan.nextInt();
					System.out.println(mac + " " +num2 +"개" + " " + (price*num2) + "원");
					sum += price*num2;
				}
				if(cake == 5) {
					price = 2000;
					System.out.println(bake + " " + price + "원");
					System.out.print("수량을 선택해 주세요 >");
					int num2 = scan.nextInt();
					System.out.println(bake + " " +num2 +"개" + " " + (price*num2) + "원");
					sum += price*num2;
				}
			
			}
			if(item == 3) {
				System.out.println("주문 하신 메뉴에 총 금액은 " + sum + "원 입니다." ); // 사용자가 초기화면에서 3번을 입력 해 결제라는 메뉴를 선택 시
				break;	 // 주문 한 메뉴들에 대한 누적 금액 산출 및 무한 반복문 종료
			}
		
		}
	}
}
		
		
	
	

