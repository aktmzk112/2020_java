package day03;

public class Test01 {
	public static void main(String[] arge) {
		int no = 10; //= : 대입연산자
		System.out.println("1. no : "+ no);
		no = no + 1; 
		System.out.println("2. no : "+ no);
		no += 1; // => no = no + 1
		System.out.println("3. no : " + no);
		
		/*
		 * -= : 뺴주고 대입해주는 연산자
		 * *= : 곱하고 대입해주는 연산자
		   /= : 나누고 대입해주는 연산자
		   %= : 몫을 구하고 대입해주는 연산자 
		 */
		
		int num = 3;
		num *= 2; 
		num *=2;
		System.out.println("num : "+num);
	}
	
}
