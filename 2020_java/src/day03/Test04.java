package day03;

public class Test04 {
	public static void main(String[] args) {
		/*
		 *  비교연산자
		 *  	: 두개의 데이터를 비교할때 사용하는 연산자
		 *  		연산 결과값은 항상 true / false 로 반환 한다
		 *  
		 *  	> , < , == , >= , <= , != 
		 * 		
		 * 		참고 
		 * 			>=, <= (o)
		 * 			=>, =< (x)
		 * 
		 */
		
		int no1 = 10;
		int no2 = 12;
		System.out.println("1. no1 > no2 :" + (no1 > no2));
		System.out.println("2. no1 == no2 -2 :" + (no1 == no2 - 2));
		System.out.println("3. no1 != no2 : " + (no1 != no2));
		System.out.println("4. !(no1 == no2) : " + !(no1 == no2));
		
		
	
	}
}
