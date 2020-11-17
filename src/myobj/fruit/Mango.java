package myobj.fruit;

import java.util.Random;


public class Mango implements Comparable<Mango>{

	public int calorie;
	public int sweet;
	public int id;

	public static int mango_id =0;
	
	//비교 대상 망고를 생성하는 생성자
	public Mango(int calorie, int sweet, int id) {
		this.calorie = calorie;
		this.sweet = sweet;
		this.id = id;
	}
	
	public Mango() {

		Random ran = new Random();
		calorie = ran.nextInt(1000)+1;
		sweet = ran.nextInt(1000)+1;

		id = mango_id++;//해당 인스턴스를 유일하게 구분
		System.out.printf("%d번 망고가 생성되었습니다.\n", id);
	}

	public String toString() {
		return String.format("id: %06d cal: %d sweet: %d\n", id, calorie, sweet);
		
	}
	
	public int hashCode() { //:이 객체를 유일하게 구분하려면 어떻게? 에 대한 답. 인스턴스의 주소를 해시화
		return id; 
	}
	
	public int compareTo(Mango o) {

		int calorie_result = this.calorie - o.calorie;		
		return calorie_result == 0 ? this.sweet - o.sweet : this.calorie - o.calorie;

	}

}