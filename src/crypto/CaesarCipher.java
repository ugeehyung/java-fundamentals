package crypto;

import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher extends Cipher{

	//암호란? 
	//비밀 메세지를 주고받기 위한 것 
	//암호화 (Encryption): 평문(일반메세지)을 암호문(비밀메세지)로 바꾸는 것
	//복호화 (Decryption): 암호문을 평문으로 되돌리는 것
	//키 (key): 암호화와 복호화에 사용되는 비밀값

	//시저(카이사르) 암호
	//알파벳을 키(key)값만큼 오른쪽으로 이동시키는 암호방식
	//암호화: 평문을 키값만큼 오른쪽으로 이동시킨다.
	//복호화: 암호문을 키값만 왼쪽으로 이동시킨다.

	//ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnop...

	//키값이 3인 경우 암호화 (오른쪽으로 3칸 간다 +3) 
	//"Hello, World!" =====암호화=====> "Khoorc#Zruog$";

	//키값이 3인 경우 복호화 (왼쪽으로 3칸 간다 -3)
	//"Khoorc#Zruog$" =====복호화=====> "Hello, World!"

	int key;
	public CaesarCipher(int key){
		this.key = key;
	}

	public char[] chr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();

	public char[] text_array(String text_str) {

		char[] text_array = text_str.toCharArray();
		return text_array;
	}


	public String CipherEncryption(String plain_text) {

		char[] src_array = text_array(plain_text);
		char[] new_array = new char[src_array.length];
		int index = 0;

		for (int i= 0 ; i< src_array.length; ++i) {
			for (int j = 0; j < chr.length; ++j) {
				if (src_array[i] == chr[j]) {
					index = j;
					break;
				}
			}
			new_array[i] = chr[(index+key) % chr.length];
		}
		String CipherEncryption = new String(new_array);
		return CipherEncryption;
	}

	public String CipherDecryption(String crypto_text) {

		char[] src_array = text_array(crypto_text);
		char[] new_array = new char[src_array.length];

		for (int i= 0 ; i< src_array.length; ++i) {
			int index = 0;
			for (int j = 0; j < chr.length; ++j) {
				if (src_array[i] == chr[j]) {
					index = j;
					break;
				}
			}
			if ((index-key)>0) {
				new_array[i] = chr[index-key];
			} else if ((index-key)<0) {
				new_array[i] = chr[chr.length-Math.abs(index-key)+1];
			} else {
				src_array = new_array;
			}
		}

		String CipherDecryption = new String(new_array);
		return CipherDecryption;
	}

	public static void main(String[] args) {

		String crypto =  new CaesarCipher(2).CipherEncryption("Common sense is not so common.");
		System.out.println(crypto);

		String plain = new CaesarCipher(2).CipherDecryption(crypto);
		System.out.println(plain);
	}
}
