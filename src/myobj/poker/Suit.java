package myobj.poker;

public enum Suit {

	//name과 order는 기본으로 설정된다.
	//상수를 추가하고 싶다면 생성자를 이용해야 한다.

	SPADE(3, "스페이드", '♠'), //order 0 suitValue 3
	DIAMOND(2, "다이아몬드", '◆'), //order 1 suitValue 2
	HEART(1, "하트", '♥'), //order 2 suitValue 1
	CLUB(0, "클로버", '♣'); //order3 suitValue 0
	
	public static final int NUM_OF_SUIT = 4;

	private int suitValue;
	private String korName;
	private char suitPic;

	//enum 타입 객체는 생성자가 반드시 private이다.
	private Suit(int suitValue, String korName, char suitPic) {
		this.suitValue = suitValue;
		this.korName = korName;
		this.suitPic = suitPic;
	}

	//Ctrl + Space로 get만 치면 자동생성
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
