package crypto;

import java.util.Scanner;

public class CryptoMain {

	public static void main(String[] args) {

		Scanner int_sc = new Scanner(System.in);
		Scanner str_sc = new Scanner(System.in);
		System.out.print("key���� �Է��ϼ��� >> ");
		int key = int_sc.nextInt();
		System.out.println("1.Caesar\n2.Transposition");
		System.out.print("���ڸ� �Է��Ͽ� �˰����� ������ >> ");
		int alg = int_sc.nextInt();
		System.out.print("�޼����� �Է��ϼ��� >> ");
		String msg = str_sc.nextLine();

		Cipher cipher = null;
		
		if (alg==1) {
			cipher = new CaesarCipher(key);
		}else if (alg==2){ 
			cipher = new TranspositionCipher(key);
		}else {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
			System.exit(0);
		}
		String result = cipher.CipherEncryption(msg);
		System.out.println(result);
	}
}


