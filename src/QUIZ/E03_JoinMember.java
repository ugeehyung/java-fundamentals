package QUIZ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class E03_JoinMember {

	// 1. 사용자가 자신의 여러가지 정보를 입력하면 그 정보를 사용자의 이름으로 된 파일에 저장해보세요

	// 2. 사용자의 이름을 전달받으면 해당 사용자가 
	//	  (1) 가입된 회원이라면 파일에서 정보를 읽어 출력
	//	  (2) 아직 가입되지 않은 사람이라면 가입되지 않았다고 출력해주는 메서드를 작성해보세요 

	// 3. 저장된 사용자의 정보를 수정할 수 있는 메서드를 구현해보세요  
	//	update_info 에 혈액형만 오면 혈액명만 수정되도록

	static class Member {

		String name;
		int age;
		String blood_type;
		String tel;

		public Member(String name, int age, String blood_type, String tel) {
			this.name = name;
			this.age = age;
			this.blood_type = blood_type;
			this.tel = tel;		
		}		

		public Member update(Member update_info) {

			return new Member(update_info.name == null ? this.name : update_info.name,
					update_info.age == -1 ? this.age : update_info.age,
							update_info.blood_type == null ? this.blood_type : update_info.blood_type,
									update_info.tel == null ? this.tel : update_info.tel);
		}

		@Override
		public String toString() {		
			return String.format("%s/%d/%s/%s", name, age, blood_type, tel);
		}
	} 	

	public static boolean checkMember(String name) throws IOException {

		String dir = "F:\\Java_IO\\";
		String filename = name + ".txt";
		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader(dir + filename, Charset.forName("UTF-8")));

			String[] data = br.readLine().split("/");
			System.out.printf("<< '%s'님의 정보>>\n", data[0]);
			System.out.println("이름 : " 	+ data[0]);
			System.out.println("나이 : " 	+ data[1]);
			System.out.println("혈액형 : " + data[2]);
			System.out.println("Tel : " + data[3]);

			return true;

		} catch (FileNotFoundException e) {
			System.out.println("가입되어있지 않습니다. 회원가입을 해주세요.");
			return false;
		} finally {
			if (br!=null) br.close();	
		}	
	}

	public static void save(Member info) throws IOException {		

		String dir = "F:\\Java_IO\\";
		String filename = info.name + ".txt";

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(dir + filename, Charset.forName("UTF-8"))));

		pw.print(info);
		pw.close();
	}

	public static void update(Member update_info) throws IOException {

		String dir = "F:\\Java_IO\\";
		String filename = update_info.name + ".txt";

		PrintWriter pw = null;
		BufferedReader br = null;

		try {

			br = new BufferedReader (new FileReader(dir + filename, Charset.forName("UTF-8")));
			String[] data = br.readLine().split("/");

			Member before = new Member(data[0], Integer.parseInt(data[1]), data[2], data[3]);
			Member after = before.update(update_info);

			pw = new PrintWriter(new BufferedWriter(new FileWriter(dir + filename, Charset.forName("UTF-8"))));
			pw.print(after);

		} finally {
			if (br!=null) br.close();
			if (pw!=null) pw.close();
		}
	}

	public static void main(String[] args) throws IOException {

		//수정하기
		Member update_info = new Member("123", -1, "z", null);
		update(update_info);
		

		try {
			// InputStreamReader : InputStream을 문자로 변환 (byte -> char)
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("이름 > ");
			String name = br.readLine();

			if (checkMember(name) == false) {
				System.out.print("나이 > ");
				int age = Integer.parseInt(br.readLine());

				System.out.print("혈액형 > ");
				String blood_type = br.readLine();

				System.out.print("전화번호 > ");
				String tel = br.readLine();

				save(new Member(name, age, blood_type, tel));

				br.close();
			} 

		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}

