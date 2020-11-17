import java.util.Random;

public class B12_Random {

	public static void main(String[] args) {

		//Java에서 무작위 숫자 생성하기

		//1. Math.random() : double 타입의 0 <= x < 1 인 랜덤 소수를 생성한다.
		//이 소수를 이용하여 원하는 숫자를 만들어서 사용할 수 있다.

		//원하는 숫자를 만드는 절차 (ex. 80~100)
		//(1) 원하는 숫자의 "개수"를 곱한다(*)
		//	0 * 21 <= x <= 1 * 21
		//(2) 원하는 숫자 중 "가장 작은 숫자"를 더한다(+)
		//	0 + 80 <= x <= 21 + 80
		//(3) 소수점 아래를 삭제한다(int)

		//for (int i = 0; i < 100; ++i) {
		//	System.out.println(i + ". " + (int)(Math.random()*21 + 80));
		//}
		
		// 2. Random 클래스
		// 생성할 때 원하는 시드번호를 선택할 수 있다.
		// 같은 시드번호로 생성하면 같은 값이 나온다.
		// 시드번호를 전달하지 않으면 무작위로 시드가 선택된다.
		// 새로운 랜덤 시드 생성
		Random ran2 = new Random();
		Random ran30 = new Random();
		Random ran80 = new Random();
		
		//Random.nextInt(bound) : 원하는 범위의 정수를 반환한다.
		//0~bound 미만의 정수를 반환한다.
		//bound를 전달하지 않으면 int 범위에서 랜덤 정수가 선택된다.
		ran30.nextInt(30); // 0~29
		ran2.nextInt(2); // 0~1
		
		System.out.println("ran30 : " + ran30.nextInt(30));
		System.out.println("ran2: " + ran2.nextInt(2));
		System.out.println("ran80: " + ran80.nextInt(21)+80);//80~100
		
		//QUIZ: 3000이상 5000이하 랜덤 정수를 100번 뽑고 그동안 나왔던 가장 큰 수와 가장 작은 수를 출력하세요.
		int max = 3000;
		int min = 5000;		

		for (int i = 0; i < 100; ++i) {
			int n = (int)(Math.random()*2001 + 3000);
			System.out.println(n);
			if (max < n) {
				max = n;
			}//max = Math.max(max,n);
			if (min > n) {
				min = n;
			}//min = Math.min(min,n);
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
