public class C12_TryCatch {

	//����ó�� : ������� �˰� �ִ� ���� �۾���. (�ع��������� Ʋ�� ���� ���ܰ� �ƴ϶� �����̴�.)
	//���α׷��Ӱ� ���ܿ� ���� ������ ��ġ�� �����شٸ� ���α׷��� ������������ �ʰ� ��� ����. 
	
	//try : ���ܰ� �߻��� �� ���� �ڵ带 try�� ���ο� ���Խ�Ų��.
	//catch : try�� ���� �ڵ忡�� ���ܰ� �߻��ϸ� �ش� catch������ �̵�. ������ ��� ����.
	//ù��° �Ű������� �ش� ���ܿ� ���� ������ ����ִ� ��ü�� �޴´�.
	//���ܰ� �߻����� ������ ��� ���� ����. ���ܰ� �߻��Ѵٸ�, catch������ �Ѿ. 
	//finally : try�� ������ ���� �߻����ο� ������� ������!! ����Ǵ� ����. (return�־)

	public static void main(String[] args) {
		
		int[] abc = new int[10];

		try {
			
			System.out.println("try���� ����");
			System.out.println(abc[10]);
			System.out.println(Integer.parseInt("abc")); //���ڿ��� intŸ������ ��ȯ�ϴ� �޼ҵ�
			System.out.printf("%d", "abc");
			System.out.println("try���� ��"); //���� �ȵ�.
			
		} catch (Exception e) { //Exception Ÿ���� catch���� ��� ���ܸ� catch
//		} catch (ArrayIndexOutOfBoundsException e) {
//		} catch (NumberFormatException e) {
//		} catch (IllegalFormatConversionException e) {
//			System.out.println("catch�� ����: " + e.getMessage());
//			e.printStackTrace();
//			System.exit(0);
//		}
		} finally {
			System.out.println(" /)/)");
			System.out.println("(..  )");
			System.out.println("��<  )");
		}
		
		System.out.println("������� �� ����Ǿ����ϴ�");
	}
}
