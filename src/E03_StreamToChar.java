import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class E03_StreamToChar {

	//Reader/Writer가 붙은 클래스 : Stream으로 읽은 데이터를 문자로 변환 	
	//프로그래머가 데이터를 문자로 편하게 다루고 싶을 때
	//InputStream/OutputStream -> Reader/Writer 클래스로 한번 더 감싸서 사용한다. 

	public static void main(String[] args) {

		// ※ abstract class Reader : Reader 상속받아 구현한 클래스들
		// ex. Buffered Reader, InputStreamReader, FileReader 등등...
		//Stream으로 얻은 데이터를 문자로 재구성하여 프로그래머에게 제공한다.
		//코드 데이터를 문자로 재구성할 시, 사용할 charset을 알맞게 설정안하면 깨짐.
		
		try {
			
			FileReader fr = new FileReader("F:\\Java_IO\\bufferedout.txt", Charset.forName("UTF-8"));
			
			FileInputStream fin = new FileInputStream("F:\\Java_IO\\bufferedout.txt");
			
			InputStreamReader ir = new InputStreamReader(fin, "EUC-KR");
			
			BufferedReader br = new BufferedReader(fr, 2048); //FileReader ==> BufferedReader

			//Reader클래스의 read는 다음 byte가 아니라, 다음 char을 읽는다.
			
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
