import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {

	//���� ǥ���� (regex = Regular Expression)
	//���ڿ��� ����/������ ǥ���ϴ� ��� (�ش� ���ϰ� ��ġ�ϴ� ���ڿ��� �˻��� �� �ִ�.)
	
	public static void main(String[] args) {
		
//		String str = "abc@naver.com";
//		if(str.contains("@") && str.contains(".")) {
//			System.out.println("�̸����Դϴ�");	
//		}else {
//			System.out.println("�̸����� �ƴմϴ�");
//		}
		
		//Matcher Ŭ���� (true/false) regex
		//Pattern.matches("�� �����ϴ� ����", "sleep")
		//[]���ο��� �� ��ġ�� � ���ڰ� �� �� �ִ��� ��Ÿ��. 
		
		//ex.
		System.out.println(Pattern.matches("sleep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep")); 
		//-> l�� �͵� �ǰ� h�� �͵� ��.
			
		//�� []���ο� ����
		//1. abc: abc�� ��� <->  ^abc: abc�� ������ ��� ���
		//2. a-z��-�R: a���� z����,��-�R ��� <->  ^1-9: 1~9�� ���� ��.
		//3. a-zA-Z: a~z, A~Z
		//4. ������ a-c && c-f : c�� 	
		
		//�� ���� ���ڸ� �����ϰ� ǥ��
		//1. . : ��� ���� ��� => []�ۿ� �����!(����)
		System.out.println(Pattern.matches(".....", "abcde"));
		//2. \\d: ��� ���� ���
		//3. \\D: ���ڸ� ������ ��� ���� ���
		//4. \\s: ���� ��� [\t\n...���� ��� �����]
		//5. \\S: ������ ������ ��� ���� ���
		//6. \\w: �Ϲ����� ���ڵ��� ��� [a-zA-Z_0-9]
		//7. \\W: �Ϲ����� ���ڵ��� ���� [a-zA-Z_0-9]
		
		//�� ������ ������ ���� (������ �������)
		//1. ����: {n��}
		//2. �ּ� �ִ�: {n�� �̻�,m�� ����}
		//3. �ּ�: {n���̻�,}
		//4. a�� 0���̳� 1��: [a]?
		//5. 1�� �̻�: +
		//6. 0���̳� ������: *
		
		String email = "abc@gmail.com";
		System.out.println("�̸��� ����: " + Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email));
			

		//Pattern Ŭ����
		//���� ǥ������ �ٷ�� Ŭ����
		//Pattern.compile("�� �����ϴ� ����"); 
		//������ ����ǥ������ �̿��� ������ �ν��Ͻ��� ��ȯ�Ѵ�.
		
		Pattern email_regex = Pattern.compile("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+");
		Pattern split_regex = Pattern.compile("/");
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		
		//������ Pattern �ν��Ͻ��� split �ϱ�
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		//������ Pattern �ν��Ͻ��� matcher �����ϱ�
		//:���ڿ��� ó������ ������ �˻��ϸ鼭 ����ǥ���İ� ��ġ�ϴ� �ε��� ã����
		Matcher matcher = split_regex.matcher("apple/banana/orange/kiwi");	
		while (matcher.find()) {
		System.out.print(matcher.start()+ " to " + matcher.end());
		System.out.println(" ã�� ��: " + matcher.group());
		}
		
		Matcher fruit_matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		while (fruit_matcher.find()) {
		System.out.print(fruit_matcher.start()+ " to " + fruit_matcher.end());
		System.out.println(" ã�� ��: " + fruit_matcher.group());
		}
	}
}
