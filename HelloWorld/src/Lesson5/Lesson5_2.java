package Lesson5;
import java.util.Scanner;

/**
 * 実力確認問題　5.クラスの基本
 * 演算子（+、-、*、/）と計算値のフィールドを持つ計算クラスを作成してください。
 * 演算子と計算値を入力し、計算結果を出力してください。
 */
class Lesson5_2 {
	/**
	 * @param args　コマンドの引数　出力される文字列、数値を指定
	 * @return 対象外の数値を入力するとやり直し
	 */
	public static void main(String[] args) {
		Scanner scanner =
				new Scanner(System.in);
		System.out.println("1つ目の数値を入力してください。");
		double num1 = scanner.nextDouble();
		System.out.println("2つ目の数値を入力してください。");
		double num2 = scanner.nextDouble();
		System .out .println("演算子を入力してください。");
		String operator = scanner.next();
		calculate(num1,num2,operator);
	}
	/*
	 * @param num1　一つ目の数値
	 * @param num2　二つ目の数値
	 * @param operator　演算子
	 */
	public static void calculate(double num1, double num2, String operator) {
		double result = 0.0;
		switch(operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
					if(num2 != 0) {
						result = num1 / num2;
					} else {
						System.out.println("入力した数値は割り切れません。");
					}
					break;
					default:
					System.out.println("無効な演算子です。");
					return;
		}
		System.out.println("計算結果:" + result);
	}
}