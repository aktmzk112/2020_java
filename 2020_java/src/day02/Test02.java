package day02;
/*
 * 오늘 날짜를 출력하는데
 * 날짜에 해당하는 데이터는 정수형 변수에 담아서 출력

 *	변수 만드는 형식
 *
 *	예]
 *		1.문자 
 *			char ch = 'A';
 *		2.논리값
 *			boolean bool = ture;
 *
 *		3.정수
 *			int no = 7;
 *
 *		4.실수
 *			double val = 3.14;
 *
 *		5.문자열 : 기본 타입이 아니지만 빈번히 사용되는 데이터 이기 때문에 자바에서 편의 제공
 *			string str1 = "abcd";
 *			string str2 = new String("abcd");
 *
 		[접근지정자] [속성] 데이터타입 변수이름 = 데이터; 
 *
 */


public class Test02 {
	
	static String msg = "내일은 ";
	static int mon = 02;
	static int day = 12;
	static String str = "입니다";
	public static void main(String[] arge) {
		
		System.out.println("결과 : " + msg + mon + "월 " + day + "일 " + str);
	}
 
}
