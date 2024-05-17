package Lesson7;

import java.util.Scanner;

/**
 *①条件：カンマ区切りの文字列を入力
 *②条件：カンマを除いた文字列で一つづつ出力
 *出力例）
 *リンゴ,ミカン,バナナ,ナシ
 *くだものを表示します。
 *リンゴ
 *ミカン
 *バナナ
 *ナシ
 */
public class Lesson7_4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("カンマ区切りの文字列を入力してください。");
		String inputString = scanner.nextLine();
		
		/** カンマ区切りの文字列 */
		  // カンマで分割して一つずつ出力
        String[] fruits = inputString.split(",");
        System.out.println("くだものを表示します。");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
		scanner.close();
	}
}