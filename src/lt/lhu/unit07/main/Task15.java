package lt.lhu.unit07.main;

public class Task15 {

	public static void main(String[] args) {
		int[] mas = { 23, 2, 34, 45, 1, 23, 43, 6, 7, 56, 45 };
		int c = 13;
		int d = 37;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > c & mas[i] < d) {
				System.out.println(mas[i] + "в отрезке от" + c + "до" + d);
			}
		}
	}
}