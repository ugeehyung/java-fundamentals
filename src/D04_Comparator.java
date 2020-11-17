import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import myobj.comp.StudentComparatorA;
import myobj.student.Student;
import myobj.student.StudentList;

public class D04_Comparator {

	public static void main(String[] args) {
		
		LinkedList<String> words = new LinkedList<>();
		
		words.add("airplane");
		words.add("jets");
		words.add("coffee");
		words.add("glasses");
		words.add("oriental");
		
		Collections.sort(words);
		System.out.println(words);
		
		List<Student> group = new LinkedList<>();
		
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		
		Collections.sort(group, new StudentComparatorA());
		System.out.println(group);
		
	}
}
