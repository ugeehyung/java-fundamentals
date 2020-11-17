
public class A03_VarTypes {

	public static void main(String[] args) {
		
		/*
		 # ���� Ÿ�� (''���� Ÿ�� ���� ���� ����� �޴´�)
		 �� Ÿ�Ը��� �����͸� ������ �� �ִ� ũ�Ⱑ �ٸ���. 
		 -byte	(1byte)  -128	~ +127
		 -char	(2byte)  0		~ +65535 (65536��, ���ڿ� ����ȭ)
		 -short (2byte)  -32768 ~ +32767 (65536��)
		 -int	(4byte)  -22��	~ +22�� (2^32��)
		 -long	(8byte)  ��û ū ����
		 */

		byte b = 127; //ǥ���� �� �ִ� ���ڰ� ���� ��� ������ ������ �� �ִ�.
		char c = 0; 
		short s = -32768;
		int i = 2100000000;
		//int�� ������ ����� ���ڸ� ���� �� �ڿ� L�� �ٿ��� �Ѵ�. 
		long l = 900000000;
		
		/*
		 	#�Ǽ� Ÿ�� (���� �׷��� ��꿡�� �̿�ȴ�)
		 	�� �ε��Ҽ��� ����� ����Ѵ�.
		 	
		 	-float	(4byte)
		 	-double	(8byte)
		 	
		 */
		
		float f = 123.123f; //float���� ���� �� �ڿ� f�� �ٿ��� �Ѵ�.
		double d = 123.123;
		
		// # Literal(���ͷ�)
		// �׳� ���� ��
		// "", '', �Ҽ�, �Ҽ�f, ����, ����L...
		// 0����(8), 0x����(16), 0b����(2)
		// true, false
		
		//16����: 0123456789ABCDEF 10(16)
		//8����: 01234567 10(8)
		//2����: 01 10(2)
		
		System.out.println("111(10) : " + 111);
		System.out.println("111(2) : " + 0b111);
		System.out.println("111(8) : " + 0111);
		System.out.println("111(16) : " + 0x111);
		
		/*
		 	# ��/���� Ÿ��
		 	boolean: true, false �� ������ ���� ������ �� �ִ� ���� Ÿ��
		 */
		boolean bl = false;
		boolean goonpil = false;
		boolean passExam = true;
		boolean complete = true;
		
		/*
		 #������ Ÿ�� (Ŭ���� Ÿ��)
		 String: ���ڿ�
		 �� �� ��� Ŭ������...
		 �� �빮�ڷ� �����ϴ� ��� Ÿ�Ե��� ������ Ÿ���̴�
		 */
		
		String hiMsg = "Hi, nice to meet you!";
		String byeMsg = "Good bye";
		
		System.out.println(hiMsg);
		System.out.println(byeMsg + byeMsg + byeMsg);
	}

	
	
	
	
	
	
	
	
	
	
	
}
