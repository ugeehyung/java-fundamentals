
public class B00_Operator01 {

	public static void main(String[] args) {
		
		//������ (operator) : ����� �� ����ϴ� ��
		
		//#��� ������
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.printf("a = %d. b = %d, c = %.1f �� ��,\n", a, b, c);
		System.out.println("+: " + (a + b));
		System.out.println("-: " + (a - b));
		System.out.println("*: " + (a * b));
		
		System.out.println("/: " + (a / b));
		//�������� �����⸦ �ϸ� �� ���´�. �Ǽ��� �ٲ���� ��.
		System.out.println("/: " + (a/ (double)b));
		System.out.println("/: " + (a/ c));
		
		System.out.println("%: " + (a % b));
		System.out.println("^: " + (a ^ b)); //������ �ƴϴ�.(XOR:���� �ٸ��� 1)
		
		System.out.println("����: " + Math.pow(a, b)); //(��� double Ÿ��)
		System.out.println("������: " +Math.sqrt(2)); 
		System.out.println("���밪: " + Math.abs(-20)); 
		System.out.println("�ݿø�: " + Math.round(1.234));
		System.out.println("�ø�: " + Math.ceil(1.001));
		System.out.println("����: " + Math.floor(1.999));
		System.out.println("max: " + Math.max(a,b));
		System.out.println("min: " + Math.min(a, b));
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
