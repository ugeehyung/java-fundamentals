import java.util.EmptyStackException;

public class C13_Throws {

	//throws: ���� �޼��忡�� �߻��ϴ� ���� ó���� �޼��� ȣ���� ������ �̷��.
	//�޼��� �ڿ� �߻��� ������ �ִ� ���ܸ� �Բ� �����Ѵ�.
	
	//throw: ���ϴ� ���ܸ� �߻���Ų��. 
	
	//exception Ŭ������ ��ӹ��� ��ü�� "�ݵ�� ó���ؾ� �ϴ� ���� ��ü"�� �ȴ�.
	//RuntimException�� ��ӹ��� ��ü�� "�ݵ�� ó������ �ʾƵ� �Ǵ� ���� ��ü"�� �ȴ�.
	

	public static void stupid_method() throws ArrayIndexOutOfBoundsException {
		
		throw new ArrayIndexOutOfBoundsException("�׳ɹ߻�"); 
		
	}
		
	public static void main(String[] args) {

		int a = 1;
		if (a == 2) {
			throw new ArithmeticException();
		} else if (a == 3) {
			throw new EmptyStackException();
		}
		
		stupid_method();
		System.out.println();
	}
}