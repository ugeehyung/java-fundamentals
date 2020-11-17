package myobj.item;

public class Sword2 {

	int attack;
	int grade;
	int upgrade_price; //���׷��̵� ����
	int[] upgrade_table; //��ȭ ���� Ȯ�� ���̺�
	double[] amp_table; //������ ���ݷ� ������ ���̺�
	boolean destroyed;

	final int MAX_GRADE; 

	public Sword2(int attack) {

		this.attack = attack;
		this.upgrade_price = attack * 500;
		this.grade = 0;
		this.destroyed = true;
		this.upgrade_table = new int[] {100, 90, 90, 70, 60, 30, 20, 10, 5, 3, 2, 1};
		this.amp_table = new double[] {1.0, 1.02, 1.1, 1.15, 1.2, 1.25, 1.5, 2.0, 3, 4, 5, 6};

		MAX_GRADE = upgrade_table.length;
	}

	public Sword2() {
		this(10);
	}

	//���ν��Ͻ� �޼��带 ���� ������ static�� ���� �Ѵ�.
	//static �޼���� �ν��Ͻ� ������ Ȱ���� �� ����.

	public boolean upgrade_weapon() {

		int ran = (int)(Math.random()*100 +1);
		if (ran <= upgrade_table[grade]) {
			grade += 1;
			System.out.println("��ȭ�� �����Ͽ����ϴ�");
			return true;
			
		} else { 
			//��ȭ���� 
			if (grade>=10) {
				ran = (int)(Math.random()*2);
				if (ran == 0) {
					System.err.println("���Ⱑ �ı��Ǿ����ϴ�.");
					destroyed = true;
				} else {
					System.err.println("��ȭ�ܰ谡 �϶��Ͽ����ϴ�.");
					grade-=1;
				}
			}
			return false;
		}
	}
	
	public int damage() {//���� ������ �������� ����Ͽ� ��ȯ
		return (int)(Math.ceil(attack * amp_table[grade]));

	}

	public static void main(String[] args) {
		
		Sword2 basic_sword = new Sword2(); 
		System.out.println(basic_sword.attack);
		System.out.println(basic_sword.upgrade_price);

		int count = 0;
		while(basic_sword.grade != basic_sword.MAX_GRADE) {
			basic_sword.upgrade_weapon();
			count += 1;

			if (basic_sword.destroyed) {
				basic_sword = new Sword2();
				break;
			}

		}
		System.out.println("�õ�Ƚ��: " + count);

	}

}
