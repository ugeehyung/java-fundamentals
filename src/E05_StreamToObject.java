import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class E05_StreamToObject {

	static class Apple implements Serializable { 
		
		//Seriralizable(직렬화) : 해당 객체를 직렬화 가능한 객체로 만든다. (데이터를 이진법으로 변환)

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

		//AutoClose가 구현된 클래스들은 try-with-resources를 이용할 수 있다.

		try (FileOutputStream fout = new FileOutputStream("F:\\Java_IO\\objectout.txt"); 
				BufferedOutputStream bout = new BufferedOutputStream(fout);
				ObjectOutputStream oout = new ObjectOutputStream(bout);) { 

			oout.writeObject(new Apple(9, "주황", "대구"));
			oout.writeInt(12345);
			oout.writeObject(new Apple(10, "빨강", "홍콩"));
			oout.writeObject(new Apple(11, "노랑", "부산"));

			System.out.println("쓰기 완료");

		} 

		catch (Exception e) {
			e.printStackTrace();
		}	

		try (
				FileInputStream fin = new FileInputStream("F:\\Java_IO\\objectout.txt");
				BufferedInputStream bin = new BufferedInputStream(fin);
				ObjectInputStream oin = new ObjectInputStream(bin);)
		{
			
			System.out.println("파일에서 읽어온 객체");
			System.out.println(oin.readObject()); 
			System.out.println(oin.readInt()); //DataInputStream
			System.out.println(oin.readObject());
			System.out.println(oin.readObject());
			
		} catch (Exception e) {

		}
	}
}
