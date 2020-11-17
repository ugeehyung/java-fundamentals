package QUIZ;

import java.util.Arrays;
import java.util.Scanner;

public class C01_FuncionQuiz2 {

	public static int[] range(int num1, int num2) {

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int length = num2 - num1 + 1;
		int[] range1 = new int[length];

		for(int i=0; i<length; ++i) {
			range1[i] = num1;
			++num1;
		}
		return range1;
	}

	public static int[] range(int num) {

		int[] range2 = new int[num+1];
		for(int i=0; i<=range2.length-1; ++i) {
			range2[i] = i;
		}
		return range2;
	}

	public static String join(String[] array) { 

		StringBuilder result = new StringBuilder();

		result.append('"');
		for(int i=0; i<array.length-1; ++i) {
			result.append(array[i]+"/");
		} 
		result.append(array[array.length-1]+'"');

		return result.toString();
	}


	public static char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static char getSym(int value) {

		return digits[value];

	}


	public static int getValue(char digit) {

		for (int i = 0; i < digits.length; ++i) {
			
			if(digits[i] == digit) {
				return i;
			}
		}
		return -1;
	}


	public static String convert(String num, int from, int to) {

		num = num.toUpperCase();

		if (from<2||from>36||to<2||to>36) {
			System.err.println("Error> 사용 가능 진법 : 2진수 ~ 36진수");
			return null;
		}

		int pow = num.length()-1;
		long real_value = 0;

		for(int i=pow; i>-1; --i) {

			char digit = num.charAt(pow - i);
			int value = getValue(digit);

			System.out.print(num.charAt(pow-i));
			System.out.print("(실제값:" + value +")");
			System.out.println(":"+(int)Math.pow(from, i)+ "의 자리");

			real_value += value * Math.pow(from,i);
		}
		System.out.println();
		System.out.println(from+"진수 문자열 "+ num +"의 실제값: " + real_value);

		StringBuilder result = new StringBuilder();

		while(real_value>0) {
			result.append(getSym((int)(real_value % to)));
			real_value /= to;
		}
		System.out.print(to + "진수로 바꿨을 때: ");
		return result.reverse().toString();
	}

	
	public static void main(String[] args) {

		//1. 
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1을 입력하세요> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2을 입력하세요> ");
		int num2 = sc.nextInt();
		System.out.println(Arrays.toString(range(num1,num2)));

		//2.
		System.out.print("\n숫자를 입력하세요> ");
		int num3 = sc.nextInt();
		System.out.println(Arrays.toString(range(num3)));
		System.out.println();

		//3. 
		String fruit[] = {"apple", "banana", "orange"};
		System.out.println(join(fruit));
		System.out.println();

		//4. 
		System.out.println(convert("110",8,2));

	}
}