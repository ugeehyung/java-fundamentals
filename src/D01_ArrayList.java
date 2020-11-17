import java.util.ArrayList;
import java.util.Collections;

public class D01_ArrayList {

	//java collections: �ڹٿ��� �⺻���� �����ϴ� �ڷᱸ�� �������̽�
	//collections �������̽��� ������ Ŭ�����δ� list, set�� �ִ�.

	//array list: �迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
	//�迭�� ������ �����̱� ������ ���������� �����Ϳ� �����Ҷ� ���� �����ϴ�.

	public static void main(String[] args) {

		ArrayList list = new ArrayList(); 

		list.add("ȫ�浿"); //add(item) �޼ҵ�: �����͸� list�� ���������� �߰��Ѵ�. ArrayList�� Ÿ���� ���������� ������ ��� Ÿ���� ����. 
		list.add("����ġ");
		list.add("�Ӳ���");
		list.add("�����");
		list.add(300); 		
		list.add(0,"�̼���"); //���ϴ� ��ġ�� �����͸� �ִ´�. (���� ������ ��ĭ�� �и�!)

		System.out.println(list);

		System.out.println(list.get(0)); //ArrayList�� get(index) : �迭ó�� �ε����� �����͸� ������.
		System.out.println(list.get(1)); //���� �� � Ÿ������ ������ �˱� ���������.

		Object thing = list.get(2); //���� �� object Ÿ��(��� Ÿ���� �θ�)���� ����.
		System.out.println(thing);

		//Ÿ���� ������ ArrayList �����ϱ� (<> = ���׸�)
		ArrayList<String> fruit_list = new ArrayList<>(); //<>�� Ÿ���� �������ָ� ArrayList�� �� �޼��� Ÿ���� �ٲ��.

		fruit_list.add("apple");
		fruit_list.add("kiwi");

		System.out.println(fruit_list);
		System.out.println(fruit_list.get(0));

		//size() : ArrayList�� ũ��
		System.out.println(list.size());
		System.out.println(fruit_list.size());

		//remove(index) : ���ϴ� ��ġ�� �������� ���� + �����ϴ� �������� ��ȯ
		//remove(item) : ���ϴ� �� �� �Ǿ� �ϳ� ����
		System.out.println("������ ������: " + list.remove(5));

		for (int i=0, size = list.size(); i<size; ++i) {
			System.out.println(list.get(i));
		}

		fruit_list.add(0,"apple");
		fruit_list.add("apple");
		fruit_list.add("apple");
		fruit_list.add("apple");
		fruit_list.add("apple");
		System.out.println(fruit_list);

		System.out.println("������ ���� �� ��ȯ�Ǵ� ��: " + fruit_list.remove("apple"));
		//fruit_list.remove("apple") = "true"���� �� �� �ִ�!
		System.out.println(fruit_list);

		int count =0;
		while (fruit_list.remove("apple")) {
			++count;
		}
		System.out.printf("����� %d�� �����Ǿ����ϴ�. ������ ��� �������ϴ�.\n", count);


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
		
		System.out.println("apple ����: " + Collections.frequency(fruit_list, "apple"));
		
		System.out.println(Collections.max(fruit_list));
		System.out.println(Collections.min(fruit_list));
		
		Collections.sort(fruit_list); //������� ����
		System.out.println(fruit_list);
		
		Collections.reverse(fruit_list); //�Ųٷ� ����
		System.out.println(fruit_list);
		
		Collections.swap(fruit_list, 0, fruit_list.size()-1); //��ġ ��ü (Collection,i,j)
		System.out.println(fruit_list);
		
		for(int i=0; i<5; ++i) {
			Collections.rotate(fruit_list, -1);
			System.out.println("rotate " + i + ":" + fruit_list);
		}
		
		Collections.shuffle(fruit_list);
		System.out.println("shuffled: " + fruit_list);
		
		Collections.fill(fruit_list, null); //�ѹ��� clear
		System.out.println(fruit_list);
		
		Collections.fill(fruit_list, "banana");
		System.out.println(fruit_list);
		
		
	}
}
