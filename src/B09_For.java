
public class B09_For {

	public static void main(String[] args) {
		
		//�ݺ���
		//for, while, do-while(�Ⱦ�), for each
		//�Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�.
		
		/*for (�ʱⰪ; ����; ������) ���� 
		 1. �ʱⰪ���� ����. 
		 2. �������� ����. 
		 3. �����Ϸ� ����.
		 4. ������ ������(�߰�ȣ ��) ���������� �ö󰣴�.
		 5. 2������ ���ư���.		 
		 {
		 ��� ������ true�� ���� �ݺ��� ���๮
		 }
		 */
		
		//1.���� �⺻���� ����
		//���ϴ� Ƚ����ŭ �ݺ�
		//�ʱⰪ�� 0�� �ְ�, ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ���´�.
		//������ 1���Ѵ�. 
		//++i�� i++�� ���̰� ����.
		for (int i = 0; i < 5000; ++i) {
		System.out.println("Hello, World!" +i);
		}
		
		//2.�ʱⰪ�� �������� ��ġ�� ������� ������ �� ����.
		for (int i = 10; i < 33; i+= 2) {
			System.out.println("Hello " +i);
		}
		for (int i = 9000; i >0; i -= 100) {
			System.out.println("Minus " +i);
		}
		
		//�ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�.
		int num = 0;
		for (; num < 100;) {
			System.out.println("������� " +num);
			++num;
		}
		
		//3.���ο� �ٸ� ������ �����Ӱ� ����� �� �ִ�.
		for (int month = 1; month <= 12; ++month){
			switch(month) {
			case 1: case 2: case 12:
				System.out.printf("%d���� �ܿ��Դϴ�.", month);
				break;
			case 3: case 4: case 5:
				System.out.printf("%d���� ���Դϴ�.", month);
				break;
			case 6: case 7: case 8:
				System.out.printf("%d���� �����Դϴ�.", month);
				break;
			case 9: case 10: case 11:
				System.out.printf("%d���� �����Դϴ�.", month);
				break;
			default:
			 System.out.println("�߸� �ԷµǾ����ϴ�.");
			 break;
			}
			
			System.out.println();
		//4.������ ������ų� true�� ������ ���ѹݺ�
		//��break�� �̿��� �ݺ����� Ż���� �� �ִ�.
		}
		num = 0;
		for (;;) {
			System.out.println(num += 99);
			break;
		}
		
		//5.continue: ������ �ݺ����� ��ŵ�Ѵ�.
		for (int i = 0; i < 100; ++i) {
			System.out.printf("%-3d", i);
			if ( i % 10 != 9)
				continue;
			System.out.println(); //�ٹٲ�
			
		}
		
		//6.�ݺ������� ���� ���ϱ�
		//������ ������ ������ �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
		//�ݺ����� ���� �ش� ������ ���� ������Ų��.
		
		int sum = 0;
		for (int i = 80; i <= 333; ++i) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
