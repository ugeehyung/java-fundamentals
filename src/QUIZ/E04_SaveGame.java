package QUIZ;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class E04_SaveGame {

	//컴퓨터와 진행하는 가위바위보 게임 후 프로그램 종료시 플레이어의 전적을 파일에 저장 + 프로그램 실행시 전적을 불러옴

	public final static String SAVEPATH = "F:\\Java_IO\\game\\save.sav";
	public final static File SAVEDIR = new File("F:\\Java_IO\\game");
	public final static File SAVEFILE = new File(SAVEDIR, "save.sav");
	
	static class Game {

		String player;
		String computer;
		String whowins;
		int gamecount;

		int win;		
		int tie;
		int loose;

		FileInputStream fin = null;
		DataInputStream din = null;
		BufferedInputStream bin = null;
		BufferedReader br = null;

		FileOutputStream fout = null;
		DataOutputStream dout = null;

		public Game(int tie, int win, int loose) throws IOException {

			this.tie = tie;
			this.win = win;
			this.loose = loose;

			File dir = new File("F:\\Java_IO\\game");

			if(!dir.exists()) dir.mkdirs();

			try {

				fin = new FileInputStream(new File(dir, "save.sav"));
				din = new DataInputStream(fin);

				tie = din.readInt();
				win = din.readInt();
				loose = din.readInt();

				fout = new FileOutputStream(new File(dir, "save.sav"));
				dout = new DataOutputStream(fout);

			} catch (FileNotFoundException e) {
				System.out.println("FIRST GAME. NEW FILE MADE");

				try {

					fout = new FileOutputStream(new File(dir, "save.sav"));
					dout = new DataOutputStream(fout);

					dout.writeInt(0); //tie
					dout.writeInt(0); //win
					dout.writeInt(0); //loose

				} catch (IOException e1) {} 

			} catch (IOException e1) {} 

			finally {

				try {
					if (din!=null) din.close();
					if (fin!=null) fin.close();
				} catch (IOException e) {}
			}
			
		}	


		public void print() {
			
			System.out.printf("플레이어의 정보: [%d무 %d승 %d패]",  tie, win, loose);
			
			}

		public void play() throws IOException  {

			br = new BufferedReader(new InputStreamReader(System.in));

			String[] RSP = {"Rock", "Sissors", "Paper"};

			System.out.println("GAME START!");
			// Game g = new Game(0,0,0);

			while(true) {

				int cnum;  int pnum = 0;

				try {
					System.out.print("가위바위보를 선택하세요\n0:Rock 1.Sissors 2.Paper\n>>");
					pnum = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					System.err.println("잘못된 번호입니다.");
				}

				int timer = 300;
				try {
					
					System.out.print("ROCK,"); Thread.sleep(500);
					System.out.print("SISSORS,"); Thread.sleep(500);
					System.out.println("PAPER!"); Thread.sleep(500);

				} catch (InterruptedException e) {}

				System.out.println("PLAYER:" + RSP[pnum]);
				player = RSP[pnum];

				cnum = (int)Math.random()*3;
				System.out.println("COMPUTER:" + RSP[cnum]);
				computer = RSP[cnum];

				if (cnum == pnum) {
					System.out.println("TIE!");
					tie++;
					whowins = "TIE";
				} else if ((pnum + 1) % 3  ==  cnum ) { 
					System.out.println("LOOSE!");
					loose++;
					whowins = "LOOSE";
				} else {
					System.out.println("WIN!");
					win++;
					whowins = "WIN";
				}
				
				gamecount++;	
				print();
				System.out.println();
				try {
					System.out.print("종료하시겠습니까?\n1:예 2:아니오\n>>");
					int num = Integer.parseInt(br.readLine());
					if (num == 1) {
						save();
						System.exit(0); 
					}
				} catch (NumberFormatException e) {
					System.err.println("잘못된 번호입니다.");
				}
			}	
		}

		public void save() {

			try {

				fout = new FileOutputStream(SAVEFILE);
				dout = new DataOutputStream(fout); 

				dout.writeInt(tie);
				dout.writeInt(win);
				dout.writeInt(loose);

				win = 0; loose = 0; tie = 0;

			} catch (FileNotFoundException e ) {
			} catch (IOException e) {
			}	finally {
				try {
					if(dout!=null) dout.close();
					if(fout!=null) fout.close();
				} catch (IOException e) {}
			}
		}


		public static void main(String[] args) throws IOException {

			Game g = new Game(0,0,0);
			g.play();

		}
	}
}

