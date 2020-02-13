package day04;

/*
 * 
 *  삼항 조건 연산자 
 *   조건이 결과에 따라서 결과값이 달리 반환해주는 연산자
 *   
 *    형식]
 *    	(조건식) ? 조건식이 참일때 반환값 : 조건식이 거짓일 떄 반환값;
 *    
 */

public class Test01 {
	public static void main(String[] args) {
		
		int no1 = 3;
		int no2 = 5;
		//  변수를 선언할때 같은 타입은 한번에 선언할수 있다 
		int num1, num2, num3;
		
		String msg = (no1 > no2) ? (no1 + "은 " + no2 +"보다 큽니다.") : (no1 + "은 " + no2 +"보다 작습니다."); 
		System.out.println(msg);
		
		boolean bool1 = no1 > no2;
		msg = bool1 ? (no1 + "은 " + no2 +"보다 큽니다.") : (no1 + "은 " + no2 +"보다 작습니다.");
		 
		System.out.println(msg);
		
	}
}
