public class C12_TryCatch {

	//예외처리 : 에러라고 알고 있던 빨간 글씨들. (※문법적으로 틀린 것은 예외가 아니라 에러이다.)
	//프로그래머가 예외에 대한 적절한 조치를 취해준다면 프로그램을 강제종료하지 않고 계속 진행. 
	
	//try : 예외가 발생할 것 같은 코드를 try문 내부에 포함시킨다.
	//catch : try문 내부 코드에서 예외가 발생하면 해당 catch문으로 이동. 여러개 사용 가능.
	//첫번째 매개변수로 해당 예외에 관한 정보를 담고있는 객체를 받는다.
	//예외가 발생하지 않으면 모두 정상 실행. 예외가 발생한다면, catch문으로 넘어감. 
	//finally : try문 내부의 예외 발생여부와 관계없이 무조건!! 실행되는 영역. (return있어도)

	public static void main(String[] args) {
		
		int[] abc = new int[10];

		try {
			
			System.out.println("try문의 시작");
			System.out.println(abc[10]);
			System.out.println(Integer.parseInt("abc")); //문자열을 int타입으로 변환하는 메소드
			System.out.printf("%d", "abc");
			System.out.println("try문의 끝"); //실행 안됨.
			
		} catch (Exception e) { //Exception 타입의 catch문은 모든 예외를 catch
//		} catch (ArrayIndexOutOfBoundsException e) {
//		} catch (NumberFormatException e) {
//		} catch (IllegalFormatConversionException e) {
//			System.out.println("catch문 실행: " + e.getMessage());
//			e.printStackTrace();
//			System.exit(0);
//		}
		} finally {
			System.out.println(" /)/)");
			System.out.println("(..  )");
			System.out.println("☆<  )");
		}
		
		System.out.println("여기까지 잘 실행되었습니다");
	}
}
