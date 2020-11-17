package crypto;

public class TranspositionCipher2 {

	int key;
	public TranspositionCipher2(int key){
		this.key = key;
	}

	public String encryption(String plain) {
		StringBuilder[] builders = getBuilders(key);
		int len=plain.length();

		for(int i=0;i<len;++i) {
			builders[i % key].append(plain.charAt(i));				
		}
		return joinBuilders(builders);
	}

	public String decryption(String crypto) {
		int len = crypto.length();
		int columnsize = len % key > 0 ? len/key+1 : len/key;
		int blanks = columnsize * key - len;
		int full = key - blanks;

		StringBuilder[] builders = getBuilders(columnsize);

		for(int column=0; column<columnsize; ++column) {
			int crypto_index = column;
			for(int row=0; row<key; ++row) {
				builders[column].append(crypto.charAt(crypto_index));
				if(row<full) {
					crypto_index+=columnsize;
				}else {
					crypto_index+=columnsize-1;
				}
				if ((column == columnsize-1 && row == full-1)||crypto_index>=len) {
					break;
				}
			}
		}
		return joinBuilders(builders);
	}


	private String joinBuilders(StringBuilder[] builders) {
		StringBuilder result = new StringBuilder();
		for (StringBuilder builder:builders) {
			result.append(builder);
		}
		return result.toString();
	}

	private StringBuilder[] getBuilders(int columnsize) {
		StringBuilder[] builders = new StringBuilder[columnsize];
		for(int i=0; i<builders.length; ++i) {
			builders[i] = new StringBuilder();
		}
		return builders;
	}


	public static void main(String[] args) {

		String crypto =  new TranspositionCipher2(8).encryption("Common sense is not so common.");
		System.out.println(crypto);

		String plain = new TranspositionCipher2(8).decryption(crypto);
		System.out.println(plain);
	}
}
