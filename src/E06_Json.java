
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class E06_Json {

	//JSON : JavaScript에서 사용하는 Map타입
	//문자열만으로 Map을 간결하게 표현할 수 있어서 인기가 많다.
	//{Key:Value, Key:Value....} 의 형태를 가진다.

	//JASON Value에 사용되는 자바스크립트 타입들
	//'', "": String
	//숫자, 소수: Number
	//[]: Array  <=>  {}: JSON

	//Java에는 Json 타입을 지원하지 않기 때문에 데이터들을 'Json 형태'의 문자열로 만들어줘야 한다. (Parsing, Binding)

	public static void mapToJsonFile(Map<String, Object> map) throws IOException {

		StringBuilder str = new StringBuilder();
		str.append("{\n");	

		for (Map.Entry<String, Object> entry : map.entrySet()) {

			String key = entry.getKey();
			Object value = entry.getValue();

			str.append("\t\"" + key + "\":");

			if (value == null) {
				str.append("null");
			} else {
				if (value instanceof String) {
					str.append("'" + value + "', ");
				} else if (value instanceof Object[]) {
					Object[] arr = (Object[]) value;
					if (arr.length == 0) {
						str.append("[]\n");
					} else if (arr instanceof String[]) {
						str.append("[");
						for (Object obj : arr) {
							str.append("'"+ obj + "', ");
						}
						str.deleteCharAt(str.length()-1); str.deleteCharAt(str.length()-1);
						str.append("]\n");
					} else {
						str.append("[");
						for (Object obj : arr) {
							str.append(obj + ", ");
						}
						str.deleteCharAt(str.length()-1); str.deleteCharAt(str.length()-1);
						str.append("]");
					}	
				} else {
					str.append(value + ", ");
				} 	str.append("\n");
			}
		}
		str.deleteCharAt(str.length()-1); str.deleteCharAt(str.length()-1);
		str.append("\n}");
		System.out.println(str);

		FileWriter fw = new FileWriter("F:\\Java_IO\\data.json"); 
		fw.write(new String(str));
		fw.close(); 

		System.out.println("파일 쓰기 완료");

	}

	public static void mapFromJsonFile(Map<String, Object> map) throws IOException {

		FileReader fr = new FileReader("F:\\Java_IO\\data.json"); 
		StringBuilder str = new StringBuilder();

		int ch;
		while((ch = fr.read()) != -1) {		
			str.append((char)ch);	
		}

		fr.close();

		String newstr = new String (str);
		newstr = newstr.replace("{\n", "");
		newstr = newstr.replace("}", "");
		newstr = newstr.replace("\t", "");
		newstr = newstr.replace("\"", "");
		newstr = newstr.replace(" ", "");
		newstr.trim();	
		String[] mapArray = newstr.split("\n");

		for(Map.Entry<String, Object> entry : map.entrySet() ) {

			for (String Arraykey : mapArray) {

				String[] kv = Arraykey.split(":");

				if (kv[1].startsWith("'")) { //문자열

					kv[1] = kv[1].replace(",", "");
					kv[1] = kv[1].replace("'", "");
					map.put(kv[0], kv[1]);

				} else if (Pattern.matches("\\[.+\\]", kv[1])) { //배열(문자열)

					kv[1] = kv[1].replace("[", "");
					kv[1] = kv[1].replace("]", "");
					kv[1] = kv[1].replace("'", "");
					String[] kArray = kv[1].split(",");
					map.put(kv[0], kArray); 

				} else if (Pattern.matches("\\d+", kv[1])) { //숫자

					kv[1] = kv[1].replace(",", "");
					int a = Integer.parseInt(kv[1]);
					map.put(kv[0], a);

				} 
			}
		}

		System.out.println(((Object[])map.get("programming"))[0]);
		System.out.println(((Object[])map.get("programming"))[1]);
		System.out.println(((Object[])map.get("programming"))[2]);
		
		System.out.println(map);
	}

	
	public static void main(String[] args) throws IOException {

		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("grade", 8);

		String[] programming = new String[3];
		programming[0] = "JAVA";
		programming[1] = "Python";
		programming[2] = "JS";
		map.put("programming", programming);

		//Map을 String으로
		mapToJsonFile(map);

		//String을 Map으로
		mapFromJsonFile(map);

	}
}
