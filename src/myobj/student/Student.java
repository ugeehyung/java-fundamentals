package myobj.student;

import java.util.Random;

public class Student implements Comparable<Student> {
	
	//외부 클래스에서 필드의 직접 접근을 허용하지 않는것이 좀 더 객체지향적이다.
	//외부 클래스는 내가 주는 것만 사용할 수 있게끔 설계하는 것이 이상적이다.

	private int kor, eng, math;
	String name;

	final static int SUBJECTS = 3;
	static int stu_count = 0;

	public Student() {

		Random ran = new Random();
		kor = ran.nextInt(51)+50;
		eng = ran.nextInt(51)+50;
		math = ran.nextInt(51)+50;
		name = String.format("테스트학생%04d", stu_count++);

	}

	public double getAvg() {

		return (kor + eng + math) / (double)SUBJECTS;
	}
	
	public int getTotal() {

		return kor + eng + math;
	}

	public int compareTo(Student next_student) {

		if (this.math > next_student.math) {
			return 1;
		} else if (this.math < next_student.math) {
			return -1;
		} else {
			return 0;
		}
	}
		
	public int compareTo2(Student next_student) {
		
		if (this.eng > next_student.eng) {
			return -1;
		} else if (this.eng < next_student.eng) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() { //toString은 object의 메서드이기 때문에 모든 객체가 가지고 있다.
		// 이 객체를 문자열로 표현한다면?
		//return name + "/" + total + "/" + avg;
		//String.format(): printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
		return String.format("\n%s: %d/%d/%d/%.2f", name, kor, eng, math, getAvg());
	}
}

	
	

