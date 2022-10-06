package lt.lhu.unit07.main;

public class Task08 {

	public static void main(String[] args) {
		int[] mas = { 0, 0, 0, -3, 9, 4, 2, -9, -7, 4, 0, 0, -5 };
		int zero = 0;
		int minus = 0;
		int plus = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				zero++;
			} else if (mas[i] > 0) {
				plus++;
			} else if (mas[i] < 0) {
				minus++;
			}
		}
		System.out.println("zero= " + zero + "\n" + "minus= " + minus + "\n" + "plus= " + plus);

	}
}