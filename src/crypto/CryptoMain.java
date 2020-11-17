package crypto;

import java.util.Scanner;

public class CryptoMain {

	public static void main(String[] args) {

		Scanner int_sc = new Scanner(System.in);
		Scanner str_sc = new Scanner(System.in);
		System.out.print("key값을 입력하세요 >> ");
		int key = int_sc.nextInt();
		System.out.println("1.Caesar\n2.Transposition");
		System.out.print("숫자를 입력하여 알고리즘을 고르세요 >> ");
		int alg = int_sc.nextInt();
		System.out.print("메세지를 입력하세요 >> ");
		String msg = str_sc.nextLine();

		Cipher cipher = null;
		
		if (alg==1) {
			cipher = new CaesarCipher(key);
		}else if (alg==2){ 
			cipher = new TranspositionCipher(key);
		}else {
			System.out.println("잘못된 번호입니다.");
			System.exit(0);
		}
		String result = cipher.CipherEncryption(msg);
		System.out.println(result);
	}
}


