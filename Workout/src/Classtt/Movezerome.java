package Classtt;

public class Movezerome {

	public static void main(String[] args) {
		int ary[] = { 1, 0, 2, 0, 3, 0 };
		MoveZeros(ary);
		for (int num : ary) {
			System.err.println(num + " ");
		}

	}

	private static void MoveZeros(int[] ary) {

		int check = 0;

		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != 0) {
				int nonzero = ary[check];
				ary[check] = ary[i];
				ary[i] = nonzero;
				check++;

			}

		}
	}

}
