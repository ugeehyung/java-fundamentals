package myobj.machine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Generator Battery = new Generator() {

			public void consum(int power) {

			}
		};

		Scanner str_src = new Scanner(System.in);

		while(true) {
			System.out.println("����Ϸ��� ���ڱ�� ����");
			String selected = str_src.nextLine();
			Electronics e;
			if (selected.toLowerCase().equals("cleaner")) {
				e = new Cleaner("LGû�ұ�", 80);
			} else {
				e = new MicroWave("�Ｚ���ڷ�����", 70);
			}
			e.setConnect(Battery);
			e.execute();
		}
	}
}
