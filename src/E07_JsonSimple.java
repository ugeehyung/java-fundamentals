import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class E07_JsonSimple {

	//maven repo �˻�
	//�ܺ� ���̺귯�� �߰����: Build path -> Configure BuildPath -> Lib Tab -> Add ExternalJAR

	public static void main(String[] args) {

		JSONObject obj = new JSONObject(); //mapó�� �����͸� �߰��Ѵ�.

		//JSON �迭: ArrayList ���
		ArrayList<String> hobbies = new ArrayList<String>();
		
		hobbies.add("programming"); 
		hobbies.add("soccer");
		hobbies.add("billiard");
		
		obj.put("car", "BMW");
		obj.put("addr", "��õ��");
		obj.put("age", 27);
		obj.put("hobbies", hobbies);

		//System.out.println(obj); toString�� �����Ǿ� �ִ�
		String jsonStr = obj.toString(); System.out.println(jsonStr);
				
			JSONParser parser = new JSONParser();		
			
			try {		
				
				JSONObject obj2 = (JSONObject) parser.parse(new FileReader(
						"F:\\Java_IO\\data.json", 
						Charset.forName("UTF-8")
				));
				
				System.out.println(obj2.get("win"));
				System.out.println(obj2.get("��"));
				System.out.println(obj2.get("��"));
				System.out.println(obj2.get("lotto"));

				JSONArray programs = (JSONArray) (obj2.get("programming"));
				
				for (Object hobby : hobbies) {
					System.out.println(hobby);
				}
				
				JSONObject minsu = (JSONObject) obj2.get("�μ�");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
				
	}
}
