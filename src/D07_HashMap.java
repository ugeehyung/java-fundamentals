import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class D07_HashMap {

	//Map
	//key/value�� �� ��Ʈ�� �̷�� �ڷᱸ��
	//key���� ���� value�� ã�� �ڷᱸ��
	//key�� �ߺ��� ������� �ʴ´�.
	
	//HashMap
	
	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<>();
		
		//put�޼��带 �̿��� �����͸� �����Ѵ�.
		//key�� �ش� �������� ī�װ�(�Ӽ�, property, attribute)�� �ǹ��Ѵ�.
		//value�� �ش� �׸��� ���� �����Ѵ�.
		map1.put("�̸�", "������");
		map1.put("�̸�", "��ö��");
		map1.put("����", "5��");
		map1.put("����", "���޶�Ͼ�");
		map1.put("������ ����", "5��");
		
		//get�޼��忡 key���� ������ ���ϴ� �׸��� ���� ������.
		System.out.println(map1.get("����"));
		
		//�ݺ������� Map Ȱ���ϱ�
		//keySet: key��� �̷���� Set�� ��ȯ�Ѵ�.
		//values: value�� �̷���� Collection�� ��ȯ�Ѵ�. 
		//entrySet: Entry<K,V>��� �̷���� Set�� ��ȯ�Ѵ�.
		
		System.out.println("map1�� key��: " + map1.keySet());
		System.out.println("map1�� value��: " + map1.values());
		System.out.println("map1�� entry��: " + map1.entrySet());
		
		//keySet���� ������
		//key�� value�� ã�� �� �ִ�. (get����)
		for(String key : map1.keySet()) {
			System.out.println(key + "-" + map1.get(key));
		}
		
		//values�� ������
		//value�� key�� ã�� ���� �Ұ����ϴ�. (�ߺ��� ��찡 ����)
		for(String value : map1.values()) {
			System.out.println(value);
		}
		
		//entrySet���� ������
		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("TEST1", "90��");
			
		//containsKey - true/false
		System.out.println(map1.containsKey("������ ����"));
		System.out.println(map1.containsKey("������ ���� "));
		
		//containsValue - true/false
		System.out.println(map1.containsValue("5��"));
		
		//putAll �� �ٸ� map�� �����͸� �߰��� �� �ִ�.
		map1.putAll(map2);
		System.out.println(map1);
		
		//remove �� ���ϴ� �����͸� ���� �� �ִ�.
		System.out.println(map1.remove("����", "6��")); //=>��������
		System.out.println(map1);
		System.out.println(map1.remove("����", "5��"));
		System.out.println(map1);

		System.out.println(map1.size());	
		
		//get�޼��带 ����ϴٰ� ������/Ű�� ���� ��� null�� ��ȯ�Ǿ� NullPointerException �߻�
		System.out.println(map1.get("������ �̸�")); // = null
		System.out.println(map1.get("������ ����")); // = null
		
		//getOrDefault �޼��带 ���� null���� ��ȯ�Ǵ� ��Ȳ�̶�� �⺻�� ��ȯ
		System.out.println(map1.getOrDefault("������ �̸�", "�⺻��")); // = null	
			
		//MapŸ�� ���ο� MapŸ�� �ֱ�
		HashMap<String, HashMap<String, String>> phonebook = new HashMap<>();
		
		//���ο� �ؽ��� �ν��Ͻ��� ������ �����ϸ�, Ű������ �ش� �ؽ����� ���� �� �ְ� �ȴ�.
		phonebook.put("�п�", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("����б�", new HashMap<>());
		phonebook.put("���б�", new HashMap<>());
		phonebook.put("���Ƹ�", new HashMap<>());
				
		HashMap<String, String> group = phonebook.get("�п�");

		//Ű������ ��ȭ��ȣ(�ߺ��� ����)
		group.put("010-1234-1234", "�踻��");
		group.put("010-1234-5678", "�踻��");
		
		System.out.println(phonebook);
			
			
	}
	
}
