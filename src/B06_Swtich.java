
public class B06_Swtich {

	public static void main(String[] args) {
		
		//Switch-Case��
		//()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�.
		//If������ �Ϻ��ϰ� ��ü �����ϴ�.
		//break�� �Ⱦ��� break�� ���������� ��� case�� �����Ѵ�.
		
		int a =10;
		
		//¦�� or Ȧ��
		switch (a % 2) {
		case 0:
			System.out.println("¦���Դϴ�.");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�.");
			break;
		}
		//�����ϴ� �ܾ�
		String word = "apple";
		
		switch (word.charAt(0)) {
		case 'A': case 'a':
			System.out.println("a�� �����ϴ� �ܾ��Դϴ�.");
			break;//break�� ������ "b�� �����ϴ� �ܾ��Դϴ�."�� ����ȴ�.
		case 'B': case 'b':
			System.out.println("b�� �����ϴ� �ܾ��Դϴ�.");
			break;
		case 'c':
			System.out.println("c�� �����ϴ� �ܾ��Դϴ�.");
			break;
		default:
			System.out.println("���� case�� ��� �ƴմϴ�.");
			break;
			
		}

	}

}
