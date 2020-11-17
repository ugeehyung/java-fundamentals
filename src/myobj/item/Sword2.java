package myobj.item;

public class Sword2 {

	int attack;
	int grade;
	int upgrade_price; //업그레이드 가격
	int[] upgrade_table; //강화 성공 확률 테이블
	double[] amp_table; //레벨별 공격력 증가량 테이블
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

	//※인스턴스 메서드를 만들 때에는 static을 빼야 한다.
	//static 메서드는 인스턴스 변수를 활용할 수 없다.

	public boolean upgrade_weapon() {

		int ran = (int)(Math.random()*100 +1);
		if (ran <= upgrade_table[grade]) {
			grade += 1;
			System.out.println("강화에 성공하였습니다");
			return true;
			
		} else { 
			//강화실패 
			if (grade>=10) {
				ran = (int)(Math.random()*2);
				if (ran == 0) {
					System.err.println("무기가 파괴되었습니다.");
					destroyed = true;
				} else {
					System.err.println("강화단계가 하락하였습니다.");
					grade-=1;
				}
			}
			return false;
		}
	}
	
	public int damage() {//현재 무기의 데미지를 계산하여 반환
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
		System.out.println("시도횟수: " + count);

	}

}
