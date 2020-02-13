package day04;

import java.util.*;

public class Test06 {
	public static void main(String[] args) {
		/*
		 * 제어문 - 프로그램의 흐름을 제어하는 문장
		 * 	종류
		 * 		1.조건문 - 조건에 맞으면 실행 
		 * 			if, if~else , if ~ else if ~ else , swutch ~ case
		 * 			
		 * 			1) if 문 
		 * 				a)
		 * 				if(조건(b) {
		 * 					실행문(c) 
		 * 				}
		 * 					(d)
		 * 					
		 * 					b가 참(true)일경우 : a - b - c- d 
		 * 					b가 거짓(false)일 경우 : a - b - d 
		 * 
		 * 			2)
		 * 				
		 *  
		 *		2. 반복문 - 반복적으로 실행
		 *			for  , while , do ~ while , 향성된 for  		
		 */		
		
		//과목 코드를 만들고 코드를 입력하면 과목을 출력해주자.'
		int kor = 1001;
		int eng = 1002;
		int math = 1003;
		int sci = 1004;
		
		//과목 이름담을 변수
		String sub = "progrannimg";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목 코드를 입력하세요 : ");
		// 코드값 저장
		
		int code = sc.nextInt();
		sc.close();
		
		switch( code ){
		case 1001: 
			 sub = "국어";			
			break;
		case 1002: 
			sub = "영어";
			break;
		case 1003:
			sub = "수학";
			break;
		case 1004:
			sub = "과학";
			break;
		
		default :
			sub = "없는";
		}

		System.out.println("입력된 코드는 : " + sub + "과목 입니다 ");
		
	}
}
