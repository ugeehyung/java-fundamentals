import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D08_String {

	public static void main(String[] args) {

		String str = "apple/banana/orange/kiwi";

		//split: ���ڿ��� �ش� ���ڱ������� �ڸ�
		String[] fruits = str.split("/"); 
		System.out.println(Arrays.toString(fruits));

		//join: ������ ���ڸ� �̿��Ͽ� �迭�� ��ħ
		System.out.println(String.join("-", fruits)); 

		//replace (replaceAll : �ش� ����ǥ���İ� ��ġ�ϴ� ���ڿ��� ��� ��ü)
		str = "abc@naver.com";
		str = str.replace("naver.com", "gmail.com");
		System.out.println(str);

		//format: ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�.
		str = String.format("%d�� %d�� %d.%d",1 ,2 ,3 ,1234);
		System.out.println(str);

		//contains: ���ڿ��� �ش� ���ڿ��� ���ԵǾ��ִ����� �˻��Ѵ�.
		str = "BOB";
		System.out.println(str.contains("bob"));
		System.out.println(str.toLowerCase().contains("bob"));

		//equalsIgnoreCase(): ��ҹ��ڿ� ������� ��ġ�ϴ��� �˻��Ѵ�.
		System.out.println("Apple".equalsIgnoreCase("aPPLE"));

		//startsWith / endsWith: ���ڿ��� �ش� ���ڿ��� ����/�������� �˻��Ѵ�.
		str = "image-fruit-apple.jpg";
		System.out.println(str.startsWith("image"));
		System.out.println(str.endsWith("jpg"));

		//getBytes: ���ڿ��� byteŸ�� �迭�� �����Ѵ�.
		str = "�ȳ��ϼ���"; 
		try {

			byte[] utf8_bytes = str.getBytes("UTF-8");
			byte[] euc_bytes = str.getBytes("EUC-KR");
			
			System.out.println(Arrays.toString(utf8_bytes));
			System.out.println(Arrays.toString(euc_bytes));

			System.out.println(new String(utf8_bytes));
			System.out.println(new String(euc_bytes));

		} catch (UnsupportedEncodingException e) {
			System.out.println("�������� �ʴ� �ڵ��Դϴ�.");
		}

		//getChars: char[]�� ���ڿ��� ���ϴ� 	�κ��� ����ش�.
		//str.getchars(��𼭺��� �ڸ�����, ������ �ڸ�����, ��� ��������, ������ ��������)
		str = "Hello, java python c-lang";

		char[] buffer = new char[10];
		str.getChars(7, 11, buffer, 0);
		System.out.println(buffer);

		//substring(begin, end): ���ڿ��� ���ϴ� �κ��� ���ڿ��� ��ȯ�Ѵ�.
		System.out.println(str.substring(10));
		System.out.println(str.substring(11, 15));

		//compareTo: Comparable �������̽� �޼���
		System.out.println("compare result: " + "car".compareTo("Jet"));

		//trim: ���ڿ� �ٱ����� ������ �����Ѵ�.
		str = "    good bye...     ";
		System.out.println(str.trim());
		System.out.println(str.trim().length());

		//valueOf: �ٸ� Ÿ���� ���� ���ڿ��� ��ȯ (�ش� ��ü�� toString ��� ��ȯ)
		String ott = String.valueOf(123);
		System.out.println(ott);

		//StringTokenizer: ���ڿ��� �ڸ��µ��� Ưȭ�� ���̽� (split�� ���� ����)
		str = "99/88/77/66/55/44/33/22/11";
		StringTokenizer st = new StringTokenizer(str, "/");
		System.out.println("Token ����: " + st.countTokens());
		//(�ڸ� �� ����ߴ� ���ڿ��� �ʿ��ϴٸ� ����° �Ķ���͸� true�� Ȱ��ȭ.)
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken()+ " ");
		}

		
	}

}
