package myobj.fruit;

public class Apple {

	int calorie;
	String color;

	public Apple(String color) {
		
		calorie = 300;
		if(!color.equals("red")) {
			throw new InvalidColorException();
		}
	}
	
	public Apple eat() throws NoMoreCalorieException {
		
		if (calorie <= 0) {
			throw new NoMoreCalorieException();
		} 
		System.out.println("�߸Ծ����ϴ�");
		calorie -= 100;
		return this;
	}
}