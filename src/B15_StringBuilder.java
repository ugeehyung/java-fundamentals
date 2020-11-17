
public class B15_StringBuilder {

	public static void main(String[] args) {
		
		//StringBuilder는 +=대신 append()함수를 통해 문자열을 만든다.
		//String str = "hello";
		//str += ", world";

		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		//다 만들고 난 뒤에는 String으로 변환해서 사용하면 된다.
		String build = str.toString();
		System.out.println(build);

		StringBuilder[] builders = new StringBuilder[10];
		builders[1] = new StringBuilder();
		builders[2].append(str.charAt(0));
		
	}

}
