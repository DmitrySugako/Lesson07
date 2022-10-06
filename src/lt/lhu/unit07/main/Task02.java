package lt.lhu.unit07.main;

import java.util.Arrays;

public class Task02 {

	public static void main(String[] args) {
		int[] mas = { 0, 2, 5, 6, 0, 4, 8, 1, 6, 9, 0, 4, 8, 7, 2, 0, 0 };
		int c = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				c++;
			}
		}
		int[] masZero = new int[c];
		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				masZero[j++] = i;
			}
		}
		System.out.println(Arrays.toString(mas));
		System.out.println(Arrays.toString(masZero));

	}

}
