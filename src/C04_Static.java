
public class C04_Static {

	//static (���� ����, Ŭ���� ���� <=> �ν��Ͻ� ����)
	//���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� �����̴�.
	//static ������ Ŭ���� �� �ϳ��̱� ������ Ŭ���� �̸�.���� ����ϴ� ���� ����ȴ�.
	//static ������ ����/�޼���� �ν��Ͻ��� ����� ������ ȣ���� �� �ִ�.
	//�ν��Ͻ��� �������� ���� ���� static�� ���� ���ɼ��� �ֱ� ������ static �޼��忡���� instance �ڿ��� ���� ����.
	//(instance���� static������ ������ ����Ѵ�.)

	public static void main(String[] args) {

		Card s1 = new Card("Spade", 1);

		System.out.println(Card.width);
		System.out.println(s1.width); //s1.width = Card.width
	}
}

class Card {

	String shape; //�� ī�帶�� �ٸ��� (�ν��Ͻ�)
	int number; 
	
	static int width; //�� ī�� �� ���� (����ƽ)
	static int height; 

	static { //������(public Card)��� static block���� �ʱ�ȭ�� �����ϴ� ���� ����.		
		
		width = 100;
		height = 200;
		System.out.println("static block called");	
	}

	public Card(String shape, int number) {

		this.shape = shape;
		this.number = number;

		System.out.println("constructor block called");
	}

	public static void changeCardSize(int width, int height) {

		//static method : �Ű������� static ������ Ȱ���� �� �ִ� �޼���
		//�ν��Ͻ��� �����ϰ� �׻� ������ ����� ����.
		//static �޼��忡���� ���� �ν��Ͻ��� �������� �ʾ��� ���� �����Ƿ� this�� �������� �ʴ´�.

		Card.width = width;
		Card.height = height;
	}

	public static int[] getCardSize() {
		return new int[] {width,height};
	}
}


class Coffee {

	int from; //�� Ŀ���� �������� ��ȣ�� ǥ���ϱ�� ��.

	final static int SOUTH_KOREA = 0; 	//��� Ŀ�ǵ��� ���� �������̴�. => ���� ���� (static)
	final static int COLUMBIA = 1;
	final static int BRAZIL = 2; 

}


