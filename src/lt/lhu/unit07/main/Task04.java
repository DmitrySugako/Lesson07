package lt.lhu.unit07.main;

public class Task04 {

	public static void main(String[] args) {
		int[] mas = { 1, 2, 3, 4, 6, 7, 9 };
		int count = 0;
		for (int n = mas.length - 1; n > 0; n--) {

			if (mas[n] - mas[n - 1] < 0) {
				count++;
				break;
			}
		}
		if (count != 0) {
			System.out.println("array non-increasing");
		} else {
			System.out.println("array increasing");
		}
	}
}