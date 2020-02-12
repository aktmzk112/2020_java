package day02;

public class Ex01 {
	public static void main(String[] args) {
		//1. 밑변이 5이고 높이가 3인 삼각형의 넒이를 구하시오 
			int no1 = 5;
			int no2 = 3;
			double soo = 0.5;
			double area1 = no1 * no2 * soo;
					
			System.out.println("삼각형의 넒이 : " + area1 + " 입니다.");
		
		//2. 가로가 5, 세로가 7인 사각형의 넒이를 구하시오 
			int no3 = 5;
			int no4 = 7;
			int area2 = no3 * no4;
			
			System.out.println("사각형의 넒이 : " + area2 + " 입니다.");
			
		//3. 반지름이 2인 원의 둘레를 출력
			int no5 = 2;
			System.out.println("원의 둘레 : " + (2 * no5 * 3.14));
		
	}
}
