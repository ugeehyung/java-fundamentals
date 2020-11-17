
public class B14_Array2 {

	public static void main(String[] args) {
		
		//배열 안에도 배열을 넣을 수 있다.
		
		String str = null; //참조형 변수 타입에 null이 들어갈 수 있다.
		int[] a = null; // 배열변수도 값을 저장하는 것이 아니라 배열의 시작주소를 저장한다.
		//즉, 배열도 참조형 변수 타입이다.
		
		System.out.println(str);
		System.out.println(a);
		
		int[] scores = new int[10];
		int[][] arr2 = {
				new int [3], //비어있는 5개짜리 int[] 배열
				null, //아직 배열이 없음
				{1,2,3,4,5,6},
				new int[] {1,2,3},
				scores //비어있는 10개짜리 int[] 배열
		};

		arr2[0] = new int [5];
		arr2[1] = null;
		
		System.out.println(arr2.length + " = arr2([][])에 저장된 배열 개수");
		System.out.println(arr2[0].length + " = arr2[0]의 길이");
		//System.out.println(arr2[1].length); 아직 null이어서 길이가 없음
		System.out.println(arr2[2].length+ " = arr2[2]의 길이");
		System.out.println(arr2[3].length+ " = arr2[3]의 길이");
		System.out.println(arr2[4].length+ " = arr2[4]의 길이\n");
		
		//길이를 활용하여 n차원 배열은 n중 반복문으로 모두 탐색할 수 있다.
		for (int i=0; i<arr2.length; ++i) {
			int[] arr = arr2[i];
			if (arr != null) {
				for(int j = 0; j<arr.length; ++j) {
					System.out.print(arr2[i][j] + " ");
					//System.out.println(arr[j] + " ");
				}
				System.out.println();
			}else {
				System.out.println("null");
			}
		}
		System.out.println();
		
		//활용 예
		int [][] scores2 = {
				{80, 90, 100}, 
				{50, 60, 70}, 
				{80, 70, 90}, 
				{40, 100, 80}
		};
	//1. 동그라미
	//2. 네모
	//3. x
		int[][] map = {
				{2,3,3,3,3},
				{2,2,2,3,3},
				{2,2,2,1,3,1,1,1,1,1,1},
				{2,2,2,3,3},
				{1,2,2,2,2},
				{2,2,2,2,2},
		};
		for(int i =0; i<map.length; ++i) {
			for(int j=0; j<map[i].length; ++j) {
				switch (map[i][j]) {
				case 1 :
					System.out.print("ㅇ");
					break;
				case 2 :
					System.out.print("ㅅ");
					break;
				case 3 :
					System.out.print("ㅁ");
					break;
				}
			}
			System.out.println();
		}
	}
}
