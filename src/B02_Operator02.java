
public class B02_Operator02 {

	public static void main(String[] args) {
	
		//#�񱳿���
		//�� ������ ����� �� �Ǵ� �����̴�. (Boolean Ÿ��)
		//��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�.
		//a + (b > 10)
		
		int a = 7, b = 9;
		
		System.out.println("a>b: " + (a>b));
		System.out.println("a<b: " + (a<b));
		System.out.println("a=b: " + (a>=b));
		System.out.println("a<=b: " + (a<=b));
		
		System.out.println("a==b: " + (a==b));
		System.out.println("a!=b: " + (a!=b));
		
		//#������
		//Boolean Ÿ�԰� �ΰ��� �ϴ� ����
		//&&: �� ���� ��� true�϶� true (and)
		//||: �� �� �� �ϳ��� true���� true (or)
		//!: true�� false, false�� true (not)
		
		System.out.println("#### AND ####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("#### OR ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("#### NOT ####");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(a>10));
		System.out.println(!(b<10));
		
	}

}
