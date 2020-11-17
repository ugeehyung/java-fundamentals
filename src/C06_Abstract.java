import java.util.Scanner;

import crypto.CaesarCipher;
import crypto.Cipher;

public class C06_Abstract {

	//추상클래스 : 클래스 내부에 추상메서드를 지닌 클래스
	//추상메서드 : 함수의 형태만 정해놓고 자식 클래스에서 오버라이드를 구현하게 만든다.

	abstract public class AbstractTest {

		abstract public String fruit(int num);
		abstract public int price(int num);
		abstract public int basket(int fruit_num);	
		abstract public int whole_price(int fruit_num);
		abstract public String whole_result(String fruit, int fruit_num, int basket, int whole_price);
	}

	public static void main(String[] args) {

		AbstractTest at = null;
		
		Scanner int_sc = new Scanner(System.in);
		Scanner str_sc = new Scanner(System.in);
		System.out.println("1.사과\n2.오렌지\n3.망고\n4.배\n5.복숭아");
		System.out.print("구매할 과일에 해당하는 번호를 입력하세요 >> ");
		int num = int_sc.nextInt();
		String fruit = at.fruit(num);
		System.out.println(fruit+"를 선택하셨습니다.");
		System.out.println("구매할 과일의 개수를 입력하세요 >> ");
		int fruit_num = int_sc.nextInt();
		int basket = at.basket(fruit_num);
		int whole_price = at.whole_price(fruit_num);

		String result = at.whole_result(fruit, fruit_num, basket, whole_price);
		System.out.println(result);

	}

}
