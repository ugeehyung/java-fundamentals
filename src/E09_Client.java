import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class E09_Client {

	public static void main(String[] args) {
		
		//E08에 접속하는 프로그램
		
		try {
			
			Socket s = new Socket("Localhost", 5648);
			System.out.println("<<<연결 성공>>>");
		
			PrintWriter out = new PrintWriter (new OutputStreamWriter(s.getOutputStream()));
			
			System.out.println("ENTER을 누르면 서버로 메세지를 전송합니다");
			
			out.println("[Client] Hello!");
			out.close();
			s.close();
					
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
