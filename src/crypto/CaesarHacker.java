package crypto;

public class CaesarHacker {

	//������ȣ ����� �˰��ִ� ������ ���·� ��ȣ���� �̿��Ͽ� ���� ����
	
	static char[] chr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();

	static String hijacked = "uryyPmhJBEyqi";
	
	public static void main(String[] args) {
		
		for(int key=0; key<chr.length; ++key) {
			CaesarCipher cipher = new CaesarCipher(key);
			System.out.println(cipher.CipherDecryption(hijacked));
		}
	}
}
