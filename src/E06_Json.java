
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class E06_Json {

	//JSON : JavaScript���� ����ϴ� MapŸ��
	//���ڿ������� Map�� �����ϰ� ǥ���� �� �־ �αⰡ ����.
	//{Key:Value, Key:Value....} �� ���¸� ������.

	//JASON Value�� ���Ǵ� �ڹٽ�ũ��Ʈ Ÿ�Ե�
	//'', "": String
	//����, �Ҽ�: Number
	//[]: Array  <=>  {}: JSON

	//Java���� Json Ÿ���� �������� �ʱ� ������ �����͵��� 'Json ����'�� ���ڿ��� �������� �Ѵ�. (Parsing, Binding)

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

		System.out.println("���� ���� �Ϸ�");

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

				if (kv[1].startsWith("'")) { //���ڿ�

					kv[1] = kv[1].replace(",", "");
					kv[1] = kv[1].replace("'", "");
					map.put(kv[0], kv[1]);

				} else if (Pattern.matches("\\[.+\\]", kv[1])) { //�迭(���ڿ�)

					kv[1] = kv[1].replace("[", "");
					kv[1] = kv[1].replace("]", "");
					kv[1] = kv[1].replace("'", "");
					String[] kArray = kv[1].split(",");
					map.put(kv[0], kArray); 

				} else if (Pattern.matches("\\d+", kv[1])) { //����

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
		map.put("name", "ȫ�浿");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("grade", 8);

		String[] programming = new String[3];
		programming[0] = "JAVA";
		programming[1] = "Python";
		programming[2] = "JS";
		map.put("programming", programming);

		//Map�� String����
		mapToJsonFile(map);

		//String�� Map����
		mapFromJsonFile(map);

	}
}
