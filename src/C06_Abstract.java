import java.util.Scanner;

import crypto.CaesarCipher;
import crypto.Cipher;

public class C06_Abstract {

	//�߻�Ŭ���� : Ŭ���� ���ο� �߻�޼��带 ���� Ŭ����
	//�߻�޼��� : �Լ��� ���¸� ���س��� �ڽ� Ŭ�������� �������̵带 �����ϰ� �����.

	abstract public class AbstractTest {

		abstract public String fruit(int num);
		abstract public int price(int num);
		abstract public int basket(int fruit_num);	
		abstract public int whole_price(int fruit_num);
		abstract public String whole_result(String fruit, int fruit_num, int basket, int whole_price);
	}

	public static void main(String[] args) {

		AbstractTest at = null;
		
		Scanner int_sc = new Scanner(System.in);
		Scanner str_sc = new Scanner(System.in);
		System.out.println("1.���\n2.������\n3.����\n4.��\n5.������");
		System.out.print("������ ���Ͽ� �ش��ϴ� ��ȣ�� �Է��ϼ��� >> ");
		int num = int_sc.nextInt();
		String fruit = at.fruit(num);
		System.out.println(fruit+"�� �����ϼ̽��ϴ�.");
		System.out.println("������ ������ ������ �Է��ϼ��� >> ");
		int fruit_num = int_sc.nextInt();
		int basket = at.basket(fruit_num);
		int whole_price = at.whole_price(fruit_num);

		String result = at.whole_result(fruit, fruit_num, basket, whole_price);
		System.out.println(result);

	}

}
