
public class B14_Array2 {

	public static void main(String[] args) {
		
		//�迭 �ȿ��� �迭�� ���� �� �ִ�.
		
		String str = null; //������ ���� Ÿ�Կ� null�� �� �� �ִ�.
		int[] a = null; // �迭������ ���� �����ϴ� ���� �ƴ϶� �迭�� �����ּҸ� �����Ѵ�.
		//��, �迭�� ������ ���� Ÿ���̴�.
		
		System.out.println(str);
		System.out.println(a);
		
		int[] scores = new int[10];
		int[][] arr2 = {
				new int [3], //����ִ� 5��¥�� int[] �迭
				null, //���� �迭�� ����
				{1,2,3,4,5,6},
				new int[] {1,2,3},
				scores //����ִ� 10��¥�� int[] �迭
		};

		arr2[0] = new int [5];
		arr2[1] = null;
		
		System.out.println(arr2.length + " = arr2([][])�� ����� �迭 ����");
		System.out.println(arr2[0].length + " = arr2[0]�� ����");
		//System.out.println(arr2[1].length); ���� null�̾ ���̰� ����
		System.out.println(arr2[2].length+ " = arr2[2]�� ����");
		System.out.println(arr2[3].length+ " = arr2[3]�� ����");
		System.out.println(arr2[4].length+ " = arr2[4]�� ����\n");
		
		//���̸� Ȱ���Ͽ� n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�.
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
		
		//Ȱ�� ��
		int [][] scores2 = {
				{80, 90, 100}, 
				{50, 60, 70}, 
				{80, 70, 90}, 
				{40, 100, 80}
		};
	//1. ���׶��
	//2. �׸�
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
					System.out.print("��");
					break;
				case 2 :
					System.out.print("��");
					break;
				case 3 :
					System.out.print("��");
					break;
				}
			}
			System.out.println();
		}
	}
}
