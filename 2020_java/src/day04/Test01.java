package day04;

/*
 * 
 *  ���� ���� ������ 
 *   ������ ����� ���� ������� �޸� ��ȯ���ִ� ������
 *   
 *    ����]
 *    	(���ǽ�) ? ���ǽ��� ���϶� ��ȯ�� : ���ǽ��� ������ �� ��ȯ��;
 *    
 */

public class Test01 {
	public static void main(String[] args) {
		
		int no1 = 3;
		int no2 = 5;
		//  ������ �����Ҷ� ���� Ÿ���� �ѹ��� �����Ҽ� �ִ� 
		int num1, num2, num3;
		
		String msg = (no1 > no2) ? (no1 + "�� " + no2 +"���� Ů�ϴ�.") : (no1 + "�� " + no2 +"���� �۽��ϴ�."); 
		System.out.println(msg);
		
		boolean bool1 = no1 > no2;
		msg = bool1 ? (no1 + "�� " + no2 +"���� Ů�ϴ�.") : (no1 + "�� " + no2 +"���� �۽��ϴ�.");
		 
		System.out.println(msg);
		
	}
}
