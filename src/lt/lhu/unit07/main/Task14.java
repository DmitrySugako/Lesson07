package lt.lhu.unit07.main;

import java.util.Arrays;
import java.util.Random;

public class Task14 {

	public static void main(String[] args) {
		int[] mas = new int[50];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = ran();
		}
		int max = mas[1];
		int min = mas[0];

		System.out.println(Arrays.toString(mas));
		for (int i = 1; i < mas.length; i = (i * 2) + 1) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}

		for (int i = 0; i < mas.length; i = (i + 1) * 2) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}
		System.out.println("MAX=" + max + "\n" + "MIN=" + min);
	}

	public static int ran() {
		Random rand = new Random();
		int x = rand.nextInt(100);
		return x;
	}
}
