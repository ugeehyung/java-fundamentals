package crypto;

public class TranspositionCipher extends Cipher{

	int key;
	public TranspositionCipher(int key){
		this.key = key;
	}

	public int new_key(String plain_text) {

		int new_key;
		char[] src_array = plain_text.toCharArray();
		if (src_array.length % key == 0) {
			new_key = src_array.length/key;
		} else {
			new_key = (src_array.length/key)+1;
		}
		return new_key;
	}

	public String CipherEncryption(String plain_text) {

		char[] src_array = plain_text.toCharArray();
		char[] new_array = new char[src_array.length];

		int j = 0;
		for (int num =0; num < key; ++num) {
			for(int i=0; i<src_array.length; ++i) {
				if(i % key == num) {
					new_array[j] = src_array[i];
					++j;
				}
			} 
		}
		String cryption = new String(new_array);
		return cryption;
	}

	public String CipherDecryption(String crypto_text) {

		char[] src_array = crypto_text.toCharArray();
		char[] new_array = new char[src_array.length];

		int new_key = new_key(crypto_text);
		int blanks = key - src_array.length % key;
		int full = key - blanks;
		int index = new_key * full;
		int j = 0;

		for (int num = 0; num < new_key; ++num) {
			for(int i=0; i<index; ++i) {
				if(i % new_key == num) {
					new_array[j] = src_array[i];
					j++;
				} 
			}
			for(int i=index; i<src_array.length; ++i) {
				if(i % (new_key-1) == num) {
					new_array[j] = src_array[i];
					j++;
				}
			}
		}
		String decryption = new String(new_array);
		return decryption;
	}


	public static void main(String[] args) {

		String crypto =  new TranspositionCipher(8).CipherEncryption("Common sense is not so common.");
		System.out.println(crypto);

		String plain = new TranspositionCipher(8).CipherDecryption(crypto);
		System.out.println(plain);

	}
}

