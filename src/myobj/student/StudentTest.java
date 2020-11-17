package myobj.student;

import java.util.Arrays;

public class StudentTest {

	public static void main(String[] args) {

		Test t1 = new Test("Kim", 2, 100);
		
		String sub = Test.getSubject(2);
		System.out.println(sub);

		Test t2 = new Test("Park", 1, 80);

		System.out.println(Arrays.toString(Test.getTestDate()));
		System.out.println(t1.name);
		System.out.println(t2.score);

	}
}

class Test {

	String name;
	int subject;

	final static int MATH = 1;
	final static int SCIENCE = 2;
	final static int ENGLISH = 3; 

	int score; 

	static int year = 2020;
	static int month = 10;
	static int day = 30;

	public Test(String name, int subject, int score) {

		this.name = name;
		this.subject = subject;
		this.score = score;

	}

	public static void changeDate(int year, int month, int day) {
		Test.year = year;
		Test.month = month;
		Test.day = day;
	}

	public static int[] getTestDate() {
		return new int[] {year, month, day};
	}

	public static String getSubject(int num) {
		
		if (num == 1) {
			return "MATH";
		} else if (num == 2) {
			return "SCIENCE";
		} else if (num == 3) {
			return "ENGLISH";
		} else {
			return "잘못된 번호입니다.";
		}

	}
}
