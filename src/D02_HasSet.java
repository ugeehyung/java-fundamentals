import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class D02_HasSet {
	
	//Set : 집합을 구현해놓은 클래스. 요소로 같은 값이 들어오는 것을 허용하지 않는다.
	//Hash : 어떤값을 넣었을 때 전혀 예측할 수 없는 값이 생성되어야 하는 알고리즘.
	//		 예측할 수 없는 값을 이용하므로 정렬이 불가능하다.
	//       생성된 값으로 원래값을 찾는 것이 불가능에 가깝다. (다시 돌아가는 알고리즘이 없음)
	//       속도가 빠르고 보안성도 뛰어난 알고리즘
	
	//비밀번호 abcd1234$%^ -> 678945616
	//입력값  abcd1234%^* -> 123564879 (완전히 다름)
	
	//a -> 53456789
	//b -> 12348954
	//c -> 87956321
	
	public static void main(String[] args) {
		
		HashSet<Integer> even = new HashSet<>();
		
		even.add(10);
		even.add(10); //중복제거. set에는 똑같은 데이터를 저장할 수 없다.
		even.add(20);
		even.add(30);
		even.add(40);
		even.add(50);
		even.add(80);
		even.add(60);
		
		System.out.println(even); //Hash를 이용하는 클래스는 순서대로 보관되지 않는다.
		//HashSet은 index가 없기 때문에 하나만 꺼낼 수가 없다.
		for(int i :even) {
			System.out.println("하나씩-> " +i); 
		}
		
		ArrayList<String> animals = new ArrayList<>();
		
		animals.add("zebra");
		animals.add("zebra");
		animals.add("lion");
		animals.add("lion");
		animals.add("lion");
		animals.add("tiger");
		animals.add("eagle");
		
		Collections.shuffle(animals);
		System.out.println(animals);
		
		//다른 종류의 컬렉션을 set으로 손쉽게 변경할 수 있다. 중복제거됨.
		Set<String> animals_set = new HashSet<>(animals);
		System.out.println(animals_set);
		
		System.out.println("lions".hashCode());
		
		//다른 종류의 컬렉션을 object 배열로 변환
		Object[] animals_arr = animals.toArray(); 
		System.out.println(animals_arr[0]);
		String first_animal = (String)(animals_arr[0]); 
		//object->string 다운캐스팅
		System.out.println(first_animal);

		
		String[] str_animals_arr = new String[animals_set.size()];
		//배열 하나 생성
		animals_set.toArray(str_animals_arr); //컬렉션(set)을 string 배열로 변환
		first_animal = str_animals_arr[0]; 
		System.out.println(first_animal);
		
		//contains: 컬렉션에 해당 요소가 있는지 true/false 를 반환
		System.out.println(animals.contains("lion"));
		System.out.println(animals_set.contains("zebra"));
	
		//size: 컬렉션 크기반환
		System.out.println(animals.size());
		
		//remove: 컬렉션 요소 삭제 (삭제 성공시 true 반환)
		System.out.println(animals.remove("lion"));
		
			
		
		//다른 컬렉션을 이용하는 메서드를
		Set<Character> alphabet01 = new HashSet<>();
		Set<Character> alphabet02 = new HashSet<>();
		
		Collections.addAll(alphabet01, 'A','B','C','D','E');
		Collections.addAll(alphabet02, 'D','E','F','G','H');
		System.out.println(alphabet01);
		System.out.println(alphabet02);
		
		//1.addAll(collection): 모든 값을 추가한다.
		List<Character> alpha_all = new ArrayList<>();
		
		alpha_all.addAll(alphabet01);
		alpha_all.addAll(alphabet02);
		
		System.out.println(alpha_all);
		
		//2.removeAll(collection): 일치하는 값을 제거한다.
		Set<Character> to_remove = new HashSet<>();
		Collections.addAll(to_remove, 'A', 'D');
		
		alpha_all.removeAll(to_remove);
		
		System.out.println(alpha_all);
		
		//3.retainAll(collection): 일치하는 값만 유지한다.
		List<Character> to_retain = new ArrayList<>();
		
		to_retain.add('E');
		to_retain.add('G');
		
		alpha_all.retainAll(to_retain);
		System.out.println(alpha_all);
		
		//4.containsAll(collection): 전달한 컬렉션의 모든 요소가 포함되어 있는지 확인.
		Collections.addAll(alpha_all, 'A','B','C','D');
		Set<Character> must_contain = new HashSet<>();
		
		must_contain.add('A');
		must_contain.add('B');
		must_contain.add('C');
		must_contain.add('D');
		
		System.out.println(alpha_all.containsAll(must_contain));
		
		must_contain.add('X');
		
		System.out.println(alpha_all.containsAll(must_contain));
		
		

		
		
	}

}
