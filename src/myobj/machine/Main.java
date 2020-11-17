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
			System.out.println("사용하려는 전자기기 선택");
			String selected = str_src.nextLine();
			Electronics e;
			if (selected.toLowerCase().equals("cleaner")) {
				e = new Cleaner("LG청소기", 80);
			} else {
				e = new MicroWave("삼성전자레인지", 70);
			}
			e.setConnect(Battery);
			e.execute();
		}
	}
}
