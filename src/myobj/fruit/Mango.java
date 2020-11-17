package myobj.fruit;

import java.util.Random;


public class Mango implements Comparable<Mango>{

	public int calorie;
	public int sweet;
	public int id;

	public static int mango_id =0;
	
	//�� ��� ���� �����ϴ� ������
	public Mango(int calorie, int sweet, int id) {
		this.calorie = calorie;
		this.sweet = sweet;
		this.id = id;
	}
	
	public Mango() {

		Random ran = new Random();
		calorie = ran.nextInt(1000)+1;
		sweet = ran.nextInt(1000)+1;

		id = mango_id++;//�ش� �ν��Ͻ��� �����ϰ� ����
		System.out.printf("%d�� ���� �����Ǿ����ϴ�.\n", id);
	}

	public String toString() {
		return String.format("id: %06d cal: %d sweet: %d\n", id, calorie, sweet);
		
	}
	
	public int hashCode() { //:�� ��ü�� �����ϰ� �����Ϸ��� ���? �� ���� ��. �ν��Ͻ��� �ּҸ� �ؽ�ȭ
		return id; 
	}
	
	public int compareTo(Mango o) {

		int calorie_result = this.calorie - o.calorie;		
		return calorie_result == 0 ? this.sweet - o.sweet : this.calorie - o.calorie;

	}

}