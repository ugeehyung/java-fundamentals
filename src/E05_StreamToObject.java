import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class E05_StreamToObject {

	static class Apple implements Serializable { 
		
		//Seriralizable(����ȭ) : �ش� ��ü�� ����ȭ ������ ��ü�� �����. (�����͸� ���������� ��ȯ)

		private static final long serialVersionUTD = 1L;	

		int size;
		String color;
		String local;

		public Apple(int size, String color, String local) {

			this.size = size;
			this.color = color;
			this.local = local;

		}

		public String toString() {
			
			return size + "/" + color + "/" + local;

		}
	}


	public static void main(String[] args) {

		//AutoClose�� ������ Ŭ�������� try-with-resources�� �̿��� �� �ִ�.

		try (FileOutputStream fout = new FileOutputStream("F:\\Java_IO\\objectout.txt"); 
				BufferedOutputStream bout = new BufferedOutputStream(fout);
				ObjectOutputStream oout = new ObjectOutputStream(bout);) { 

			oout.writeObject(new Apple(9, "��Ȳ", "�뱸"));
			oout.writeInt(12345);
			oout.writeObject(new Apple(10, "����", "ȫ��"));
			oout.writeObject(new Apple(11, "���", "�λ�"));

			System.out.println("���� �Ϸ�");

		} 

		catch (Exception e) {
			e.printStackTrace();
		}	

		try (
				FileInputStream fin = new FileInputStream("F:\\Java_IO\\objectout.txt");
				BufferedInputStream bin = new BufferedInputStream(fin);
				ObjectInputStream oin = new ObjectInputStream(bin);)
		{
			
			System.out.println("���Ͽ��� �о�� ��ü");
			System.out.println(oin.readObject()); 
			System.out.println(oin.readInt()); //DataInputStream
			System.out.println(oin.readObject());
			System.out.println(oin.readObject());
			
		} catch (Exception e) {

		}
	}
}
