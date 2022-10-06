package lt.lhu.unit07.main;

import java.util.Arrays;

public class Task6_17 {

	public static void main(String[] args) {
		int[] mas = { 2, 3, 2, 4, 3, 2, 5, 6, 4, 7, 5, 2 };
		int min = mas[0];
		int max = mas[0];
		int count = 0;

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
				count++;
			}
		}
		count = mas.length - count;
		int[] array = new int[count];

		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] != min) {
				array[j++] = mas[i];
			}
		}
		System.out.println(Arrays.toString(mas));
		System.out.println(min + "..interval.." + max);
		System.out.println("min= " + min);
		System.out.println(Arrays.toString(array));

	}
}
