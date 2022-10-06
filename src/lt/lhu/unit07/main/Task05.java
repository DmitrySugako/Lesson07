package lt.lhu.unit07.main;

import java.util.Arrays;

public class Task05 {

	public static void main(String[] args) {
		int[] mas = { 2, 3, 6, 5, 8, 9, 6, 2, 4, 6 };
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				j++;
			}
		}
		int[] arr = new int[j];
		for (int i = 0, c = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				arr[c++] = mas[i];

			}
		}
		System.out.println(Arrays.toString(mas) + "\n" + Arrays.toString(arr));

	}
}
