import java.util.Arrays;

public class B13_Array {

	public static void main(String[] args) {

		//�迭: ���� Ÿ���� ������ �ѹ��� ������ �����ϴ� ���

		//�ε����� Ȱ���� �ش� ��°�� ���� ������ �� �ִ�. �ݺ����� Ȱ���ϸ� �ſ� ����.
		//�ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����.
		//�ʱ�ȭ�� �ڵ����� �Ǿ��ִ�. ����:0, �Ǽ�:0.0, boolean:false, ������:null

		int[] a = new int[100]; //���� 100���� ���� ����� ��� : 0���� 99����
		//            ���ε��� ����!!!!!!!!! �ε��� �ƴ�!!!!!!!!!!!!!!
		//a[�ε���] : ���� 4byte �� 400byte
		a[0] = 10; //int�� �����ϴ�.
		a[1] = 55;
		a[99] = 999;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[99]);
		System.out.println(a[15]); //0�� �̹� ������.

		String[] fruits = new String[10];
		System.out.println(fruits[3]); //���� ���� ����. null

		//�迭 ����

		//1. Ÿ��[] �迭�̸� = new Ÿ��[�迭ũ��];
		//2. Ÿ��[] �迭�̸� = {��1, ��2, ...};
		String[] colors = {"red", "blue", "pink"};
		System.out.println(colors[2]);
		//3. Ÿ��[] �迭�̸� = new Ÿ��[] {��1, ��2, ��3, ...};
		double[] scores = new double[] {7.7, 6.6, 5.5, 4.4, 3, 'A', 123.123f, 300000000L};
		System.out.println(scores[7]);
		System.out.println(scores[5]);
		boolean[] test = new boolean[] { true, false, true, false};
		System.out.println(test[3]);

		//Arrays.toString(arr) : ���޹��� �迭�� �������� ���ڿ��� ��ȯ�Ѵ�.
		System.out.println(Arrays.toString(colors));
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(test));

		//�迭�� �ݺ���
		System.out.println("colors �迭 ũ��: " + colors.length);
		for (int index = 0; index < colors.length; ++index) {
			System.out.printf("%d��° ����: %s\n", index, colors[index]);
		}

		//String�� char�� �迭�� ��ȯ�ϱ�
		String msg = "hello, world!";

		char[] msgArr = msg.toCharArray();
		for(int i=0; i<msgArr.length; ++i) {
			System.out.print(msgArr[i]);
		}
	}
}
