package day04;

import java.util.*;
public class Ex01 {
	
	/*
	 *  숙제 1]
	 *   알파벳 문자 하나를 입력받아서 
	 *    소문자면 대문자로
	 *    대문자면 소문자로 
	 *    변환해서 출력하시오 
	 *    
	 *    'a' - 'A' ==> 32 
	 *    
	 *    b - 32 ==> 'B'
	 *    
	 *    숙제 2]
	 *    	정수 3개를 입렵받아서 
	 *    	세 수중 큰 수자만 출력되게 하세요 
	 *     
	 *     *모두 3항연산자 사용 하시요
	 *     
	 */
	public static void main(String[] args) {
//			System.out.println((char)('b' - 32));
			int num1, num2 , num3 , num4;
		
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("알파벳을 입력하시요 : ");
			String str1 = sc.nextLine();
			
			char str2 = str1.charAt(0);
			
			char str3 = (str2 <= 'Z') ? (char) (str2+32): (char) (str2 - 32);
			System.out.println("변환 완료 : " + str3);
			
			System.out.print("숫자1 : ");
			num1 = sc.nextInt();
			
			System.out.println("숫자2 : ");
			num2 = sc.nextInt();
			
			System.out.println("숫자3 : ");
			num3 = sc.nextInt();
			
			sc.close();
			
			num4 = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3);
			System.out.println("입력한 숫자중 가장 큰 값은 " + num4 + "입니다");
			
			
		
	}
}
