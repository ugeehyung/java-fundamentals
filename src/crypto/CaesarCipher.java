package crypto;

import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher extends Cipher{

	//��ȣ��? 
	//��� �޼����� �ְ�ޱ� ���� �� 
	//��ȣȭ (Encryption): ��(�Ϲݸ޼���)�� ��ȣ��(��и޼���)�� �ٲٴ� ��
	//��ȣȭ (Decryption): ��ȣ���� ������ �ǵ����� ��
	//Ű (key): ��ȣȭ�� ��ȣȭ�� ���Ǵ� ��а�

	//����(ī�̻縣) ��ȣ
	//���ĺ��� Ű(key)����ŭ ���������� �̵���Ű�� ��ȣ���
	//��ȣȭ: ���� Ű����ŭ ���������� �̵���Ų��.
	//��ȣȭ: ��ȣ���� Ű���� �������� �̵���Ų��.

	//ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnop...

	//Ű���� 3�� ��� ��ȣȭ (���������� 3ĭ ���� +3) 
	//"Hello, World!" =====��ȣȭ=====> "Khoorc#Zruog$";

	//Ű���� 3�� ��� ��ȣȭ (�������� 3ĭ ���� -3)
	//"Khoorc#Zruog$" =====��ȣȭ=====> "Hello, World!"

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
