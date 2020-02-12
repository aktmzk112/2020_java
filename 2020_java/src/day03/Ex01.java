package day03;

public class Ex01 {
	public static void main(String[] arge) {
		//밑변이  7 높이가 6인 삼각형의 면적을 구하시오 
		int num1 = 7;
		int num2 = 6;
		float soo = (float) 0.5;
		float soo2 = 0.5F;
		float area1 = num1 * num2 * soo;
		float area2 = num1 * num2 * soo2;
		System.out.println("밑변이 " +num1 + "이고 높이가 :" + num2 + "인 삼각형의 면적은 " + area1 + " 입니다.");
		System.out.println("밑변이 " +num1 + "이고 높이가 :" + num2 + "인 삼각형의 면적은 " + area2 + " 입니다.");
		
	}
}
