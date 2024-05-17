package Lesson7;

import java.util.Scanner;

/**
 *①条件：小数点を含む数値を入力
 *②条件：入力した数値を小数点第一位で四捨五入
 *出力例）
 *4.6
 *四捨五入した値は5
 */
public class Lesson7_3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("小数点を含む数値を入力してください。")	;
		double inputNumber = scanner.nextDouble();
		/** 小数点代位一位で四捨五入 */
		long roundedNumber = Math.round(inputNumber * 10) / 10;
		/** 結果を出力 */
		System.out.println("四捨五入の数値は、" + roundedNumber);
		/** スキャナーを閉局 */
		scanner.close();
	}
}