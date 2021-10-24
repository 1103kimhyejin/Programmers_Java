//직사각형 별찍기 문제

package level_1;

import java.util.Scanner;

public class Test211021 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("가로 길이 입력 : ");
		int n = scanner.nextInt();
		System.out.print("세로 길이 입력 : ");
		int m = scanner.nextInt();

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
