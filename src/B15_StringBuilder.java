
public class B15_StringBuilder {

	public static void main(String[] args) {
		
		//StringBuilder�� +=��� append()�Լ��� ���� ���ڿ��� �����.
		//String str = "hello";
		//str += ", world";

		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		//�� ����� �� �ڿ��� String���� ��ȯ�ؼ� ����ϸ� �ȴ�.
		String build = str.toString();
		System.out.println(build);

		StringBuilder[] builders = new StringBuilder[10];
		builders[1] = new StringBuilder();
		builders[2].append(str.charAt(0));
		
	}

}
