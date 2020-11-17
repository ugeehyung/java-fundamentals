import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class D07_HashMap {

	//Map
	//key/value가 한 세트를 이루는 자료구조
	//key값을 통해 value를 찾는 자료구조
	//key는 중복을 허용하지 않는다.
	
	//HashMap
	
	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<>();
		
		//put메서드를 이요해 데이터를 저장한다.
		//key는 해당 데이터의 카테고리(속성, property, attribute)을 의미한다.
		//value는 해당 항목의 값을 저장한다.
		map1.put("이름", "꼬맹이");
		map1.put("이름", "김철수");
		map1.put("나이", "5살");
		map1.put("견종", "포메라니안");
		map1.put("주인의 나이", "5살");
		
		//get메서드에 key값을 전달해 원하는 항목의 값을 꺼낸다.
		System.out.println(map1.get("견종"));
		
		//반복문으로 Map 활용하기
		//keySet: key들로 이루어진 Set을 반환한다.
		//values: value로 이루어진 Collection을 반환한다. 
		//entrySet: Entry<K,V>들로 이루어진 Set을 반환한다.
		
		System.out.println("map1의 key들: " + map1.keySet());
		System.out.println("map1의 value들: " + map1.values());
		System.out.println("map1의 entry들: " + map1.entrySet());
		
		//keySet으로 돌리기
		//key로 value를 찾을 수 있다. (get으로)
		for(String key : map1.keySet()) {
			System.out.println(key + "-" + map1.get(key));
		}
		
		//values로 돌리기
		//value로 key를 찾는 것은 불가능하다. (중복될 경우가 있음)
		for(String value : map1.values()) {
			System.out.println(value);
		}
		
		//entrySet으로 돌리기
		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("TEST1", "90점");
			
		//containsKey - true/false
		System.out.println(map1.containsKey("주인의 나이"));
		System.out.println(map1.containsKey("주인의 나이 "));
		
		//containsValue - true/false
		System.out.println(map1.containsValue("5살"));
		
		//putAll 로 다른 map의 데이터를 추가할 수 있다.
		map1.putAll(map2);
		System.out.println(map1);
		
		//remove 로 원하는 데이터를 지울 수 있다.
		System.out.println(map1.remove("나이", "6살")); //=>안지워짐
		System.out.println(map1);
		System.out.println(map1.remove("나이", "5살"));
		System.out.println(map1);

		System.out.println(map1.size());	
		
		//get메서드를 사용하다가 데이터/키가 없는 경우 null이 반환되어 NullPointerException 발생
		System.out.println(map1.get("엄마의 이름")); // = null
		System.out.println(map1.get("엄마의 견종")); // = null
		
		//getOrDefault 메서드를 통해 null값이 반환되는 상황이라면 기본값 반환
		System.out.println(map1.getOrDefault("엄마의 이름", "기본값")); // = null	
			
		//Map타입 내부에 Map타입 넣기
		HashMap<String, HashMap<String, String>> phonebook = new HashMap<>();
		
		//새로운 해쉬맵 인스턴스를 값으로 저장하면, 키값으로 해당 해쉬맵을 꺼낼 수 있게 된다.
		phonebook.put("학원", new HashMap<>());
		phonebook.put("가족", new HashMap<>());
		phonebook.put("고등학교", new HashMap<>());
		phonebook.put("중학교", new HashMap<>());
		phonebook.put("동아리", new HashMap<>());
				
		HashMap<String, String> group = phonebook.get("학원");

		//키값으로 전화번호(중복이 없다)
		group.put("010-1234-1234", "김말숙");
		group.put("010-1234-5678", "김말숙");
		
		System.out.println(phonebook);
			
			
	}
	
}
