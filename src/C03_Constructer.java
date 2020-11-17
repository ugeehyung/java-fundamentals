public class C03_Constructer {

	public static void main(String[] args) {

		Orange o1 = new Orange();
		//������: constructer = Ŭ���� ������. ���� Ÿ���� ���� Ŭ������� ���� �̸�. 
		//�ν��Ͻ� �����ÿ� ���� ���� ȣ��. �ַ� �ν��Ͻ� �������� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�.
		//�����ڸ� ���� �������� ������ �⺻�����ڰ� �ڵ����� �����ȴ�. (�⺻������: �Ű������� ���� ������)
		System.out.println(o1.color); 
		System.out.println(o1.size);
		System.out.println(o1.sweet);

		Grape g1 = new Grape(30);
		for (int i=0; i<31;++i) {
			g1.eat();
		}
		//String str = new String("a");
		//new�� �Բ� �����ڸ� ȣ���ϸ� Ŭ������ ���ǵȴ�� �ν��Ͻ��� �����ȴ�.
		//�����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ� ��ȯ�ȴ�.
	}
}

class Orange {

	int sweet;
	int size;
	String color;

	public Orange() {
		sweet = 10;
		size = 5;
		color = "orange";
	}

	public Orange(int sweet, int size, String color) {	
		//�����ε�: �ϳ��� Ŭ������ �پ��� ������ �����ڸ� ������ ���� �� �ִ�.
		//this : Ŭ���� ���ο��� ���� �ν��Ͻ��� ������ �� ����ϴ� Ű����
		//�ʵ尪�� ������������ ��ġ�� ��� this�� �̿��� ����� �������� ��Ȯ�ϰ� ����
		//this�� ���� ���� �ν��Ͻ� ������ �ȴ�.
		this.sweet = sweet;
		this.size = size;
		this.color = color;
	}
}

class Grape {

	int podo;
	int skin;

	public Grape(int podo) { //���ǵ� �����ڰ� �ִٸ� �⺻ �����ڰ� �ڵ����� �������� �ʴ´�.
		this.podo = podo;
		this.skin = 0;
	}

	public Grape() {//�ڵ����� �������� �����Ƿ�, �⺻ �����ڸ� ����ϰ� �ʹٸ� ���� �����ؾ� �Ѵ�.
		this(20); //�����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�.
		//�����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�.
		//�ٸ� �����ڴ� �ݵ�� ������ �� ���ٿ��� ȣ���ؾ� �Ѵ�.
	}

	public void eat() {
		if(podo==0) {
			System.out.println("no grapes left");
			return;
		}
		podo--;
		skin++;
		System.out.println(podo + " grapes, " + skin + " skin(s) left");
	}
}




