
public class D06_WrapperClass {

	//WrapperClass
	//�⺻�� Ÿ��Ʋ�� ������ Ÿ������ ����ϰ� ���� �� ����Ѵ�.
	//�� Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�.
	
	//�⺻��: byte, short, char, int, long, float, double
	//������: Byte, short, Character, Integer, Long, Float, Double
	
	public static void main(String[] args) {
		
		//.typeValue() �ø���: �������� ����� ���� ���ϴ� Ÿ������ ��ȯ�Ѵ�.
		Integer a = 10; 		//Integer b = new Integer(10); -> JDK���ķ� deprecated
		a.byteValue();
		a.doubleValue();
		a.byteValue();
		a.floatValue();	
		
		//parseType �ø��� : ���� ���ϴ� Ÿ������ ��ȯ�Ѵ�.
		String str = "10";
		Integer.parseInt(str); //int��!
		Integer.parseInt(str,16);//16���� int��!
		Double.parseDouble(str); //double��!
		Byte.parseByte(str);//byte��!
				
		//��
		//new Integer(10) == new Integer(10); 
		new Integer(10).equals(new Integer(10)); 
			
		//������ȯ�� �����ϴ�.(radix������ ������)
		Integer.toString(123, 2); //2��������!
		Integer.toString(123, 8); //8��������!
		Integer.toString(123, 10); //10��������!
		Integer.toString(123, 16); //16��������!
		
		Boolean b1 = Boolean.valueOf("true"); //���ڿ��� boolean���� ��ȯ
		
		//�ش� ������ ���ڸ� charŸ������ ��ȯ.
		Character.forDigit(35, 36); //36������ 35�� �ش��ϴ� ���ڸ� ��ȯ 
		Character.forDigit(35, 16); //16������ 35�� �ش��ϴ� ���ڸ� ��ȯ
	}
}
