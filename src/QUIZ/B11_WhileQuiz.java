package QUIZ;

public class B11_WhileQuiz {

	public static void main(String[] args) {
		
		//1.
		int i = 0;
		int sum = 0;
		while(i < 100) {
			if (++i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ��� ����: " + sum + "\n");
		
		//2.
		i = 0;
		while(i < 200) {
			System.out.println(++i);
		}
		System.out.println();

		//3.
		i = 0;
		sum = 0;
		while(i < 200) {
			if (++i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println("2�� ���, 3�� ����� �ƴ� �� ����: " + sum);
	}
}

