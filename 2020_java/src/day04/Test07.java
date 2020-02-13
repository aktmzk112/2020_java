package day04;

import java.util.*;

/*
 * String str = "clasls";
 * 
 * int idx = str.indexOf('l' , 2); //int idx = str.indexOf('l' , 2(위치값)); -->
 * 2번째 문자 뒤부터 찾는다 System.out.print(idx);
 */
/*
 * 
 *  정수를 입력받아 입력된 값이 짝수인지 홀수인지 판변하세요
 */

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//메세지 출력
		System.out.print("정수를 입력하세요 : ");

		//입력값 추출해서 변수 담고
		int no = sc.nextInt();
		
		// 판별
		if(no % 2 == 0) {
			System.out.println("짝수입니다");
		}
		
		if(no % 2 != 0) {
			System.out.println("호오오오올수 입니다~~");
		}
		//--------------------------------------------------------
		
		String msg = "호오오오오올수~~~~!!";
		
		if(no % 2 == 0) {
			msg = "짜아아아아악수~~~!!";
		}
		
		System.out.println(no + "는 " +msg+ "입니다");
	}
}
