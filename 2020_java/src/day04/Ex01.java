package day04;

import java.util.*;
public class Ex01 {
	
	/*
	 *  ���� 1]
	 *   ���ĺ� ���� �ϳ��� �Է¹޾Ƽ� 
	 *    �ҹ��ڸ� �빮�ڷ�
	 *    �빮�ڸ� �ҹ��ڷ� 
	 *    ��ȯ�ؼ� ����Ͻÿ� 
	 *    
	 *    'a' - 'A' ==> 32 
	 *    
	 *    b - 32 ==> 'B'
	 *    
	 *    ���� 2]
	 *    	���� 3���� �Էƹ޾Ƽ� 
	 *    	�� ���� ū ���ڸ� ��µǰ� �ϼ��� 
	 *     
	 *     *��� 3�׿����� ��� �Ͻÿ�
	 *     
	 */
	public static void main(String[] args) {
//			System.out.println((char)('b' - 32));
			int num1, num2 , num3 , num4;
		
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("���ĺ��� �Է��Ͻÿ� : ");
			String str1 = sc.nextLine();
			
			char str2 = str1.charAt(0);
			
			char str3 = (str2 <= 'Z') ? (char) (str2+32): (char) (str2 - 32);
			System.out.println("��ȯ �Ϸ� : " + str3);
			
			System.out.print("����1 : ");
			num1 = sc.nextInt();
			
			System.out.println("����2 : ");
			num2 = sc.nextInt();
			
			System.out.println("����3 : ");
			num3 = sc.nextInt();
			
			sc.close();
			
			num4 = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3);
			System.out.println("�Է��� ������ ���� ū ���� " + num4 + "�Դϴ�");
			
			
		
	}
}
