package day04;

import java.util.*;

public class Test08 {
	public static void main(String[] args) {
			//�Է� �غ�
			Scanner sc = new Scanner(System.in);
			//�޼��� ���
			System.out.println("������ �Է��ϼ��� : ");
			//�Է� ������ �ޱ�
			int no1 = sc.nextInt();
			
			
			//�Ǻ�
			String str = "";
			if(no1 % 2 == 0) {
				str = "¦��";
			}else {
				str = "Ȧ��";
			}
			//��� 
			System.out.println("�Էµ� ���� " + no1 + "�� " + str + "�Դϴ�");
	}
}
