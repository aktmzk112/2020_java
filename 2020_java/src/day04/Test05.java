package day04;

import java.util.*;
public class Test05 {
	/*
	 *  ���ĺ��� �Է¹޾Ƽ�
	 *  �빮���̸� "�Է¹��� ���ڴ� O�� �빮�� �Դϴ�"
	 *  �ҹ����̸� "�Է¹��� ���ڴ� O�� �ҹ��� �Դϴ�"
	 *  ���
	 *  
	 *  Scanner ���� ���ڸ� �������ִ� �Լ��� �������� �ʽ��ϴ�
	 *  ���� ���ڿ��� �������Ŀ� ù��° �ڸ��� ���ڸ� �����㿩 ����ؾ� �Ѵ� 
	 *  charAt(��ġ��) ==> ���ڿ��� ��ġ���� ����ִ�  ���ڸ� �������ִ� �Լ�
	 *  	���� ] 
	 *  		�ڹٿ��� ����ϴ� ��ġ���� index��� �θ��� 0���� �����Ѵ�.
	 *  
	 *  indexOf(���� �Ǵ� ���ڿ�)  
	 */
	public static void main(String[] args) {
		String str = "class";
		
		//ù��° ���� �����ϱ�

		char ch = str.charAt(0);
		System.out.println("str�� ù��° ���� "+ ch);
		
		// a�� ��ġ�� �˾Ƴ���
		int idx = str.indexOf('a');
		System.out.println("a�� ��ġ�� : "+ idx + "�Դϴ�.");
				
		// �Է¹��� �غ� 
		Scanner sc = new Scanner(System.in);
		
		//�޼��� ���
		System.out.println("���ĺ��� �Է��ϼ��� : ");
		String str9 = sc.nextLine();
		
		// ���ڷ� ����
		char ch1 = str9.charAt(0);
		
		String str2 = (ch1 >= 'a') ? "��" : "��"; 
		
		String str3 = "�Էµ� ���� " + ch1 + "�� " + str2 + "���� �Դϴ�.";
		
		System.out.println(str3);
		
		
		//3�� ���ǿ������� ��ø���
		String str4 = (ch1 >= 'a') ? ((ch1 <= 'z') ? "��":"Ư��") : "��"; 
		System.out.println("�Էµ� ���� " + ch1 + "�� " + str4 + "���� �Դϴ�.");
		
		// �ڹٿ��� �񱳴� �ѹ��� �Ѱ��� �����ϴ�
		// a > b > c => (x)
		// a > b
		// b > c
		
		
	
	}
	
}
