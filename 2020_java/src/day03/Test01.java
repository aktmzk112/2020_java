package day03;

public class Test01 {
	public static void main(String[] arge) {
		int no = 10; //= : ���Կ�����
		System.out.println("1. no : "+ no);
		no = no + 1; 
		System.out.println("2. no : "+ no);
		no += 1; // => no = no + 1
		System.out.println("3. no : " + no);
		
		/*
		 * -= : ���ְ� �������ִ� ������
		 * *= : ���ϰ� �������ִ� ������
		   /= : ������ �������ִ� ������
		   %= : ���� ���ϰ� �������ִ� ������ 
		 */
		
		int num = 3;
		num *= 2; 
		num *=2;
		System.out.println("num : "+num);
	}
	
}
