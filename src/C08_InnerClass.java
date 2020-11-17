
public class C08_InnerClass {

	//Ŭ���� ���ο� Ŭ���� ����ϱ�
	public static void main(String[] args) {

		AppleBox box = new AppleBox(20);
		System.out.println(box.box[0].color);

		//�ܺο��� �ٸ� Ŭ������ ���� Ŭ���� ����ϱ� (���� ����)
		AppleBox.Apple apple01 = new AppleBox(10).new Apple();
		System.out.println(apple01.color);
		System.out.println(apple01.size);
	}
}

//outer class
//: ���� �����ڿ� 'default' �� 'public'�� ����� �� �ִ�. 'private'�� ����.
class AppleBox {

	Apple[] box;
	private boolean mutation;

	public AppleBox(int size) {
		box = new Apple[size];
		for (int i=0; i<box.length;++i) {
			box[i] = this.new Apple();//���� Ŭ���� ������ �ڿ��̱� ������ this�� �����ϰ� ����� �� �ִ�.
		}
	}

	//inner class
	//AppleBox�� �ν��Ͻ��� ����� ������ inner class Apple�� �������� �ʴ´�.
	//���������ڸ� �����Ӱ� ��� ���� (default, public, private)
	class Apple { 
		String color;
		int size;

		public Apple() {
			if(mutation) {
				color = "purple";
			} else {
				color = "red";
			}
		}










	}
}