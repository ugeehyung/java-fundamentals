package myobj.student;

import java.util.ArrayList;
import java.util.Random;

public class StudentList {

	public static void main(String[] args) {

		ArrayList<Student2> student_list = new ArrayList<>();

		double sum = 0;
		for (int i=0; i<30; ++i) { //30��

			student_list.add(new Student2());//println�Լ��� �ش� ��ü�� toString()�޼��带 ȣ��.
			sum+=student_list.get(i).getAvg();
		}
		System.out.println(student_list);
		System.out.println(">> �� ���: " + (double)(sum/30));
	}
}

class Student2 {

	//�ܺ� Ŭ�������� �ʵ��� ���� ������ ������� �ʴ°��� �� �� ��ü�������̴�.
	//�ܺ� Ŭ������ ���� �ִ� �͸� ����� �� �ְԲ� �����ϴ� ���� �̻����̴�.

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
		name = String.format("�׽�Ʈ�л�%04d", stu_count++);

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
	public String toString() { //toString�� object�� �޼����̱� ������ ��� ��ü�� ������ �ִ�.
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ�?
		//return name + "/" + total + "/" + avg;
		//String.format(): printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
		return String.format("\n%s: %d/%d/%d/%.2f", name, kor, eng, math, avg);
	}
}