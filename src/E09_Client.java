import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class E09_Client {

	public static void main(String[] args) {
		
		//E08�� �����ϴ� ���α׷�
		
		try {
			
			Socket s = new Socket("Localhost", 5648);
			System.out.println("<<<���� ����>>>");
		
			PrintWriter out = new PrintWriter (new OutputStreamWriter(s.getOutputStream()));
			
			System.out.println("ENTER�� ������ ������ �޼����� �����մϴ�");
			
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
