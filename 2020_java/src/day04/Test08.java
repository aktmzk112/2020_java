package day04;

import java.util.*;

public class Test08 {
	public static void main(String[] args) {
			//입력 준비
			Scanner sc = new Scanner(System.in);
			//메세지 출력
			System.out.println("정수를 입력하세요 : ");
			//입력 데이터 받기
			int no1 = sc.nextInt();
			
			
			//판별
			String str = "";
			if(no1 % 2 == 0) {
				str = "짝수";
			}else {
				str = "홀수";
			}
			//출력 
			System.out.println("입력된 정수 " + no1 + "은 " + str + "입니다");
	}
}
