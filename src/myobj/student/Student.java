package myobj.student;

import java.util.Random;

public class Student implements Comparable<Student> {
	
	//�ܺ� Ŭ�������� �ʵ��� ���� ������ ������� �ʴ°��� �� �� ��ü�������̴�.
	//�ܺ� Ŭ������ ���� �ִ� �͸� ����� �� �ְԲ� �����ϴ� ���� �̻����̴�.

	private int kor, eng, math;
	String name;

	final static int SUBJECTS = 3;
	static int stu_count = 0;

	public Student() {

		Random ran = new Random();
		kor = ran.nextInt(51)+50;
		eng = ran.nextInt(51)+50;
		math = ran.nextInt(51)+50;
		name = String.format("�׽�Ʈ�л�%04d", stu_count++);

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
	public String toString() { //toString�� object�� �޼����̱� ������ ��� ��ü�� ������ �ִ�.
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ�?
		//return name + "/" + total + "/" + avg;
		//String.format(): printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
		return String.format("\n%s: %d/%d/%d/%.2f", name, kor, eng, math, getAvg());
	}
}

	
	

