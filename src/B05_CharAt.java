import java.util.Scanner;

public class B05_CharAt {

	public static void main(String[] args) {
		
		//"���ڿ�".charAt(index)
		//���ڿ����� ���ϴ� ��°�� ���ڸ� ������ �Լ�
		//�� �Լ��� ���� ����� char Ÿ���̴�. (��ȯ Ÿ���� char Ÿ���̴�.)
		//ù ��° ���ڰ� 0�� �ε����̴�.
		//Math.round() - ��ȯ Ÿ��
		//"���ڿ�".length()
		//���ڿ��� ����ڷ� �̷���� �ִ����� �˷��ش�.
		//��ȯŸ�� int
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ƹ��ų� �Է��غ����� > ");
		String word = sc.next();
		
		System.out.println(word);
		
		char a = word.charAt(0);
		System.out.println(a);

		if (word.length() >= 4)
			System.out.println(word.charAt(3));
		else 
			System.out.println("�ش� ����� ���̰� 4���� ª���ϴ�.");
	
	
	}

}
