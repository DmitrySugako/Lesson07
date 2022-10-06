package lt.lhu.unit07.main;

public class Task01 {

	public static void main(String[] args) {
		int[] mas = { 15, 25, 36, 25, 15, 45, 78 };
		int k = 5;
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum = sum + mas[i];
				System.out.println(mas[i]);
			}
		}
		System.out.println("sum= " + sum);
	}
}