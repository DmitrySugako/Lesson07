package lt.lhu.unit07.main;

import java.util.Arrays;
import java.util.Random;

public class Task13 {

	public static void main(String[] args) {
		int m = 2;
		int l = 0;
		int n = ran();
		int count = 0;
		int[] mas = new int[50];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = ran();

		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % m == 0 & mas[i] > l & mas[i] < n) {
				count++;
			}
		}
		System.out.println(Arrays.toString(mas));
		System.out.println(l + "-->interval<--" + n);
		System.out.println("the number of elements is " + count);
	}

	public static int ran() {
		Random rand = new Random();
		int x = rand.nextInt(100);
		return x;
	}
}
