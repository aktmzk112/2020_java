package day04;

import java.util.*;

/*
 * String str = "clasls";
 * 
 * int idx = str.indexOf('l' , 2); //int idx = str.indexOf('l' , 2(��ġ��)); -->
 * 2��° ���� �ں��� ã�´� System.out.print(idx);
 */
/*
 * 
 *  ������ �Է¹޾� �Էµ� ���� ¦������ Ȧ������ �Ǻ��ϼ���
 */

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�޼��� ���
		System.out.print("������ �Է��ϼ��� : ");

		//�Է°� �����ؼ� ���� ���
		int no = sc.nextInt();
		
		// �Ǻ�
		if(no % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}
		
		if(no % 2 != 0) {
			System.out.println("ȣ�������ü� �Դϴ�~~");
		}
		//--------------------------------------------------------
		
		String msg = "ȣ���������ü�~~~~!!";
		
		if(no % 2 == 0) {
			msg = "¥�ƾƾƾƾǼ�~~~!!";
		}
		
		System.out.println(no + "�� " +msg+ "�Դϴ�");
	}
}
