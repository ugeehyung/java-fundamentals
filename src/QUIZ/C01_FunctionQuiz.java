package QUIZ;

public class C01_FunctionQuiz {

	public static boolean alphabet(char chr) {

		return (chr>='a' && chr<='z') ||(chr<='A' && chr>='Z');
	}

	public static boolean three(int num) {

		return (num % 3 == 0);
	}

	public static String even(int num) {

		return num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}

	public static boolean prime(int num) {

		for (int i=1; i<=Math.sqrt(num); ++i) {
			if (num % i ==0 || num ==1){
				return false;
			}
		}
		return true;
	}

	public static int factorial(int num) {
		int result = 1;
		for (int i=1; i<=num; ++i) {
			result *= i;
		}
		return result;
	}

	//재귀함수(성능안좋고 읽기힘들고 머리아픔)
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num * recursive_factorial(num-1);
	}
	
	public static int square(int num1, int num2) {
		int result = 1;
		for (int i=1; i<=num2; ++i) {
			result *= num1;
		} 
		return result;
	}

	public static int recursive_square(int num1, int num2) {
		
		if (num2 == 0) {
			return 1;
		}
		return num1 * recursive_square(num1, num2-1);
	}	
		
	public static void main(String[] args) {

		System.out.println(alphabet('a'));  System.out.println(alphabet('1'));
		System.out.println(three(30)); System.out.println(three(31));
		System.out.println(even(4)); System.out.println(even(5));
		System.out.println(prime(7)); System.out.println(prime(8));
		System.out.println(recursive_factorial(5));
		System.out.println(factorial(5));
		System.out.println(square(3,3));
		System.out.println(recursive_square(3,3));
		
	}
}
