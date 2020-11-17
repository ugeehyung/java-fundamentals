
public class C06_AbstractExtend extends C06_Abstract {

	int num;
	int price;
	int fruit_num;
	int basket = 10;

	public int price(int num) {
	
		switch(num) {
		case 1: price = 5000; return 5000;
		case 2: price = 8000; return 8000;
		case 3: price = 4000; return 4000;
		case 4: price = 6000; return 6000;
		case 5: price = 7000; return 7000;
		}return 0;
	}

	public String fruit(int num) {
		
		switch(num) {
		case 1: return "사과";
		case 2: return "오렌지";
		case 3: return "망고";
		case 4: return "배";
		case 5: return "복숭아";
		}return null;
	}

	public int basket(int fruit_num) {
		int result;
		if ( fruit_num > 0 && fruit_num <= basket) {
			result = 1;
		} else if (fruit_num % basket == 0) {
			result = fruit_num/basket;
		} else if (fruit_num % basket >0) {
			result = fruit_num/basket +1;
		} else {
			result = 0;
		} return result;
	}

	public int whole_price(int fruit_num) {
		int result;
		result = fruit_num * price + basket(fruit_num) * 100;
		return result;
	}
	
	public String whole_result(String fruit, int fruit_num, int basket, int whole_price) {
		
		System.out.printf("%s %d개를 장바구니에 담으셨습니다.\n필요한 바구니는 %d개이고, 총 가격은 %d원입니다.",
				fruit, fruit_num, basket, whole_price);
		return null;
	}
	
	public static void main(String[] args) {
		
		C06_AbstractExtend ae = new C06_AbstractExtend();
		String fruit = ae.fruit(5);
		int price = ae.price(5);
		int whole_price = ae.whole_price(20);
		int basket = ae.basket(20);
		
		ae.whole_result(fruit, 20, basket, whole_price);
		
	}
}
