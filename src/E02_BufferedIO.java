import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class E02_BufferedIO {

	// �� Buffered IO : ���۸� �̿��� �б�/���� ������ ����Ű�� Ŭ����
	// buffer = �����͸� ��/����ϱ� ���� �ӽ÷� �����صδ� �迭

	// �� ���۸� �̿��ؾ� �ϴ� ���� : ���۾��� �б�/���⸦ �ϰ� �Ǹ� ������� �ʹ� ���� �Ͼ��.
	// ex) Java programming�� ���� ����:
	//- �⺻ OutputStream���� �� ���ھ� ���� 16���� ����� �߻��Ѵ�.
	//- �迭�� �����س��� �ѹ��� ���� �ѹ��� ��¸����� ����� ����.

	public static void main(String[] args) {

		StringBuilder text = new StringBuilder();

		for (int i=0; i<10000; ++i) {
			text.append(i + "\t�ȳ��ϼ���\n");
		}

		// �� java.io.BufferedOutputStream
		
		try {

			FileOutputStream fout = new FileOutputStream("F:\\Java_IO\\bufferedout.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);		

			//�����ڿ� OutputStream�� �䱸�Ѵ�.
			//OutputStream�� ����� ��Ҹ� �����ϴ� �뵵�� ���
			//BufferedOutputStream�� ���� ���׷��̵��� �뵵�� ���
				
			// �� ������ ũ�Ⱑ 1024�� ���
			//�����͸� �ش� OutputStream�� �� �� 1024����Ʈ�� �����Ͱ� �� ���̸� ����Ѵ�.
			//Ȥ�� ���α׷��Ӱ� flush()�޼��带 ȣ���� �� ����Ѵ�.
			//Ȥ�� close�� �߻��ϸ� ���� ���� �����͸� ����Ѵ�.

			//batch processing (�ϰ�ó��)
			byte[] data = new String(text).getBytes();

			for (byte b : data) {
				bout.write(b);
			}
			
//			bout.flush();
			bout.close();
			fout.close();

		} catch (FileNotFoundException e) {
			System.err.println("���� ���� �߻�");
		} catch (IOException e) {
			System.err.println("IO ���� �߻�");
		}

		// �� java.io.BufferedInputStream
		
		try {

			FileInputStream fin = new FileInputStream("F:\\Java_IO\\bufferedout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin,1024);

			//�� read()�� �⺻ �����ε� : �� ����Ʈ�� int������ �о�´�.
			
			//�� read(byte[]) �����ε� : ������ byte[]�� ũ�⸸ŭ byte�� ä���ش�.
			//������ �迭�� �� byte�� ä������ ��ȯ�Ѵ�. (len)
			
			//�� read(byte[], off, len) 
			//������ byte[] �߿��� off���� len������ �����͸� ä���ش�.
			//������ �迭�� �� byte�� ä������ ��ȯ�Ѵ�.
			
			byte[] buff = new byte[1024];
			
			int len;
			int count = 0;
			while ((len = bin.read(buff)) != -1) {
				System.out.println(new String(buff, 0, len));
				System.out.println(count++ +"��° �б�");
			}

			int b;
			while((b=bin.read())!= -1) {
				System.out.println((char)b);
			}
					
			bin.close();
			fin.close();

		} catch (FileNotFoundException e) {
			System.err.println("���� ���� �߻�");
		} catch (IOException e) {
			System.err.println("IO ���� �߻�");
		}
		
		// �� abstract class writer
		//���Ͽ� ���ڸ� ������ �� charset�� ������ �� �ִ�.
		//���α׷��Ӱ� �� �� ���ϰ� OutputStream�� �̿��� �� �ִ�.
		
		try {
			
			FileOutputStream fout = new FileOutputStream("F:\\Java_IO\\bufferedout.txt"); 
			
			OutputStreamWriter ow = new OutputStreamWriter(fout, "UTF-8"); //OutputStream => Writer (byte -> char)
			
			FileWriter fw = new FileWriter("F\\Java_IO\\bufferedout.txt", Charset.forName("UTF-8"));
			
			BufferedWriter bw = new BufferedWriter(ow, 4096); //�������
			
			PrintWriter pw = new PrintWriter(bw); //���α׷��ӿ��� ���� print�޼��� �̿�

			for (int i = 0; i < 10000; i++) {
				pw.printf("%d�� %d�� %d�� %d��\n�ȳ��ϼ���\n", 1,2,3,4); //�ֿܼ� ����ϴ� ���� ���Ͽ� ����� �� �ִ�.
			}

			pw.close();
			pw.close();
			ow.close();
			fout.close();
			
		} catch (FileNotFoundException e ) {
			System.out.println("���� ���� �߻�");
		} catch (UnsupportedEncodingException e) {
			System.out.println("���ڵ� ���� �߻�");
		} catch (IOException e) {
			System.out.println("IO ���� �߻�");
		}	
	}
}
