import java.util.Arrays;

public class C01_Function {

	//함수(function)
	//기능을 미리 정의해두고 나중에 가져다 쓰는 것
	//함수 이름 뒤에 ()를 붙여서 함수를 호출하면 함수의 실행 결과가 반환된다.
	//재사용할 가능성이 있는 기능을 미리 만들어 작업의 반복을 줄인다.
	//EX:
	
	
	//사과 담을 필요한 바구니 개수
	public static int appleBasket(int appleNum, int basketSize) {
		int result;
		if (appleNum % basketSize == 0) {
			result = appleNum / basketSize;
		}else {
			result = appleNum / basketSize +1;
		}
		return result;
	}
	
	
	//가장 싼 가격
	public static int cheapPrice(int[] prices) {
		int min =0;
		for (int i=0; i<prices.length; ++i) {
			if (i == 0) {
				min = prices[i];
			}else {
				min = Math.min(min, prices[i]);
			}
		}
		return min;
	}
	
	
	//평균가격
	public static double avgPrice(int[] prices) {
		int sum=0;
		for (int i=0; i<prices.length; ++i) {
			sum+= prices[i];
		}
		return sum/ (double) prices.length;
	}
	
	
	//10000원 가격 증가
	public static void raisePrice(int[] prices) { //void: return없음
		for(int i=0; i<prices.length; ++i) {
			prices[i] += 10000;
		}
	}
	
	
	public static void main(String[] args) {

		int count = appleBasket(25,10);
		System.out.println("바구니 개수: " + count);
		
		count = appleBasket(33,8);
		System.out.println("바구니 개수2: " + count);
		
		int[] apples = {1000, 2000, 989, 1100, 990};
		System.out.println("cheap price: " + cheapPrice(apples));
		System.out.println("avg price: " + avgPrice(apples));

		raisePrice(apples);
		System.out.println("가격+10000: " +Arrays.toString(apples));
		
			
	}
}