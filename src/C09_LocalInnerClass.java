
public class C09_LocalInnerClass {

	void method() {
		
		class Apple{ //���� ���� Ŭ����: �޼��� ���ο��� Ŭ���� ���. �޼����� ������ ��� �� ����.
			int size;
			String color;
		}
		Apple a = new Apple();
		System.out.println(a.size);
		System.out.println(a.color);
	}
	
	public static void main(String[] args) {
		
		String a = "�뱸";
		String b = "������";
		
		class Apple { //���� ���� Ŭ���� : �޼��尡 ������ Ŭ������ ������� �ȴ�.
			String addr;
			String color;
			
			public Apple() {
				addr = a;
				color = b;
			}
		}
		
		Apple apple = new Apple();
		System.out.println(apple.addr);
		System.out.println(apple.color);
		
	}
}
