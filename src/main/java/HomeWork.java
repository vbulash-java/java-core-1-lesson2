public class HomeWork {

	public static void main(String[] args) {
		HomeWork homeWork = new HomeWork();
		// Задание 1
		System.out.println(homeWork.checkSum(10, 5));
		// Задание 2
		System.out.println(homeWork.isPositive(-1) ? "Положительное число" : "Отрицательное число");
		// Задание 3
		// Метод из задания 2
		boolean positive = homeWork.isPositive(-24);
		System.out.printf("%b\n%n", positive);
		// Задание 4
		homeWork.repeatString("Домашнее-задание", 5);
		// Задание 5
		System.out.println();	// иначе сольётся с предыдущим заданием
		int year = 1900;
		String leapMessage = homeWork.isLeapYear(year) ? "Високосный" : "Невисокосный";
		System.out.println(leapMessage + " год");
	}

	private boolean checkSum(int a, int b) {
		int c = a + b;
		return c >= 10 && c <= 20;
	}

	private boolean isPositive(int a) {
		return a >= 0;
	}

	private void repeatString(String source, int count) {
		int i = 0;
		while (i++ < count) {
			System.out.print(source + " ");
		}
	}

	private boolean isLeapYear(int year) {
		if (year % 4 != 0) return false;
		return true;
	}
}
