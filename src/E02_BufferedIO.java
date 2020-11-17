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

	// ※ Buffered IO : 버퍼를 이용해 읽기/쓰기 성능을 향상시키는 클래스
	// buffer = 데이터를 입/출력하기 전에 임시로 저장해두는 배열

	// ※ 버퍼를 이용해야 하는 이유 : 버퍼없이 읽기/쓰기를 하게 되면 입출력이 너무 자주 일어난다.
	// ex) Java programming을 쓰는 이유:
	//- 기본 OutputStream으로 한 글자씩 쓰면 16번의 출력이 발생한다.
	//- 배열에 저장해놓고 한번에 쓰면 한번의 출력만으로 출력이 끝남.

	public static void main(String[] args) {

		StringBuilder text = new StringBuilder();

		for (int i=0; i<10000; ++i) {
			text.append(i + "\t안녕하세요\n");
		}

		// ※ java.io.BufferedOutputStream
		
		try {

			FileOutputStream fout = new FileOutputStream("F:\\Java_IO\\bufferedout.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);		

			//생성자에 OutputStream을 요구한다.
			//OutputStream은 출력할 장소를 선택하는 용도로 사용
			//BufferedOutputStream은 성능 업그레이드의 용도로 사용
				
			// ※ 버퍼의 크기가 1024인 경우
			//데이터를 해당 OutputStream에 쓸 때 1024바이트의 데이터가 다 모이면 출력한다.
			//혹은 프로그래머가 flush()메서드를 호출할 때 출력한다.
			//혹은 close가 발생하면 여태 모인 데이터를 출력한다.

			//batch processing (일괄처리)
			byte[] data = new String(text).getBytes();

			for (byte b : data) {
				bout.write(b);
			}
			
//			bout.flush();
			bout.close();
			fout.close();

		} catch (FileNotFoundException e) {
			System.err.println("파일 에러 발생");
		} catch (IOException e) {
			System.err.println("IO 에러 발생");
		}

		// ※ java.io.BufferedInputStream
		
		try {

			FileInputStream fin = new FileInputStream("F:\\Java_IO\\bufferedout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin,1024);

			//※ read()의 기본 오버로딩 : 한 바이트를 int값으로 읽어온다.
			
			//※ read(byte[]) 오버로딩 : 전달한 byte[]의 크기만큼 byte를 채워준다.
			//전달한 배열에 몇 byte를 채웠는지 반환한다. (len)
			
			//※ read(byte[], off, len) 
			//전달한 byte[] 중에서 off부터 len까지만 데이터를 채워준다.
			//전달한 배열에 몇 byte를 채웠는지 반환한다.
			
			byte[] buff = new byte[1024];
			
			int len;
			int count = 0;
			while ((len = bin.read(buff)) != -1) {
				System.out.println(new String(buff, 0, len));
				System.out.println(count++ +"번째 읽기");
			}

			int b;
			while((b=bin.read())!= -1) {
				System.out.println((char)b);
			}
					
			bin.close();
			fin.close();

		} catch (FileNotFoundException e) {
			System.err.println("파일 에러 발생");
		} catch (IOException e) {
			System.err.println("IO 에러 발생");
		}
		
		// ※ abstract class writer
		//파일에 문자를 저장할 때 charset을 지정할 수 있다.
		//프로그래머가 좀 더 편리하게 OutputStream을 이용할 수 있다.
		
		try {
			
			FileOutputStream fout = new FileOutputStream("F:\\Java_IO\\bufferedout.txt"); 
			
			OutputStreamWriter ow = new OutputStreamWriter(fout, "UTF-8"); //OutputStream => Writer (byte -> char)
			
			FileWriter fw = new FileWriter("F\\Java_IO\\bufferedout.txt", Charset.forName("UTF-8"));
			
			BufferedWriter bw = new BufferedWriter(ow, 4096); //성능향상
			
			PrintWriter pw = new PrintWriter(bw); //프로그래머에게 편리한 print메서드 이용

			for (int i = 0; i < 10000; i++) {
				pw.printf("%d월 %d일 %d시 %d분\n안녕하세요\n", 1,2,3,4); //콘솔에 출력하던 것을 파일에 출력할 수 있다.
			}

			pw.close();
			pw.close();
			ow.close();
			fout.close();
			
		} catch (FileNotFoundException e ) {
			System.out.println("파일 에러 발생");
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 에러 발생");
		} catch (IOException e) {
			System.out.println("IO 에러 발생");
		}	
	}
}
