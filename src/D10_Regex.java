import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {

	//Á¤±Ô Ç¥Çö½Ä (regex = Regular Expression)
	//¹®ÀÚ¿­ÀÌ Çü½Ä/ÆĞÅÏÀ» Ç¥ÇöÇÏ´Â ¹æ½Ä (ÇØ´ç ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´Â ¹®ÀÚ¿­À» °Ë»öÇÒ ¼ö ÀÖ´Ù.)
	
	public static void main(String[] args) {
		
//		String str = "abc@naver.com";
//		if(str.contains("@") && str.contains(".")) {
//			System.out.println("ÀÌ¸ŞÀÏÀÔ´Ï´Ù");	
//		}else {
//			System.out.println("ÀÌ¸ŞÀÏÀÌ ¾Æ´Õ´Ï´Ù");
//		}
		
		//Matcher Å¬·¡½º (true/false) regex
		//Pattern.matches("²À µé¾î°¡¾ßÇÏ´Â ¹®ÀÚ", "sleep")
		//[]³»ºÎ¿¡´Â ±× À§Ä¡¿¡ ¾î¶² ¹®ÀÚ°¡ ¿Ã ¼ö ÀÖ´ÂÁö ³ªÅ¸³¿. 
		
		//ex.
		System.out.println(Pattern.matches("sleep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep")); 
		//-> lµµ ¿Íµµ µÇ°í hµµ ¿Íµµ µÊ.
			
		//¡Ø []³»ºÎ¿¡ Á¤ÀÇ
		//1. abc: abc¸¸ Çã¿ë <->  ^abc: abc¸¦ Á¦¿ÜÇÑ ¸ğµÎ Çã¿ë
		//2. a-z°¡-ÆR: aºÎÅÍ z±îÁö,°¡-ÆR Çã¿ë <->  ^1-9: 1~9¸¸ »©°í ´Ù.
		//3. a-zA-Z: a~z, A~Z
		//4. ±³ÁıÇÕ a-c && c-f : c¸¸ 	
		
		//¡Ø ¿©·¯ ¹®ÀÚ¸¦ °£´ÜÇÏ°Ô Ç¥Çö
		//1. . : ¸ğµç ¹®ÀÚ Çã¿ë => []¹Û¿¡ ½á¾ßÇÔ!(¿¹¿Ü)
		System.out.println(Pattern.matches(".....", "abcde"));
		//2. \\d: ¸ğµç ¼ıÀÚ Çã¿ë
		//3. \\D: ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç ¹®ÀÚ Çã¿ë
		//4. \\s: °ø¹é Çã¿ë [\t\n...µîÀÇ ¸ğµç °ø¹éµé]
		//5. \\S: °ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç ¹®ÀÚ Çã¿ë
		//6. \\w: ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Çã¿ë [a-zA-Z_0-9]
		//7. \\W: ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Á¦¿Ü [a-zA-Z_0-9]
		
		//¡Ø ¹®ÀÚÀÇ °³¼ö¸¦ Á¤ÀÇ (°ø¹éÀÌ ¾ø¾î¾ßÇÔ)
		//1. °³¼ö: {n¹ø}
		//2. ÃÖ¼Ò ÃÖ´ë: {n¹ø ÀÌ»ó,m¹ø ÀÌÇÏ}
		//3. ÃÖ¼Ò: {n¹øÀÌ»ó,}
		//4. a°¡ 0¹øÀÌ³ª 1¹ø: [a]?
		//5. 1¹ø ÀÌ»ó: +
		//6. 0¹øÀÌ³ª ¿©·¯¹ø: *
		
		String email = "abc@gmail.com";
		System.out.println("ÀÌ¸ŞÀÏ ÆĞÅÏ: " + Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email));
			

		//Pattern Å¬·¡½º
		//Á¤±Ô Ç¥Çö½ÄÀ» ´Ù·ç´Â Å¬·¡½º
		//Pattern.compile("²À µé¾î°¡¾ßÇÏ´Â ¹®ÀÚ"); 
		//Àü´ŞÇÑ Á¤±ÔÇ¥Çö½ÄÀ» ÀÌ¿ëÇØ »ı¼ºÇÑ ÀÎ½ºÅÏ½º¸¦ ¹İÈ¯ÇÑ´Ù.
		
		Pattern email_regex = Pattern.compile("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+");
		Pattern split_regex = Pattern.compile("/");
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		
		//»ı¼ºµÈ Pattern ÀÎ½ºÅÏ½º·Î split ÇÏ±â
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		//»ı¼ºµÈ Pattern ÀÎ½ºÅÏ½º·Î matcher »ı¼ºÇÏ±â
		//:¹®ÀÚ¿­À» Ã³À½ºÎÅÍ ³¡±îÁö °Ë»çÇÏ¸é¼­ Á¤±ÔÇ¥Çö½Ä°ú ÀÏÄ¡ÇÏ´Â ÀÎµ¦½º Ã£¾ÆÁÜ
		Matcher matcher = split_regex.matcher("apple/banana/orange/kiwi");	
		while (matcher.find()) {
		System.out.print(matcher.start()+ " to " + matcher.end());
		System.out.println(" Ã£Àº °Í: " + matcher.group());
		}
		
		Matcher fruit_matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		while (fruit_matcher.find()) {
		System.out.print(fruit_matcher.start()+ " to " + fruit_matcher.end());
		System.out.println(" Ã£Àº °Í: " + fruit_matcher.group());
		}
	}
}
