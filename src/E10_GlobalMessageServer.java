import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class E10_GlobalMessageServer {


	public static void main(String[] args) throws IOException {

		ArrayList<Socket> clients = new ArrayList<>();

		//Socket을 key값으로 이용해 OutputStream을 관리한다.
		//개인 메세지를 보낼 때 : Key로 Socket을 전달
		//전체 메세지를 보낼 떄 : 저장된 모든 out에 메세지 전달

		HashMap<Socket, PrintWriter> send_map = new HashMap<>();

		ServerSocket ss = new ServerSocket(5548);

		int count =0;

		while(true) {

			Socket user = ss.accept();

			clients.add(user);
			OutputStreamWriter osw = new OutputStreamWriter(user.getOutputStream());
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);
			send_map.put(user,pw);

			for (PrintWriter out : send_map.values()) {

				out.printf("%s님이 채팅방에 접속하셨습니다.\n", user.getInetAddress());
				out.flush();

			}
			
			if (count++ == 30 ) {
				break;
			}
		}
	}
}


