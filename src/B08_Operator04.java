
public class B08_Operator04 {

	public static void main(String[] args) {
		
		//대입 연산
		// = : 왼쪽의 변수에 오른쪽의 값을 대입
		
		int num = 10;
		num = num + 5;

		//복합 대입 연산
		//변수에 원래 들어있던 값에 결과를 누적시키는 연산
		
		num = 10;
		num += 5; // num = num + 5 를 줄여서 표현
		num -= 2;
		num *= 3;
		num /= 2;
		num %= 2;
		
		System.out.println(num);
		
		//단항 연산
		
		num = 10;
		num++;//num = num + 1
		System.out.println(num);
		++num;
		System.out.println(num);
		num--;
		System.out.println(num);
		--num;
		System.out.println(num);
		
		double a  = 10.1234;
		a++;
		System.out.println(a);
		
		//++,--위치에 따라 실행결과가 달라진다. 앞: 연산 전, 뒤: 연산 후
		
		int b = 3, c = 10;
		int result = b*c;
		System.out.println(result);
		int result2 = b++*c;
		System.out.println(result2);
		System.out.println(b);
		int result3 = b*++c;
		System.out.println(result3);
		System.out.println(result3++);
		System.out.println(result3);
		System.out.println(++result3);
			
		
	
	}
	
	
	
}
