package day04;

import java.util.*;

public class Test06 {
	public static void main(String[] args) {
		/*
		 * ��� - ���α׷��� �帧�� �����ϴ� ����
		 * 	����
		 * 		1.���ǹ� - ���ǿ� ������ ���� 
		 * 			if, if~else , if ~ else if ~ else , swutch ~ case
		 * 			
		 * 			1) if �� 
		 * 				a)
		 * 				if(����(b) {
		 * 					���๮(c) 
		 * 				}
		 * 					(d)
		 * 					
		 * 					b�� ��(true)�ϰ�� : a - b - c- d 
		 * 					b�� ����(false)�� ��� : a - b - d 
		 * 
		 * 			2)
		 * 				
		 *  
		 *		2. �ݺ��� - �ݺ������� ����
		 *			for  , while , do ~ while , �⼺�� for  		
		 */		
		
		//���� �ڵ带 ����� �ڵ带 �Է��ϸ� ������ ���������.'
		int kor = 1001;
		int eng = 1002;
		int math = 1003;
		int sci = 1004;
		
		//���� �̸����� ����
		String sub = "progrannimg";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ڵ带 �Է��ϼ��� : ");
		// �ڵ尪 ����
		
		int code = sc.nextInt();
		sc.close();
		
		switch( code ){
		case 1001: 
			 sub = "����";			
			break;
		case 1002: 
			sub = "����";
			break;
		case 1003:
			sub = "����";
			break;
		case 1004:
			sub = "����";
			break;
		
		default :
			sub = "����";
		}

		System.out.println("�Էµ� �ڵ�� : " + sub + "���� �Դϴ� ");
		
	}
}
