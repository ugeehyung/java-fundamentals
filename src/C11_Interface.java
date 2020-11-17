import myobj.animal.Animal;

public class C11_Interface {

	//�������̽�(interface) : abstract class�� ���������� ������ ��ӹ��� �� �ִ� ��
	//�߻��� ���� Ŭ������ ������ �ο��ϰ� ������ �̹� ��ӹ��� Ŭ������ �ִ� ��� �������̽��� ����Ѵ�.
	//��ĳ������ �����ϴ�. 

	public static void swimContest(Swimmer s) {
		s.swim();
		s.kick();
		s.front();
	}

	public static void main(String[] args) {
		swimContest(new Bear());
		swimContest(new Swimmer() {
			public void swim() {
				System.out.println("�͸��� ��������");
			}
			public void kick() {
				System.out.println("�͸��� ���ͼ��� ������");
			}
		});
	}
}

interface Swimmer {

	double water_regist = 123;	//�������̽��� ������ �ڵ����� 'final static'�� �ȴ�.
	void swim(); //�������̽��� �޼���� �ڵ����� 'abstract public' �޼��尡 �ȴ�.

	default void kick() {  	//�������̽��� default : �������̵� �� ���� ������, ���ϸ� �⺻������ ���
		System.out.println("������");
	}
	default void front() {
		System.out.println("������");
	}

	static long startTime() {
		return System.currentTimeMillis();
	}
	static long endTime() {
		return System.currentTimeMillis();
	}
}

interface CookFish {
	void cookfish();
}

interface BoatDriving {
	void driveboat();
	
}
interface Fishing extends BoatDriving{ //�������̽������� ����� ���� �� �ְ�, ������ ���� �� �ִ�.
	void fish();
}

class Bear extends Animal implements Swimmer, Fishing { //Bear�� Swim, Fish ����. Animal�� �ƴ�.
	@Override
	public void swim() {
		System.out.println("�� ����");
	}
	@Override
	public void fish() {
		System.out.println("�� ����");
	}
	@Override
	public void driveboat() {
		
	}
}