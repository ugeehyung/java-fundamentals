
//import : �ٸ� ��Ű���� �ִ� Ŭ������ ����ϱ� ���ؼ��� �ش� Ŭ������ import�ؾ��Ѵ�.
//�شٸ� ��Ű������ �̸� ������ �ҽ��� �����ͼ� ����� �� �ִ�.
//�ذ��� ��Ű���� �̸� ������ �ҽ��� import���� �ʾƵ� �� �� �ִ�.

import java.util.Scanner;
//import QUIZ.A01_PrintQuiz;

public class B01_Scanner {

		//java.util.scanner Ŭ����
		//���α׷� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� ���ִ� Ŭ����
		//��𿡼� �Է��� ������ �����ϰ� �پ��� ������� �Է¹��� �� �ִ�.
		//�ַܼκ��� �Է��� ���� ������ System.in�� �̿��Ѵ�.
		
	public static void main(String[] args) {
		
		//A01_PrintQuiz.main(null);
		//A00_Hello.main(null);
		//A01_Escape.main(null);
		
		//���ο� ��ĳ�ʸ� ������ �� ����sc�� ������ ��ĳ�ʸ� ��Ƴ��´�.
		//���ο� ��ĳ�ʸ� ������ �� ��𿡼� �Է¹��� ���� ������ �� �ִ�.
		//System.out: �ַܼ� ����ϴ� ���
		//System.in: �ֿܼ��� �Է¹޴� ���
		Scanner sc = new Scanner(System.in);
		
		//next()
		//��ο� �����ϴ� ���� ���� �ϳ��� ������.
		//Ÿ���� �ٲ��� �ʴ´�. (String)
		//��ο� �ƹ� ���� ���ٸ� �Է��� �� ������ ��ٸ���.
		
		
		//nextInt()
		//��ο� �����ϴ� ���� ���� �ϳ��� ���� �� �ش� Ÿ������ ��ȯ�Ѵ�.
		//��ο� �ƹ� ���� ���ٸ� �Է��� �ɶ����� ��ٸ���.
		//��ο� �����ϴ� ���� ���� int�� �� �� ���ٸ� ������ �߻��Ѵ�.
		
		
		//nextLine()
		//��ο� �����ϴ� ���� �� �� ���� �����´�.
		//�� ���� �����ϴ� ������ '\n'�̴�.
		
		System.out.print("�ƹ� ���̳� �Է��غ����� > ");
		int num = sc.nextInt();
		System.out.println("�Է¹��� ��: " + num);
		
		System.out.println(num + 10);
		System.out.println(num - 10);
		System.out.println(num * 10);
		System.out.println(num / 10);
		System.out.println(Math.pow(num, 2));
		
		System.out.println();
		int num2 = sc.nextInt();
		System.out.println("�ι� ° ��: " + num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
