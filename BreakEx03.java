package day02;

public class BreakEx03 {
	
		public static void main(String[] args) {
			
			// 이름 붙여 탈출하기 (중첩 반복문 에서)
			
//			boolean bool = false; // false라면 실행을 안함 , true라면 실행 했다.
//			
//			for(int i = 1; i <=10; i ++) {
//				
//				for(int j = 1; j <= 10; j++) {
//					
//					
//					System.out.println(i + "-" + j);
//					if(j == 5) {
//						bool = true;
//						break;
//					}
//					
//				} // inner
//				
//				if(bool) break;
//			}
			
			escape:for(int i = 1; i <= 10; i++) { // for문 앞에 이름을 만들어 줌 // 이름 + :
				for(int j = 1; j <= 10; j++) {
					
					System.out.println(i + "-" + j);
					
					if(j == 5) {
						break escape; // break 뒤에 멈추고 싶은 이름 적으면 해당 조건 발생시 탈출
					}
					
				}
			}
			
			
		}

	}
