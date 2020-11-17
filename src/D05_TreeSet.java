import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.fruit.Mango;

public class D05_TreeSet {

	//TreeSet
	//중복값을 저장할 수 없다
	//데이터를 저장할 떄 오름차순으로 저장한다.
	//요소로 null을 허용하지 않는다.
	//저장속도가 느린 대신 데이터 접근/검색속도가 빠르다.
	
	//중복제거 + 원하는 부분집합 선택 + 크기 정렬

	public static void main(String[] args) {

		TreeSet<Mango> sweet_mango_tree = new TreeSet<>(new Comparator<Mango>() {

			@Override
			public int compare(Mango o1, Mango o2) {
				//return o1.sweet-o2.sweet;
				//같은 당도를 지닌 망고가 모두 사라지게 된다.(Set이기 때문에)
				//같은 당도를 지녔을 때는 망고 id를! 기준으로 다시 정렬.
				//id 대신 o1.hashCode()를 사용해도 된다. (객체를 유일하게 구분)
				int sweet_value = o1.sweet - o2.sweet;
				return sweet_value == 0 ? o1.id - o2.id : sweet_value;
			}

		}); 

		for (int i=0; i<50; ++i) {
			sweet_mango_tree.add(new Mango());
		}

		System.out.println(sweet_mango_tree);
		System.out.println("개수: " + sweet_mango_tree.size());


		Set<Mango> just_tree = new TreeSet<>();
		for (int i=0; i<50; ++i) {
			just_tree.add(new Mango());
			System.out.println("Just tree 개수: " + just_tree.size());
		}

		//TreeSet 활용
		System.out.println(sweet_mango_tree.descendingSet()); //내림차순으로 정렬

		//HeadSet(toElement) : 맨앞부터 원하는 위치까지 Set을 반환
		Set<Mango> hSet = sweet_mango_tree.headSet(new Mango(250, 100, 1000));
		System.out.println(hSet);
		System.out.println(hSet.size());

		//tailSet(fromElement) : 원하는 기준부터 맨 마지막까지 Set반환
		SortedSet<Mango> tSet = sweet_mango_tree.tailSet(new Mango(0,5,0));
		System.out.println(tSet);
		System.out.println(tSet.size());

		SortedSet<Mango> h_tSet = tSet.headSet(new Mango(0,8,1000));
		System.out.println(h_tSet.size());

		//subSet(from,)
		SortedSet<Mango> result = sweet_mango_tree.subSet(new Mango(1,7,1000), new Mango(0,9,1000));
		System.out.println(result);

		//TreeSet요소를 하나만 선택하기
		TreeSet<Integer> int_tree = new TreeSet<>();
		
		int_tree.add(99);
		int_tree.add(1);
		int_tree.add(76);
		int_tree.add(3);
		int_tree.add(4);
		int_tree.add(90);
		
		System.out.println(int_tree.ceiling(12)); //higher, ceiling : 해당 값 기준 가장 가까운 큰값
		System.out.println(int_tree.floor(12)); //lower, floor : 해당 값 기준 가장 가까운 작은값
		//floor과 ceiling은 같은 값 있으면 반환. lower과 higher은 같은값 무시.

	
	}
}
