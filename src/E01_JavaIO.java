import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E01_JavaIO {

	// ※ Java I/O (Input and Output) => Java IO 클래스들은 필수적으로 처리해야하는 예외가 존재한다.
	//자바는 '스트림(Stream)'을 이용해 입출력을 다룬다.
	//우리 프로그램으로 들어오는 모든 데이터 : 입력(Input)
	//프로그램이 연산해서 내보내는 모든 데이터 : 출력(Output)

	// ※ Stream = 데이터들이 오가는 통로 (입력 통로: InputStream, 출력 통로: OutputStream)
	//데이터가 stream을 통해 이동할 때는 데이터를 0과 1로 변환하여 전송한다.
	
	// ※ InputStream 클래스의 공통 메서드
	// int read() : 다음 한 바이트 읽어온다. EOF(End Of File)에 도달하면 -1을 반환
	// int read(byte[])
	// int read(byte[], off, len) 
	// close() : 스트림을 닫는다 (메모리 해제)
	// -> FileInputStream : 파일로 입력 InputStream

	// ※ OutputStream 클래스의 공통 메서드
	// write(int)
	// write(byte[])
	// flush : 모아놨던 데이터를 전송한다.
	// close : 스트림을 폐기한다 (닫는다, 메모리 해제).
	// -> FileOutputStream : 파일 출력 OutputStream
	
	// ※ FileInputStream, FileOutputStream은 데이터를 코드로 읽어오기 때문에 
	// 프로그래머가 원래 형태로 재조립하는 과정이 필요하다.

	public static void main(String[] args) {

		try {
 
			FileOutputStream fout = new FileOutputStream("F:\\Java_IO\\testout.txt");

			//1. int 
			fout.write(65);

			//2. byte[] 
			byte[] data = "ABCDEFGHIJKLMNOP".getBytes();
			fout.write(data);
			fout.close(); // Java IO의 스트림들은 메모리를 gc가 수거하지 않음. 다 쓴 스트림은 반드시 잡아주어야 한다! 

		} catch (FileNotFoundException e) {
			System.err.println("파일을 못찾았습니다.");
		} catch (IOException e) {
			System.err.println("쓰다가 뭔가 에러 발생");
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

			while ((ch = fin.read())!= -1) { //(ch = fin.read()) = -1이 되면 다 읽었음
				bytes[index++] = (byte)ch;
			}
			
			System.out.println("byte[]에 저장된 값들: " + Arrays.toString(bytes));
			System.out.println(new String(bytes));
			fin.close();

		} catch (FileNotFoundException e) {
			System.err.println("파일을 못찾았습니다.");
		} catch (IOException e) {
			System.err.println("읽다가 뭔가 에러 발생");
		}	
	}
}
