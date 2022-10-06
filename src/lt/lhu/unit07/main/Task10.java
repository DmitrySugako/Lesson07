package lt.lhu.unit07.main;

import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		int[] mas = { 10, 1, 4, -4, 3, -5, 9, -8, 5, 13, 5 };
		System.out.println(Arrays.toString(mas));
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.println(mas[i] + ">" + i);
			}
		}
	}
}