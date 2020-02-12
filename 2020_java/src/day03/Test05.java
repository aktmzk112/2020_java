package day03;

public class Test05 {
	public static void main(String[] args) {
		int no1 =10;
		int no2 = 11;
		System.out.println((no1 > no2) || (no1++ < no2));
		System.out.println("no1 :" + no1);
		// && or || 결삭 연산자라 하여 앞이 거짓(&&)이거나 참(||)이면 뒷 문장을 패스한다.
		
	}
}
