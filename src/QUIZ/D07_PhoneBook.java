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

	void addgroup(String groupName) { //새로운 그룹을 추가하는 메서드	
		if(phonebookmap.containsKey(groupName)) {
			System.err.println("이미 존재하는 그룹명입니다.");
		}else {
			phonebookmap.put(groupName, new HashMap<>());	
			System.out.println("새로운 그룹 " + groupName+ "를 추가했습니다.");
		}
	}

	public boolean addphonenumber (String groupName, String phonenumber, String name) {
		//존재하는 그룹에 새로운 전화번호를 등록하는 메서드

		if(!phonebookmap.containsKey(groupName)) {
			System.err.println("존재하지 않는 그룹명입니다.");
			return false;
		}

		HashMap<String,String> group = phonebookmap.get(groupName);

		if(group.containsKey(phonenumber)) {
			System.out.println("해당 정보가 수정되었습니다.");
		}else {
			System.out.println("새로운 번호 "+ phonenumber + "를 추가했습니다.");
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
		//이름이 일부 일치하면 일치하는 모든 전화번호가 출력되는 메서드

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
		//번호가 일부 일치하면 일치하는 모든 전화번호가 출력되는 메서드
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


	void printAll() { //등록된 모든 전화번호를 출력하는 메서드

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

		phonebook1.addgroup("학교");

		phonebook1.addphonenumber("학교", "123", "홍길동");
		phonebook1.addphonenumber("학교", "133", "김길동");

		System.out.println(phonebook1.phonebookmap);

		boolean result = phonebook1.str_contains("010-1234-1234", "4");
		System.out.println(result);
		System.out.println(phonebook1.searchByName("동"));
		System.out.println(phonebook1.searchByPhoneNumber("23"));


	}
}
