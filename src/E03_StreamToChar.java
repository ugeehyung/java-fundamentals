import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class E03_StreamToChar {

	//Reader/Writer�� ���� Ŭ���� : Stream���� ���� �����͸� ���ڷ� ��ȯ 	
	//���α׷��Ӱ� �����͸� ���ڷ� ���ϰ� �ٷ�� ���� ��
	//InputStream/OutputStream -> Reader/Writer Ŭ������ �ѹ� �� ���μ� ����Ѵ�. 

	public static void main(String[] args) {

		// �� abstract class Reader : Reader ��ӹ޾� ������ Ŭ������
		// ex. Buffered Reader, InputStreamReader, FileReader ���...
		//Stream���� ���� �����͸� ���ڷ� �籸���Ͽ� ���α׷��ӿ��� �����Ѵ�.
		//�ڵ� �����͸� ���ڷ� �籸���� ��, ����� charset�� �˸°� �������ϸ� ����.
		
		try {
			
			FileReader fr = new FileReader("F:\\Java_IO\\bufferedout.txt", Charset.forName("UTF-8"));
			
			FileInputStream fin = new FileInputStream("F:\\Java_IO\\bufferedout.txt");
			
			InputStreamReader ir = new InputStreamReader(fin, "EUC-KR");
			
			BufferedReader br = new BufferedReader(fr, 2048); //FileReader ==> BufferedReader

			//ReaderŬ������ read�� ���� byte�� �ƴ϶�, ���� char�� �д´�.
			
			int ch;
			while((ch = fr.read()) != -1) {
				//System.out.println((char)ch);
			}
			
			br.close();
			fr.close();
			ir.close();
			fin.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
