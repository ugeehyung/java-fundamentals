package myobj.poker;

public enum Suit {

	//name�� order�� �⺻���� �����ȴ�.
	//����� �߰��ϰ� �ʹٸ� �����ڸ� �̿��ؾ� �Ѵ�.

	SPADE(3, "�����̵�", '��'), //order 0 suitValue 3
	DIAMOND(2, "���̾Ƹ��", '��'), //order 1 suitValue 2
	HEART(1, "��Ʈ", '��'), //order 2 suitValue 1
	CLUB(0, "Ŭ�ι�", '��'); //order3 suitValue 0
	
	public static final int NUM_OF_SUIT = 4;

	private int suitValue;
	private String korName;
	private char suitPic;

	//enum Ÿ�� ��ü�� �����ڰ� �ݵ�� private�̴�.
	private Suit(int suitValue, String korName, char suitPic) {
		this.suitValue = suitValue;
		this.korName = korName;
		this.suitPic = suitPic;
	}

	//Ctrl + Space�� get�� ġ�� �ڵ�����
	public int getSuitValue() {
		return suitValue;
	}

	public String getKorName() {
		return korName;
	}
	public char getSuitPic() {
		return suitPic;
	}

}
