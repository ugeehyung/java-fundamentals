package QUIZ;

public class B02_ConditionQuiz {

	public static void main(String[] args) {

		int a = 11;
		int b = 2;
		int c = 7;
		int hour = 150;
		int d = 60;
		int e = 30;
		int year = 40;
		int min_age = 12;
		int chul_age = 10;
		int min_birth_month = 10;
		int chul_birth_month = 7;
		boolean powerOn = false;

		String str = "yes";
		String str2 = new String ("yes");

		int A1 = 3;
		int A2 = 5;
		int A3 = 4;

		System.out.println(a>10 && a<20); //������ ���ʿ�
		System.out.println(b%2 == 0);
		System.out.println(c%7 == 0);
		System.out.println((!(hour<0 || hour>=24)) && hour>=12);
		System.out.println(Math.abs(d-e) == 30);
		System.out.println(year%400 == 0 || year%4 == 0 && year%100 != 0);
		System.out.println(min_age == chul_age + 2);
		System.out.println(min_birth_month == chul_birth_month + 3);
		System.out.println(powerOn == false);

		//�ҹ��ڷ� �����ϴ� Ÿ���� ���� �����ϰ� �빮�ڷ� �����ϴ� Ÿ���� �ּҸ� ����(������)�Ѵ�.
		System.out.println(str == "yes"); //�ּҸ� ���� ��
		System.out.println(str == str2); 
		System.out.println(str.equals(str2)); //���� ���� ��
		System.out.println(str.equals("yes"));

		System.out.println((Math.pow(A1, 2) + 
				Math.pow(A2, 2) == Math.pow(A3, 2))||
				(Math.pow(A2, 2) + Math.pow(A3, 2) == Math.pow(A1, 2))||
				(Math.pow(A1, 2) + Math.pow(A3, 2) == Math.pow(A2, 2)));

	}
}
