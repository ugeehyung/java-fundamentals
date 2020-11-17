package QUIZ;

import java.util.Arrays;

public class B14_Array2Quiz_Q {

	public static void main(String[] args) {

		int[][] numArr = {
				{10, 10, 10, 10},
				{90, 50, 30, 70},
				{800, 500},
				{300, 300, 300}
		};

		int sum = 0;
		int sum2 = 0;
		int count = 0;
		int[] colSum = new int[4];

		for(int i =0; i<numArr.length; ++i) {
			for(int j=0; j < numArr[i].length ; ++j) {
				sum += numArr[i][j];				
				count++;
				sum2 += numArr[i][j];
				colSum[j] += numArr[i][j];
			}
			System.out.println(i + "ÇàÀÇ ÃÑÇÕ = " + sum2);
			sum2 = 0;
		}	
		System.out.println();
		for (int i=0; i<colSum.length; ++i) {
			System.out.println(i + "¿­ÀÇ ÃÑÇÕ = " + colSum[i]);
		}
		System.out.println("\nnumArrÀÇ ÃÑÇÕ = " + sum);
		System.out.printf("numArrÀÇ Æò±Õ = %.2f" , ((double)sum/count));
	}
}
