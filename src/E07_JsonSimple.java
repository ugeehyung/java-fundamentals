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

	//maven repo 검색
	//외부 라이브러리 추가방법: Build path -> Configure BuildPath -> Lib Tab -> Add ExternalJAR

	public static void main(String[] args) {

		JSONObject obj = new JSONObject(); //map처럼 데이터를 추가한다.

		//JSON 배열: ArrayList 사용
		ArrayList<String> hobbies = new ArrayList<String>();
		
		hobbies.add("programming"); 
		hobbies.add("soccer");
		hobbies.add("billiard");
		
		obj.put("car", "BMW");
		obj.put("addr", "금천구");
		obj.put("age", 27);
		obj.put("hobbies", hobbies);

		//System.out.println(obj); toString이 구현되어 있다
		String jsonStr = obj.toString(); System.out.println(jsonStr);
				
			JSONParser parser = new JSONParser();		
			
			try {		
				
				JSONObject obj2 = (JSONObject) parser.parse(new FileReader(
						"F:\\Java_IO\\data.json", 
						Charset.forName("UTF-8")
				));
				
				System.out.println(obj2.get("win"));
				System.out.println(obj2.get("무"));
				System.out.println(obj2.get("패"));
				System.out.println(obj2.get("lotto"));

				JSONArray programs = (JSONArray) (obj2.get("programming"));
				
				for (Object hobby : hobbies) {
					System.out.println(hobby);
				}
				
				JSONObject minsu = (JSONObject) obj2.get("민수");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
				
	}
}
