
public class B08_Operator04 {

	public static void main(String[] args) {
		
		//���� ����
		// = : ������ ������ �������� ���� ����
		
		int num = 10;
		num = num + 5;

		//���� ���� ����
		//������ ���� ����ִ� ���� ����� ������Ű�� ����
		
		num = 10;
		num += 5; // num = num + 5 �� �ٿ��� ǥ��
		num -= 2;
		num *= 3;
		num /= 2;
		num %= 2;
		
		System.out.println(num);
		
		//���� ����
		
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
		
		//++,--��ġ�� ���� �������� �޶�����. ��: ���� ��, ��: ���� ��
		
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
