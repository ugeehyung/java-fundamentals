
public class B10_InnerLoop {

	public static void main(String[] args) {
		
		//�ݺ��� ���ο� �ݺ��� 
		
		for (int i = 0; i<10; ++i) {
			System.out.printf( "==================�ٱ��� %d\n", i);
			for (int j = 0; j<5; ++j) {
				System.out.printf("-----------���� %d-%d\n", i, j);
					for (int k = 0; k<2; ++k) {
					System.out.printf("+++++�Ⱦ��� %d-%d-%d\n", i, j, k);
				}
			}
		}

		//���� �ݺ������� ������ ����ϱ�
		//2�ܺ��� 9�ܱ��� :�� �ݺ���(2~9)
		//�� �ܸ��� 1���� 9���� :�� �ݺ���(1~9)
		
		for (int goo = 2; goo <=9; ++goo) {
			System.out.printf("%d��:\n", goo);
			System.out.println();
			for (int dan = 1; dan <=9; ++dan) {
				System.out.printf("%d X %d = %d\n", goo, dan, goo*dan);
			}
			System.out.println();
		}
	}

}
