import java.util.Scanner;

public class B11_While {

	public static void main(String[] args) {

		//while
		//for���� ������ �ణ �ٸ� �ݺ��� 
		//�ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�.
		//�������� ��ġ�� ���� �ݺ��� ����� �޶��� �� �ִ�.
		//()���� ������ ���� ���� {}���� ������ �ݺ��Ѵ�.

		int i = 0;
		while(i<10) {//��ġ,��ġ�� ���� �޶�����. 
			System.out.println("hello, world! (while)" + i); //��ġ,��ġ�� ���� �޶�����.
			++i; // ++i�� ��ġ�� ���� �޶�����(��,�Ʒ�). 
		}
		for (int j =0 ; j<10; ++j) {
			System.out.println("hello, world! (for)" + j);
		}
		System.out.println();
		//while���� ����ϰԲ� ����� Ŭ������
		//has, next���� ���ľ ���� �Լ�(�޼���)�� ������ �ִ�.
		//��ǥ���� ex: scanner
		//System.in : �ܼ��� ���� �Է��� �ϴ� ��� (inputStream)

		Scanner sc1 = new Scanner("apple banana orange ");	//��System.in ��� ���ڿ��� ���� ��ĳ�ʿ� �Է�
		Scanner sc2 = new Scanner("dog cat rat bird");

		//sc1�� ���� ������ �ִµ��� ���
		while (sc1.hasNext()) {
			System.out.println(sc1.next());
		}
		while (sc2.hasNext()) {
			System.out.println(sc2.next());
		}
		System.out.println();
		
		//while���� ���� ���α׷� �����ϱ�
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. ����ϱ�");
			System.out.println("2. �����ϱ�");
			int cmd = sc.nextInt();
			
			switch(cmd) {
			case 1:
				System.out.println("����մϴ�");
				break;
			case 2:
				System.out.println("�����մϴ�");
				System.exit(0);
				break;
			default:
				System.out.println("�ùٸ� ������ �ƴմϴ�");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
