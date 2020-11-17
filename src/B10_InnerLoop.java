
public class B10_InnerLoop {

	public static void main(String[] args) {
		
		//반복문 내부에 반복문 
		
		for (int i = 0; i<10; ++i) {
			System.out.printf( "==================바깥쪽 %d\n", i);
			for (int j = 0; j<5; ++j) {
				System.out.printf("-----------안쪽 %d-%d\n", i, j);
					for (int k = 0; k<2; ++k) {
					System.out.printf("+++++안안쪽 %d-%d-%d\n", i, j, k);
				}
			}
		}

		//다중 반복문으로 구구단 출력하기
		//2단부터 9단까지 :밖 반복문(2~9)
		//각 단마다 1부터 9까지 :안 반복문(1~9)
		
		for (int goo = 2; goo <=9; ++goo) {
			System.out.printf("%d단:\n", goo);
			System.out.println();
			for (int dan = 1; dan <=9; ++dan) {
				System.out.printf("%d X %d = %d\n", goo, dan, goo*dan);
			}
			System.out.println();
		}
	}

}
