package myobj.item;

public class Sword {

	//�ʵ�
	//���ݷ�
	//���� ��ȭ���
	//������ ��ȭȮ�� (��޸��� ��ȭ Ȯ���� �ٸ�)
	//������ ���ݷ� ������

	//�޼���
	//��ȭ�ϱ�(�������� ���� ���� ���а� �����)
	//���ִ� ��ȭ �������� �����ϱ���� �ɸ� ��ȭ Ƚ���� ����غ���
	//���� (��󿡰� ���ݷ¸�ŭ�� �������� ����)
	//�ذ����� ����� �Ǵ� ��ü�� HP�� �־�� �Ѵ�

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













