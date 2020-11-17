package QUIZ;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class D02_LottoSet {

	public static void main(String[] args) {

		Set<Integer> lotto = new HashSet<>();

		while(true) {			
			Random ran = new Random();
			int num = ran.nextInt(45)+1;
			lotto.add(num);			
			if (lotto.size() == 6) {
				break;				
			}
		}
		System.out.println(lotto);
	}
}
