package QUIZ;

import java.util.Scanner;

public class B01_GuessAge {

	public static void main(String[] args) {

		//����ڷκ��� ������ �⵵�� �¾ �⵵�� �Է¹����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷�

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �⵵�� �Է��Ͻÿ�: ");
		int this_year = sc.nextInt();

		System.out.print("�¾ �⵵�� �Է��Ͻÿ�: ");
		int birth_year = sc.nextInt();

		System.out.println("�ѱ� ����: " + (this_year - birth_year + 1));

	}

}
