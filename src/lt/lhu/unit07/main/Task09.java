package lt.lhu.unit07.main;

import java.util.Arrays;

public class Task09 {

	public static void main(String[] args) {
		int[] mas = { 88, 33, 22, 55, 34, 87, 98, 23, 0 };
		int min = mas[0];
		int max = mas[0];
		System.out.println(Arrays.toString(mas));

		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}

		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == min) {
				mas[i] = max;
			} else if (mas[i] == max) {
				mas[i] = min;
			}
		}

		System.out.println(Arrays.toString(mas));
	}
}