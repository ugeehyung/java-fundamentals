import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E01_JavaIO {

	// �� Java I/O (Input and Output) => Java IO Ŭ�������� �ʼ������� ó���ؾ��ϴ� ���ܰ� �����Ѵ�.
	//�ڹٴ� '��Ʈ��(Stream)'�� �̿��� ������� �ٷ��.
	//�츮 ���α׷����� ������ ��� ������ : �Է�(Input)
	//���α׷��� �����ؼ� �������� ��� ������ : ���(Output)

	// �� Stream = �����͵��� ������ ��� (�Է� ���: InputStream, ��� ���: OutputStream)
	//�����Ͱ� stream�� ���� �̵��� ���� �����͸� 0�� 1�� ��ȯ�Ͽ� �����Ѵ�.
	
	// �� InputStream Ŭ������ ���� �޼���
	// int read() : ���� �� ����Ʈ �о�´�. EOF(End Of File)�� �����ϸ� -1�� ��ȯ
	// int read(byte[])
	// int read(byte[], off, len) 
	// close() : ��Ʈ���� �ݴ´� (�޸� ����)
	// -> FileInputStream : ���Ϸ� �Է� InputStream

	// �� OutputStream Ŭ������ ���� �޼���
	// write(int)
	// write(byte[])
	// flush : ��Ƴ��� �����͸� �����Ѵ�.
	// close : ��Ʈ���� ����Ѵ� (�ݴ´�, �޸� ����).
	// -> FileOutputStream : ���� ��� OutputStream
	
	// �� FileInputStream, FileOutputStream�� �����͸� �ڵ�� �о���� ������ 
	// ���α׷��Ӱ� ���� ���·� �������ϴ� ������ �ʿ��ϴ�.

	public static void main(String[] args) {

		try {
 
			FileOutputStream fout = new FileOutputStream("F:\\Java_IO\\testout.txt");

			//1. int 
			fout.write(65);

			//2. byte[] 
			byte[] data = "ABCDEFGHIJKLMNOP".getBytes();
			fout.write(data);
			fout.close(); // Java IO�� ��Ʈ������ �޸𸮸� gc�� �������� ����. �� �� ��Ʈ���� �ݵ�� ����־�� �Ѵ�! 

		} catch (FileNotFoundException e) {
			System.err.println("������ ��ã�ҽ��ϴ�.");
		} catch (IOException e) {
			System.err.println("���ٰ� ���� ���� �߻�");
		}


		try {
			
			FileInputStream fin = new FileInputStream("F:\\Java_IO\\testout.txt");

			System.out.println((char)fin.read());
			System.out.println((char)fin.read());
			System.out.println((char)fin.read());
			System.out.println((char)fin.read());
			System.out.println((char)fin.read()); 

			byte[] bytes = new byte[100];
			int ch;
			int index = 0;

			while ((ch = fin.read())!= -1) { //(ch = fin.read()) = -1�� �Ǹ� �� �о���
				bytes[index++] = (byte)ch;
			}
			
			System.out.println("byte[]�� ����� ����: " + Arrays.toString(bytes));
			System.out.println(new String(bytes));
			fin.close();

		} catch (FileNotFoundException e) {
			System.err.println("������ ��ã�ҽ��ϴ�.");
		} catch (IOException e) {
			System.err.println("�дٰ� ���� ���� �߻�");
		}	
	}
}
