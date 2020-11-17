import java.util.ArrayList;
import java.util.Collections;

public class D01_ArrayList {

	//java collections: 자바에서 기본으로 제공하는 자료구조 인터페이스
	//collections 인터페이스를 구현한 클래스로는 list, set이 있다.

	//array list: 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스
	//배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근할때 가장 유리하다.

	public static void main(String[] args) {

		ArrayList list = new ArrayList(); 

		list.add("홍길동"); //add(item) 메소드: 데이터를 list에 순차적으로 추가한다. ArrayList에 타입을 지정해주지 않으면 모든 타입이 들어간다. 
		list.add("전우치");
		list.add("임꺽정");
		list.add("김두한");
		list.add(300); 		
		list.add(0,"이순신"); //원하는 위치에 데이터를 넣는다. (뒤쪽 데이터 한칸씩 밀림!)

		System.out.println(list);

		System.out.println(list.get(0)); //ArrayList의 get(index) : 배열처럼 인덱스로 데이터를 꺼낸다.
		System.out.println(list.get(1)); //꺼낼 때 어떤 타입으로 꺼낼지 알기 힘들어진다.

		Object thing = list.get(2); //꺼낼 때 object 타입(모든 타입의 부모)으로 꺼냄.
		System.out.println(thing);

		//타입을 지정한 ArrayList 생성하기 (<> = 제네릭)
		ArrayList<String> fruit_list = new ArrayList<>(); //<>로 타입을 지정해주면 ArrayList에 든 메서드 타입이 바뀐다.

		fruit_list.add("apple");
		fruit_list.add("kiwi");

		System.out.println(fruit_list);
		System.out.println(fruit_list.get(0));

		//size() : ArrayList의 크기
		System.out.println(list.size());
		System.out.println(fruit_list.size());

		//remove(index) : 원하는 위치의 아이템을 삭제 + 삭제하는 아이템을 반환
		//remove(item) : 원하는 값 중 맨앞 하나 삭제
		System.out.println("삭제된 아이템: " + list.remove(5));

		for (int i=0, size = list.size(); i<size; ++i) {
			System.out.println(list.get(i));
		}

		fruit_list.add(0,"apple");
		fruit_list.add("apple");
		fruit_list.add("apple");
		fruit_list.add("apple");
		fruit_list.add("apple");
		System.out.println(fruit_list);

		System.out.println("값으로 삭제 후 반환되는 값: " + fruit_list.remove("apple"));
		//fruit_list.remove("apple") = "true"임을 알 수 있다!
		System.out.println(fruit_list);

		int count =0;
		while (fruit_list.remove("apple")) {
			++count;
		}
		System.out.printf("사과가 %d번 삭제되었습니다. 삭제가 모두 끝났습니다.\n", count);


		for(Object fruit : fruit_list) {
			System.out.println("fruit name: " + fruit);
		}

		ArrayList<Person> plist = new ArrayList<>();
		plist.add(new Dentist());
		plist.add(new Doctor());
		plist.add(new Police());

		for (Person p : plist) {
			p.sayHi();
		}

		Collections.addAll(fruit_list,"apple","apple","apple","apple","apple","apple","apple");
		System.out.println(fruit_list);
		
		System.out.println("apple 개수: " + Collections.frequency(fruit_list, "apple"));
		
		System.out.println(Collections.max(fruit_list));
		System.out.println(Collections.min(fruit_list));
		
		Collections.sort(fruit_list); //순서대로 정렬
		System.out.println(fruit_list);
		
		Collections.reverse(fruit_list); //거꾸로 정렬
		System.out.println(fruit_list);
		
		Collections.swap(fruit_list, 0, fruit_list.size()-1); //위치 교체 (Collection,i,j)
		System.out.println(fruit_list);
		
		for(int i=0; i<5; ++i) {
			Collections.rotate(fruit_list, -1);
			System.out.println("rotate " + i + ":" + fruit_list);
		}
		
		Collections.shuffle(fruit_list);
		System.out.println("shuffled: " + fruit_list);
		
		Collections.fill(fruit_list, null); //한번에 clear
		System.out.println(fruit_list);
		
		Collections.fill(fruit_list, "banana");
		System.out.println(fruit_list);
		
		
	}
}
