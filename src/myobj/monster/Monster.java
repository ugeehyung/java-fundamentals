package myobj.monster;

import myobj.item.Sword2;
import myobj.item.Weapon;

public class Monster {

	public String name;
	public int hp;

	public Monster() {
		name = "Monster";
		hp = 99999;
	}

	public void attacked(Sword2 sword) {
		int dmg = sword.damage();
		hp -= dmg;
		System.out.printf("%s에게 %d의 데미지>>\n", name, dmg);
		System.out.printf("%s의 남은 체력 : %d\n", name, hp);
	}
	
	
	public void attacked(Weapon weapon) {
		int dmg = weapon.damage();
		hp -= dmg;
		System.out.printf("%s에게 %d의 데미지>>\n", name, dmg);
		System.out.printf("%s의 남은 체력 : %d\n", name, hp);
		
	}
	

	public static void main(String[] args) {

		Sword2 steel_sword = new Sword2(30);

		Monster mon = new Monster();
		mon.attacked(steel_sword);
		//		for(int i=0; i<10; ++i) {
		//			steel_sword.upgrade_weapon();
		//		}
		Hulk hulk = new Hulk();
		hulk.attacked(steel_sword);

		Ironman iron = new Ironman();
		iron.attacked(steel_sword);
	}
}


class Hulk extends Monster {

	public Hulk() {
		this.name = "Hulk";
		hp -= 30;

	}

}
class Ironman extends Monster {


	public Ironman() {
		this.name = "Ironman";
		hp -= 5;
	}


}










