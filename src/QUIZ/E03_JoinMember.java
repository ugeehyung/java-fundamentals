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

	// 1. ����ڰ� �ڽ��� �������� ������ �Է��ϸ� �� ������ ������� �̸����� �� ���Ͽ� �����غ�����

	// 2. ������� �̸��� ���޹����� �ش� ����ڰ� 
	//	  (1) ���Ե� ȸ���̶�� ���Ͽ��� ������ �о� ���
	//	  (2) ���� ���Ե��� ���� ����̶�� ���Ե��� �ʾҴٰ� ������ִ� �޼��带 �ۼ��غ����� 

	// 3. ����� ������� ������ ������ �� �ִ� �޼��带 �����غ�����  
	//	update_info �� �������� ���� ���׸� �����ǵ���

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
			System.out.printf("<< '%s'���� ����>>\n", data[0]);
			System.out.println("�̸� : " 	+ data[0]);
			System.out.println("���� : " 	+ data[1]);
			System.out.println("������ : " + data[2]);
			System.out.println("Tel : " + data[3]);

			return true;

		} catch (FileNotFoundException e) {
			System.out.println("���ԵǾ����� �ʽ��ϴ�. ȸ�������� ���ּ���.");
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

		//�����ϱ�
		Member update_info = new Member("123", -1, "z", null);
		update(update_info);
		

		try {
			// InputStreamReader : InputStream�� ���ڷ� ��ȯ (byte -> char)
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("�̸� > ");
			String name = br.readLine();

			if (checkMember(name) == false) {
				System.out.print("���� > ");
				int age = Integer.parseInt(br.readLine());

				System.out.print("������ > ");
				String blood_type = br.readLine();

				System.out.print("��ȭ��ȣ > ");
				String tel = br.readLine();

				save(new Member(name, age, blood_type, tel));

				br.close();
			} 

		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}

