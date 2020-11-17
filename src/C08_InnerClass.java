
public class C08_InnerClass {

	//클래스 내부에 클래스 사용하기
	public static void main(String[] args) {

		AppleBox box = new AppleBox(20);
		System.out.println(box.box[0].color);

		//외부에서 다른 클래스의 내부 클래스 사용하기 (거의 안함)
		AppleBox.Apple apple01 = new AppleBox(10).new Apple();
		System.out.println(apple01.color);
		System.out.println(apple01.size);
	}
}

//outer class
//: 접근 제어자에 'default' 와 'public'만 사용할 수 있다. 'private'은 못씀.
class AppleBox {

	Apple[] box;
	private boolean mutation;

	public AppleBox(int size) {
		box = new Apple[size];
		for (int i=0; i<box.length;++i) {
			box[i] = this.new Apple();//같은 클래스 내부의 자원이기 때문에 this를 생략하고 사용할 수 있다.
		}
	}

	//inner class
	//AppleBox의 인스턴스가 생기기 전에는 inner class Apple이 존재하지 않는다.
	//접근제어자를 자유롭게 사용 가능 (default, public, private)
	class Apple { 
		String color;
		int size;

		public Apple() {
			if(mutation) {
				color = "purple";
			} else {
				color = "red";
			}
		}










	}
}