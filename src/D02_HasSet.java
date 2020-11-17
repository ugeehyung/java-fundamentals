import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class D02_HasSet {
	
	//Set : ������ �����س��� Ŭ����. ��ҷ� ���� ���� ������ ���� ������� �ʴ´�.
	//Hash : ����� �־��� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰���.
	//		 ������ �� ���� ���� �̿��ϹǷ� ������ �Ұ����ϴ�.
	//       ������ ������ �������� ã�� ���� �Ұ��ɿ� ������. (�ٽ� ���ư��� �˰����� ����)
	//       �ӵ��� ������ ���ȼ��� �پ �˰���
	
	//��й�ȣ abcd1234$%^ -> 678945616
	//�Է°�  abcd1234%^* -> 123564879 (������ �ٸ�)
	
	//a -> 53456789
	//b -> 12348954
	//c -> 87956321
	
	public static void main(String[] args) {
		
		HashSet<Integer> even = new HashSet<>();
		
		even.add(10);
		even.add(10); //�ߺ�����. set���� �Ȱ��� �����͸� ������ �� ����.
		even.add(20);
		even.add(30);
		even.add(40);
		even.add(50);
		even.add(80);
		even.add(60);
		
		System.out.println(even); //Hash�� �̿��ϴ� Ŭ������ ������� �������� �ʴ´�.
		//HashSet�� index�� ���� ������ �ϳ��� ���� ���� ����.
		for(int i :even) {
			System.out.println("�ϳ���-> " +i); 
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
		
		//�ٸ� ������ �÷����� set���� �ս��� ������ �� �ִ�. �ߺ����ŵ�.
		Set<String> animals_set = new HashSet<>(animals);
		System.out.println(animals_set);
		
		System.out.println("lions".hashCode());
		
		//�ٸ� ������ �÷����� object �迭�� ��ȯ
		Object[] animals_arr = animals.toArray(); 
		System.out.println(animals_arr[0]);
		String first_animal = (String)(animals_arr[0]); 
		//object->string �ٿ�ĳ����
		System.out.println(first_animal);

		
		String[] str_animals_arr = new String[animals_set.size()];
		//�迭 �ϳ� ����
		animals_set.toArray(str_animals_arr); //�÷���(set)�� string �迭�� ��ȯ
		first_animal = str_animals_arr[0]; 
		System.out.println(first_animal);
		
		//contains: �÷��ǿ� �ش� ��Ұ� �ִ��� true/false �� ��ȯ
		System.out.println(animals.contains("lion"));
		System.out.println(animals_set.contains("zebra"));
	
		//size: �÷��� ũ���ȯ
		System.out.println(animals.size());
		
		//remove: �÷��� ��� ���� (���� ������ true ��ȯ)
		System.out.println(animals.remove("lion"));
		
			
		
		//�ٸ� �÷����� �̿��ϴ� �޼��带
		Set<Character> alphabet01 = new HashSet<>();
		Set<Character> alphabet02 = new HashSet<>();
		
		Collections.addAll(alphabet01, 'A','B','C','D','E');
		Collections.addAll(alphabet02, 'D','E','F','G','H');
		System.out.println(alphabet01);
		System.out.println(alphabet02);
		
		//1.addAll(collection): ��� ���� �߰��Ѵ�.
		List<Character> alpha_all = new ArrayList<>();
		
		alpha_all.addAll(alphabet01);
		alpha_all.addAll(alphabet02);
		
		System.out.println(alpha_all);
		
		//2.removeAll(collection): ��ġ�ϴ� ���� �����Ѵ�.
		Set<Character> to_remove = new HashSet<>();
		Collections.addAll(to_remove, 'A', 'D');
		
		alpha_all.removeAll(to_remove);
		
		System.out.println(alpha_all);
		
		//3.retainAll(collection): ��ġ�ϴ� ���� �����Ѵ�.
		List<Character> to_retain = new ArrayList<>();
		
		to_retain.add('E');
		to_retain.add('G');
		
		alpha_all.retainAll(to_retain);
		System.out.println(alpha_all);
		
		//4.containsAll(collection): ������ �÷����� ��� ��Ұ� ���ԵǾ� �ִ��� Ȯ��.
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
