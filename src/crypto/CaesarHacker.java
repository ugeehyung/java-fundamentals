package crypto;

public class CaesarHacker {

	//시저암호 방식을 알고있는 가정한 상태로 암호문을 이용하여 평문을 추출
	
	static char[] chr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();

	static String hijacked = "uryyPmhJBEyqi";
	
	public static void main(String[] args) {
		
		for(int key=0; key<chr.length; ++key) {
			CaesarCipher cipher = new CaesarCipher(key);
			System.out.println(cipher.CipherDecryption(hijacked));
		}
	}
}
