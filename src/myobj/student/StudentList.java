package myobj.student;

import java.util.ArrayList;
import java.util.Random;

public class StudentList {

	public static void main(String[] args) {

		ArrayList<Student2> student_list = new ArrayList<>();

		double sum = 0;
		for (int i=0; i<30; ++i) { //30명

			student_list.add(new Student2());//println함수는 해당 객체의 toString()메서드를 호출.
			sum+=student_list.get(i).getAvg();
		}
		System.out.println(student_list);
		System.out.println(">> 반 평균: " + (double)(sum/30));
	}
}

class Student2 {

	//외부 클래스에서 필드의 직접 접근을 허용하지 않는것이 좀 더 객체지향적이다.
	//외부 클래스는 내가 주는 것만 사용할 수 있게끔 설계하는 것이 이상적이다.

	private int kor, eng, math;
	private int total;
	private double avg;
	String name;

	final static int SUBJECTS = 3;
	static int stu_count = 0;

	public Student2() {

		Random ran = new Random();
		kor = ran.nextInt(51)+50;
		eng = ran.nextInt(51)+50;
		math = ran.nextInt(51)+50;
		name = String.format("테스트학생%04d", stu_count++);

	}

	public double getAvg() {
		avg = (kor + eng + math) / (double)SUBJECTS;
		return (kor + eng + math) / (double)SUBJECTS;
	}
	
	public int getTotal() {
		total = kor + eng + math;
		return kor + eng + math;
	}

	@Override
	public String toString() { //toString은 object의 메서드이기 때문에 모든 객체가 가지고 있다.
		// 이 객체를 문자열로 표현한다면?
		//return name + "/" + total + "/" + avg;
		//String.format(): printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
		return String.format("\n%s: %d/%d/%d/%.2f", name, kor, eng, math, avg);
	}
}