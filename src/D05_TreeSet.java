import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.fruit.Mango;

public class D05_TreeSet {

	//TreeSet
	//�ߺ����� ������ �� ����
	//�����͸� ������ �� ������������ �����Ѵ�.
	//��ҷ� null�� ������� �ʴ´�.
	//����ӵ��� ���� ��� ������ ����/�˻��ӵ��� ������.
	
	//�ߺ����� + ���ϴ� �κ����� ���� + ũ�� ����

	public static void main(String[] args) {

		TreeSet<Mango> sweet_mango_tree = new TreeSet<>(new Comparator<Mango>() {

			@Override
			public int compare(Mango o1, Mango o2) {
				//return o1.sweet-o2.sweet;
				//���� �絵�� ���� ���� ��� ������� �ȴ�.(Set�̱� ������)
				//���� �絵�� ������ ���� ���� id��! �������� �ٽ� ����.
				//id ��� o1.hashCode()�� ����ص� �ȴ�. (��ü�� �����ϰ� ����)
				int sweet_value = o1.sweet - o2.sweet;
				return sweet_value == 0 ? o1.id - o2.id : sweet_value;
			}

		}); 

		for (int i=0; i<50; ++i) {
			sweet_mango_tree.add(new Mango());
		}

		System.out.println(sweet_mango_tree);
		System.out.println("����: " + sweet_mango_tree.size());


		Set<Mango> just_tree = new TreeSet<>();
		for (int i=0; i<50; ++i) {
			just_tree.add(new Mango());
			System.out.println("Just tree ����: " + just_tree.size());
		}

		//TreeSet Ȱ��
		System.out.println(sweet_mango_tree.descendingSet()); //������������ ����

		//HeadSet(toElement) : �Ǿպ��� ���ϴ� ��ġ���� Set�� ��ȯ
		Set<Mango> hSet = sweet_mango_tree.headSet(new Mango(250, 100, 1000));
		System.out.println(hSet);
		System.out.println(hSet.size());

		//tailSet(fromElement) : ���ϴ� ���غ��� �� ���������� Set��ȯ
		SortedSet<Mango> tSet = sweet_mango_tree.tailSet(new Mango(0,5,0));
		System.out.println(tSet);
		System.out.println(tSet.size());

		SortedSet<Mango> h_tSet = tSet.headSet(new Mango(0,8,1000));
		System.out.println(h_tSet.size());

		//subSet(from,)
		SortedSet<Mango> result = sweet_mango_tree.subSet(new Mango(1,7,1000), new Mango(0,9,1000));
		System.out.println(result);

		//TreeSet��Ҹ� �ϳ��� �����ϱ�
		TreeSet<Integer> int_tree = new TreeSet<>();
		
		int_tree.add(99);
		int_tree.add(1);
		int_tree.add(76);
		int_tree.add(3);
		int_tree.add(4);
		int_tree.add(90);
		
		System.out.println(int_tree.ceiling(12)); //higher, ceiling : �ش� �� ���� ���� ����� ū��
		System.out.println(int_tree.floor(12)); //lower, floor : �ش� �� ���� ���� ����� ������
		//floor�� ceiling�� ���� �� ������ ��ȯ. lower�� higher�� ������ ����.

	
	}
}
