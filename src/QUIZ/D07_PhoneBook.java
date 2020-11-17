package QUIZ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class D07_PhoneBook {

	HashMap<String, HashMap<String, String>> phonebookmap;

	public D07_PhoneBook() {

		phonebookmap = new HashMap<>();

	}

	void addgroup(String groupName) { //���ο� �׷��� �߰��ϴ� �޼���	
		if(phonebookmap.containsKey(groupName)) {
			System.err.println("�̹� �����ϴ� �׷���Դϴ�.");
		}else {
			phonebookmap.put(groupName, new HashMap<>());	
			System.out.println("���ο� �׷� " + groupName+ "�� �߰��߽��ϴ�.");
		}
	}

	public boolean addphonenumber (String groupName, String phonenumber, String name) {
		//�����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���

		if(!phonebookmap.containsKey(groupName)) {
			System.err.println("�������� �ʴ� �׷���Դϴ�.");
			return false;
		}

		HashMap<String,String> group = phonebookmap.get(groupName);

		if(group.containsKey(phonenumber)) {
			System.out.println("�ش� ������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("���ο� ��ȣ "+ phonenumber + "�� �߰��߽��ϴ�.");
		}
		phonebookmap.get(groupName).put(phonenumber,name);
		return true;
	}


	private boolean str_contains(String check, String frag) {

		char[] chk = check.toCharArray();
		char[] frg = frag.toCharArray();
		
		char ch1 = frg[0];
		for (int i=0; i<chk.length; ++i) {

			if(chk[i] == ch1 && (chk.length-i) >= frg.length) { 

				int count = 0;
				for(int j=0; j<frg.length; ++j) {
					if (chk[i] == frg[j]) {
						++count;
					}else {
						break;
					}
				}
				if (count == frg.length) {
					return true;
				}
			}
		}
		return false;
	}


	public Set<List<String>> searchByName(String frag) {
		//�̸��� �Ϻ� ��ġ�ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���

		Set<List<String>> to_return = new HashSet<>();

		for (HashMap<String, String> groupMap : phonebookmap.values()) {
			for (String phoneNumber : groupMap.keySet()) {				

				String name = groupMap.get(phoneNumber);

				if (str_contains(name, frag)) {
					List<String> found = new ArrayList<>();
					found.add(phoneNumber);
					found.add(name);
					to_return.add(found);
				}
			}
		}
		return to_return;
	}

	public Set<List<String>> searchByPhoneNumber(String frag) {
		//��ȣ�� �Ϻ� ��ġ�ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
		Set<List<String>> to_return = new HashSet<>();

		for (HashMap<String, String> groupMap : phonebookmap.values()) {
			for (String phonenumber : groupMap.keySet()) {
				if (str_contains(phonenumber, frag)) {

					List<String> found = new ArrayList<>();
					found.add(phonenumber);
					found.add(groupMap.get(phonenumber));

					to_return.add(found);
				}
			}
		}
		return to_return;
	}


	void printAll() { //��ϵ� ��� ��ȭ��ȣ�� ����ϴ� �޼���

		for (String group: phonebookmap.keySet()) {
			System.out.println("------<" + group + ">------");	
			for (HashMap<String, String> groups : phonebookmap.values()) {
				for (String number : groups.keySet()) {
					System.out.println(groups.get(number) + ":" + number);
				}
			}
		}
	}





	public static void main(String[] args) {

		D07_PhoneBook phonebook1 = new D07_PhoneBook();

		phonebook1.addgroup("�б�");

		phonebook1.addphonenumber("�б�", "123", "ȫ�浿");
		phonebook1.addphonenumber("�б�", "133", "��浿");

		System.out.println(phonebook1.phonebookmap);

		boolean result = phonebook1.str_contains("010-1234-1234", "4");
		System.out.println(result);
		System.out.println(phonebook1.searchByName("��"));
		System.out.println(phonebook1.searchByPhoneNumber("23"));


	}
}
