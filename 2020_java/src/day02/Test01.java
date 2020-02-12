package day02;


public class Test01 {
	
	public static void main(String[] args) {	
		
		String msg = "오늘은 ";
		String month = "02";
		String day = "11";
		String str = "입니다.";
		
		System.out.println(msg + month +"월 "+day + "일 "+str); //실행문은 함수 내부에 작성하는것이 원칙이다.
		
		//변수 변경
		msg = "내일은 ";
		day = "12";
		
		System.out.println(msg + month +"월 "+day + "일 "+str);		
		
	}
	
}
