
//Ctrl + [+,-] : ���� ũ�� ����
//Ctrl + M : ���� â ũ�� �ִ� �ּ�ȭ
//Ctrl + z : ��� �� �� ���
//Ctrl + y : Ctrl + z �� ���
//Ctrl + \ : ���� �ּ� ó��

//Ctrl + a : �� ��ü ��� ����
//Shift + ����Ű : ��� ����
//Shift + END : Ŀ�� ��ġ���� ���� �� �ڱ��� �������
//Shift + tab : �Ųٷ� �鿩����

/**
 ����ȭ �ּ� (��Ŭ������ �� ������ �о��ش�)
 */

// public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ�

public class A00_Hello {
//���� ���� ������ �� �װ��� Ŀ���� �ΰ� F2�� ������ �ش� ������ ���� ������ �ذ�å�� �� �� �ִ�.
	
	// main() �Լ�
	// = ���α׷��� ���� ����
	// ���α׷��� �����ϸ� ���� ���� main() �Լ��� ã�Ƽ� �����Ų��.
	// main() �Լ��� ������ �߰�ȣ�� �����ȴ�.
	
	public static void main(String[] args) {
		//���α׷��� ���� ����
		
		// system.out.println() �Լ�
		// ()�ȿ� ������ �����͸� �ֿܼ� ����ϴ� �Լ�
		// �Լ���, � �ܾ� �ڿ� ()�� �پ� �ִ� ���� ��� �Լ���� �Ѵ�.
		// �ܼ��̶�, ���ڸ� ������ ���� ȭ�� (���� ��ǻ�� ȭ��)
		// Eclipse������ �׽�Ʈ������ �Ͼ� ������ �ܼ��� �����ϴ� �� ���̴�.
		// ������ �츮�� �ۼ��� ���α׷��� ���� ȭ�鿡�� �����ϸ� ���� ȭ�鿡 ��µȴ�.
		
		System.out.println("Hello World!");//Ctrl + F11
		System.out.println("Apple");
		System.out.println("Melon");
		
		System.out.println("��������������������������������������������������������");
		
		System.out.println("  1. Start Game ");
		System.out.println("  2. Exit ");
		
		System.out.println("��������������������������������������������������������");
		
		// �ڹ��� �����͵� 
		
		// 1. ""���̿� ���� ��: ���ڿ� (String)
		System.out.println("ABCDE�����ٶ�");
		System.out.println("�ȳ��ϼ���~~~~~!");
		
		// 2. �׳� ���� : ���� (int, Integer)
		System.out.println(123456);
		System.out.println(123+2);
		System.out.println(123*89785462);
		
		// 3. �Ҽ� : �Ǽ� (Double, Float)
		System.out.println(123.123); //�Ⱥ��̸� double
		System.out.println(123.123f); //f���̸� float
		
		// 4. ''���̿� ���� ��: ���� (Character), ���� �� �ϳ�
		// ���� ����ǥ���� ���ڸ� ������ ������ ������ �߻��Ѵ�.
		System.out.println('o');
		System.out.println('x');
		System.out.println('ʫ');
		System.out.println('$');
		
		//���ڰ� ������ ������ �ִ� ���ڰ� ����
		System.out.println("ʫ�� ���ڰ� : " + (int)'ʫ');
		System.out.println("$�� ���ڰ� : " + (int)'$');
		System.out.println("'��'�� ���ڰ� : " + (int)'��');
		
		//�ڵ� ������ ���� ����ϱ�
		System.out.println((char)23478);
		System.out.println((char)36);
		System.out.println((char)44032);
				
		// �ٸ� Ÿ�� + ������ �����ϴ� 
		// 1) ���ڿ� + ����: �̾���̱�
		System.out.println("123" + 456);
		// 2) �Ǽ� + ������ �Ǽ��� �ȴ�
		System.out.println(1234.56 + 30);
		// 3) ���� + ������ 
		System.out.println('��' + 90);
		
		// ; (�����ݷ�) : �� ��ɾ �������� �˸���.
		
		// ���α׷��� �� ����
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
