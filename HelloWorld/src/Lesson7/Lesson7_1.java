package Lesson7;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *①条件：日付を入力
 *②条件：日付にプラス1カ月した日付を出力
 ※java.time.LocalDateを使用
 */
public class Lesson7_1 {
	/**
	 * @param args コマンド引数　出力される文字列　数値を指定
	 */
	public static void main(String[] args) {
		/** 日付の入力 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("日付を入力してください。（例:yyyy-MM-dd)");
		String inputDateStr = scanner.nextLine();
		/** 日付文字列をLocalDateオブジェクトに格納 */
		 LocalDate inputDate = LocalDate.parse(inputDateStr);
		 /** 入力した日付に1ヶ月後を加える */
		 LocalDate nextMonthDate = inputDate.plusMonths(1);
		 /** 入力されたフォーマット */
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 /** 結果の出力 */
		 System.out.println("入力された日付は、" + inputDate.format(formatter));
		 System.out.println("1ヶ月後の日付は、" + nextMonthDate.format(formatter));
		 /** スキャナーを閉局 */
		 scanner.close();
	}
}