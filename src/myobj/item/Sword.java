package myobj.item;

public class Sword {

	//필드
	//공격력
	//현재 강화등급
	//레벨별 강화확률 (등급마다 강화 확률이 다름)
	//레벨별 공격력 증가폭

	//메서드
	//강화하기(성공률에 따라 성공 실패가 적용됨)
	//※최대 강화 레벨까지 도달하기까지 걸린 강화 횟수를 출력해보기
	//공격 (대상에게 공격력만큼의 데미지를 입힘)
	//※공격의 대상이 되는 객체는 HP가 있어야 한다

	public static int power = 100;
	public static int level = 2;
	int lev_probability;
	int max_level;

	void up(int num) {
		for (int i=0; i<num; ++i) {
			power += lev_upgrade(level);
		}
		System.out.print("upgrade " + num + ">> ");
		System.out.print("power: " + power);
		System.out.print(" (level: " + level(power) +")\n");
	}
	
	void attack(int attack) {
		
		System.out.print("attack " + attack + ">> ");
		power -= 10;
		System.out.print("power: " + power);
		System.out.println(" (level: " + level(power)+")");
	}

	public static int lev_power(int level) {

		int result;
		result = level *100;
		return result;
	}

	public static int lev_upgrade(int level) {

		int result;
		result = level * 10;
		return result;
	}

	public static int level(int power) {

		int level = 0;
		for (int i=100; i<10000; ++i) {
			if(power % i == 0) {
				i+=100;
				++level;
				break;
			} 
		} 
		int result = level;
		return result;
	}
	
	public static int probability(int level) {
		
		int result;
		result = level*5;
		return result;
	}

	public static void main(String[] args) {

		Sword strength = new Sword();

		strength.up(1); 
		strength.up(2);	
		strength.attack(1);
		strength.attack(5);
		strength.up(10);	
	}
}













