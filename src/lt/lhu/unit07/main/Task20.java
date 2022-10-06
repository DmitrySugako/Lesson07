package lt.lhu.unit07.main;

import java.util.Arrays;
import java.util.Random;

public class Task20 {

	public static void main(String[] args) {
		int mas[] = new int[50];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = ran();
		}
		System.out.println(Arrays.toString(mas));
		for (int i = 1; i < mas.length; i = i + 2) {
			mas[i] = 0;
		}
		System.out.println(Arrays.toString(mas));
	}

	public static int ran() {
		Random rand = new Random();
		int x = rand.nextInt(100);
		return x;
	}
}
