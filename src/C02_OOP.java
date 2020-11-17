import java.util.Scanner;

//��ü ���� ���α׷��� (OOP: Object Oriented Programming) = ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� ���
//��ü(object):���� �����ϴ� ��� ���� (�繰, ����, �˰��� ��)
//������ �Լ��� ���к��ϰ� ����ϱ⺸�ٴ� ���ǿ� �����ϴ� ��üó�� ���̵��� �Ͽ� �������� �ø���.

//Ŭ����(Class) : ��ü�� ���α׷��� ���� ǥ���� ��
//��ü�� ���赵�̴� (���� ���������� ��ü�� ����)
//Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���.
//Ŭ������ ������ ���� Ÿ���̴�. ===> ���� ��� Ŭ������ ����ٸ� ��� 'Ÿ��'�� ����� �� �ְ� �ȴ�!

class Apple { 

	int size; //�ν��Ͻ� ���� (=�ʵ�, �������, ����...) : ��� �ν��Ͻ����� ���� �ٸ� ���� ������ �ִ� ����
	int sweet;
	int calorie;
	int damage;
	String color;
	String eatday;

	void eat() { //�ν��Ͻ� �޼��� (= ���) : �ν��Ͻ� ������ Ȱ���ϴ� �޼���

		System.out.println("����� �Ծ����ϴ�.");
		System.out.println(this.sweet + "��ŭ ����� ���������ϴ�.");
		this.size -= 1;
		this.calorie -= 10;
		System.out.printf("ũ�� : %d  Į�θ�: %d\n\n", this.size, this.calorie);

	}

}

public class C02_OOP {

	public static void main(String[] args) {

		Apple ap = new Apple(); //Apple ���赵(Ŭ����)�� ��ü�� ����� �� ��ü �ּҸ� ���� ap�� ����
		Apple ap1 = new Apple();
		Apple ap2 = new Apple();
		Apple ap3 = new Apple();
		
		Apple[] applebox = new Apple[10]; //10ĭ¥�� �迭����
		for(int i=0; i<10;++i) {
			applebox[i] = new Apple();
		} //�迭 �ȿ� apple()�� ��

		ap.eatday = "2020/10/29";
		ap.size = 10;
		ap.calorie = ap.size * 10;
		ap.color = "red";

		ap.sweet = 7;
		ap1.sweet = 8;
		ap2.sweet = 9;
		ap3.sweet = 10;

		ap.eat();
		ap1.eat();
		ap2.eat();
		ap3.eat();

	}
}

