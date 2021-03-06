import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class D03_LinkedList {

	//연결 리스트
	//ArrayList보다 삽입/삭제에 유리한 리스트
	//중간에 삽입이 일어났을 때 ArrayList는 모든 데이터를 뒤로 이동시켜야 하지만(Shift)
	//LinkedList는 연결된 노드만 바꾸면 되기 때문에 훨씬 빠르다.
	//ArrayList는 데이터저장, 읽기에 유리하고 LinkedList는 데이터생성 및 삭제에 유리하다.

	public static void main(String[] args) {

		LinkedList<String> mem = new LinkedList<>();
		
		mem.add("회원1");
		mem.add("회원2");
		mem.add("회원3");
		mem.addFirst("앞");
		mem.addLast("뒤");

		System.out.println(mem);
		System.out.println(mem.get(3));
		System.out.println(mem.getFirst());
		System.out.println(mem.getLast());

		//pop() : 맨앞의 데이터를 꺼내면서 삭제
		System.out.println("시작>>>>");		
		int len = mem.size();
		for (int i=0; i<len; ++i) {
		System.out.println("방금 꺼낸값: " + mem.pop());
		System.out.println("after pop: " + mem);
		}
		
		//LinkedList를 리스트, 스택, 큐처럼 활용할 수 있다.
		
		mem.add("회원1");
		mem.add("회원2");
		mem.add("회원3");
		mem.add("회원4");
		mem.add("회원5");
		
		System.out.println(mem);
		
		//poll(): 첫번째 요소를 꺼내면서 사용 (pop과 같음)
		System.out.println(mem.poll());
		System.out.println(mem);
		
		//pollLast() : 가장 최근에 추가한 요소를 꺼내면서 사용 (LIFO)
		System.out.println(mem.pollLast());
		System.out.println(mem);
		
		//peek() : 삭제는 하지 않고 처음 요소 사용
		System.out.println(mem.peek());
		System.out.println(mem);
		
		//peekLast() : 삭제는 하지 않고 마지막 요소 사용
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
		
		
		//ArrayList는 중간에 데이터를 추가하는 것이 느리다.
		long start = System.currentTimeMillis();
		System.out.print("ArrayList Insertion Test ");
		for(int i=0; i<20; ++i) {
			arr_list.addAll(10, toAdd);
		}
		long end = System.currentTimeMillis();
		System.out.println("End " + (end - start) + " millSec");
		
		//LinkedList는 중간에 데이터를 추가할 때 유리하다. 
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
