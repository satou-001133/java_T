package Lesson7;

import java.util.Scanner;

/**
 *①条件：空白を含めた文字を入力
 *②条件：空白を省いて文字を出力
 *出力例） aaa bb ccc
 *空白を省いた文字は「aaabbccc」
 */
public class Lesson7_2 {
	/**
	 * @param args　コマンド引数　出力される文字列　数値を指定
	 */
	public static void main(String[] args) {
		/** ユーザーから文字列を入力 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("空白を含めた文字を入力してください。");
		String inputString = scanner.nextLine();
		/** 空白を省いて文字列を出力 */
		String outputString = inputString.replaceAll("[\\s　]", "");
		/** 結果の出力 */
		System.out.println("空白を含めた文字：" + inputString);
		System.out.println("空白を省いた文字：" + outputString);
		/** スキャナーを閉局 */
		scanner.close();
	}
}