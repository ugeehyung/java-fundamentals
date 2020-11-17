import java.util.Arrays;

public class B13_Array {

	public static void main(String[] args) {

		//배열: 같은 타입의 변수를 한번에 여러개 선언하는 방법

		//인덱스를 활용해 해당 번째의 값에 접근할 수 있다. 반복문과 활용하면 매우 편함.
		//한번 크기가 정해지면 크기를 변경할 수 없다.
		//초기화가 자동으로 되어있다. 정수:0, 실수:0.0, boolean:false, 참조형:null

		int[] a = new int[100]; //변수 100개를 쉽게 만드는 방법 : 0부터 99까지
		//            ※인덱스 개수!!!!!!!!! 인덱스 아님!!!!!!!!!!!!!!
		//a[인덱스] : 각각 4byte 총 400byte
		a[0] = 10; //int만 가능하다.
		a[1] = 55;
		a[99] = 999;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[99]);
		System.out.println(a[15]); //0이 이미 들어가있음.

		String[] fruits = new String[10];
		System.out.println(fruits[3]); //아직 값이 없음. null

		//배열 선언

		//1. 타입[] 배열이름 = new 타입[배열크기];
		//2. 타입[] 배열이름 = {값1, 값2, ...};
		String[] colors = {"red", "blue", "pink"};
		System.out.println(colors[2]);
		//3. 타입[] 배열이름 = new 타입[] {값1, 값2, 값3, ...};
		double[] scores = new double[] {7.7, 6.6, 5.5, 4.4, 3, 'A', 123.123f, 300000000L};
		System.out.println(scores[7]);
		System.out.println(scores[5]);
		boolean[] test = new boolean[] { true, false, true, false};
		System.out.println(test[3]);

		//Arrays.toString(arr) : 전달받은 배열를 보기좋게 문자열로 변환한다.
		System.out.println(Arrays.toString(colors));
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(test));

		//배열과 반복문
		System.out.println("colors 배열 크기: " + colors.length);
		for (int index = 0; index < colors.length; ++index) {
			System.out.printf("%d번째 색깔: %s\n", index, colors[index]);
		}

		//String을 char형 배열로 변환하기
		String msg = "hello, world!";

		char[] msgArr = msg.toCharArray();
		for(int i=0; i<msgArr.length; ++i) {
			System.out.print(msgArr[i]);
		}
	}
}
