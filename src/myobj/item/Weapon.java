package myobj.item;

public class Weapon {
	int attack;
	
	// �⺻ ������ ���
	public Weapon(int attack) {
		this.attack = attack;
	}
	
	public int damage() {
		return attack;
	}
}
