import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E04_StreamToPrimitive {

	//※ Stream 데이터를 기본형으로 변환 : DataInputStream/DataOutputStream
	
	public static void main(String[] args) {
		
		try {
			
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream
					(new FileOutputStream("F:\\Java_IO\\dataout.txt"),2048));
			
			out.writeInt(123);
			out.writeBoolean(true);
			out.writeFloat(123.123f);
			out.writeDouble(432.4321);
			out.writeLong(1234567L);
			out.writeUTF("한글입니다.");
			
			out.close();
			System.out.println("파일 출력 완료");
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {

		}
		
		try { 
			
			DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("F:\\Java_IO\\dataout.txt")));
			
			int data0 = in.readInt();
			boolean data1 = in.readBoolean();
			float data2 = in.readFloat();
			double data3 = in.readDouble();
			long data4 = in.readLong();
			String data5 = in.readUTF();
			
			System.out.println("data0: " + data0);
			System.out.println("data0: " + data1);
			System.out.println("data0: " + data2);
			System.out.println("data0: " + data3);
			System.out.println("data0: " + data4);
			System.out.println("data0: " + data5);
			
		} catch (IOException e) {
			
		}
	}
}
