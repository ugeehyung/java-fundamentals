import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class D03_LinkedList {

	//���� ����Ʈ
	//ArrayList���� ����/������ ������ ����Ʈ
	//�߰��� ������ �Ͼ�� �� ArrayList�� ��� �����͸� �ڷ� �̵����Ѿ� ������(Shift)
	//LinkedList�� ����� ��常 �ٲٸ� �Ǳ� ������ �ξ� ������.
	//ArrayList�� ����������, �б⿡ �����ϰ� LinkedList�� �����ͻ��� �� ������ �����ϴ�.

	public static void main(String[] args) {

		LinkedList<String> mem = new LinkedList<>();
		
		mem.add("ȸ��1");
		mem.add("ȸ��2");
		mem.add("ȸ��3");
		mem.addFirst("��");
		mem.addLast("��");

		System.out.println(mem);
		System.out.println(mem.get(3));
		System.out.println(mem.getFirst());
		System.out.println(mem.getLast());

		//pop() : �Ǿ��� �����͸� �����鼭 ����
		System.out.println("����>>>>");		
		int len = mem.size();
		for (int i=0; i<len; ++i) {
		System.out.println("��� ������: " + mem.pop());
		System.out.println("after pop: " + mem);
		}
		
		//LinkedList�� ����Ʈ, ����, ťó�� Ȱ���� �� �ִ�.
		
		mem.add("ȸ��1");
		mem.add("ȸ��2");
		mem.add("ȸ��3");
		mem.add("ȸ��4");
		mem.add("ȸ��5");
		
		System.out.println(mem);
		
		//poll(): ù��° ��Ҹ� �����鼭 ��� (pop�� ����)
		System.out.println(mem.poll());
		System.out.println(mem);
		
		//pollLast() : ���� �ֱٿ� �߰��� ��Ҹ� �����鼭 ��� (LIFO)
		System.out.println(mem.pollLast());
		System.out.println(mem);
		
		//peek() : ������ ���� �ʰ� ó�� ��� ���
		System.out.println(mem.peek());
		System.out.println(mem);
		
		//peekLast() : ������ ���� �ʰ� ������ ��� ���
		System.out.println(mem.peekLast());
		System.out.println(mem);
		
		ArrayList<Integer> arr_list = new ArrayList<>();
		for(int i=0; i< 10000000; ++i) {
			arr_list.add(i);
		}
		
		LinkedList<Integer> linked_list = new LinkedList<>();
		for(int i=0; i< 10000000; ++i) {
			linked_list.add(i);
		} 
		
		HashSet<Integer> toAdd = new HashSet<>();
		for(int i=0; i<20; ++i) {
			toAdd.add(i);
		}
		
		
		//ArrayList�� �߰��� �����͸� �߰��ϴ� ���� ������.
		long start = System.currentTimeMillis();
		System.out.print("ArrayList Insertion Test ");
		for(int i=0; i<20; ++i) {
			arr_list.addAll(10, toAdd);
		}
		long end = System.currentTimeMillis();
		System.out.println("End " + (end - start) + " millSec");
		
		//LinkedList�� �߰��� �����͸� �߰��� �� �����ϴ�. 
		start = System.currentTimeMillis();
		System.out.print("LinkedList Insertion Test ");
		for(int i=0; i<20; ++i) {
			linked_list.addAll(10, toAdd);
		}
		end = System.currentTimeMillis();
		System.out.println("End " + (end - start) + " millSec");
		
		
		List<Integer> to_store = new ArrayList<>(linked_list);
		start = System.currentTimeMillis();
		System.out.print("ArrayList Reading Test ");
		for(int i : to_store) {
			int a = i + 10;
		}
		end = System.currentTimeMillis();
		System.out.println("End " + (end-start) + " millSec");
		

		start = System.currentTimeMillis();
		System.out.print("LinkedList Reading Test ");
		for(int i : linked_list) {
			int a = i + 10;
		}
		end = System.currentTimeMillis();
		System.out.println("End " + (end-start) + " millSec");
		
	}
}
