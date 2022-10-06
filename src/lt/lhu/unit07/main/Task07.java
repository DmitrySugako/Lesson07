package lt.lhu.unit07.main;

import java.util.Arrays;

public class Task07 {

	public static void main(String[] args) {
		int[] mas = { 222, 4564, 53, 9345, 345, 4334, 2333, 545, 634, 43, 945, 43 };
		int k = 150, count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > k) {
				mas[i] = k;
				count++;
			}

		}
		System.out.println(Arrays.toString(mas));
		System.out.println("count= " + count);
	}
}