package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 実力確認問題　3.for文
 * 
 *商品/単価/支払金額を3回入力し、支払金額の不足有無を出力。
 *最後に不足の合計を出力。
 *入力値はString配列に格納し、数値の計算はStringから変換を実施。
 */

class Lesson4_2 {
	/**
	 * メソッドの説明
	 * @param args　コマンドの引数　出力される文字列、数値を指定
	 * ＠String name　商品名を格納する配列
	 * ＠int[] x 単価を格納する配列
	 * ＠int[] y 支払金額を格納する配列
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String[] name = new String[3]; // 商品名を格納する配列
		int[] x = new int[3]; // 単価を格納する配列
		int[] y = new int[3]; // 支払金額を格納する配列
		
		for (int i = 0; i < 3; i++) { //3回繰り返す
			System.out.println("商品を入力してください。");
			name[i] = br.readLine(); // 商品名を配列に格納
			
			System.out.println("単価を入力してください。");
			String str1 = br.readLine();
			x[i] = Integer.parseInt(str1); // 単価を配列に格納
			
			System.out.println("支払金額を入力してください。");
			String str2 = br.readLine();
			y[i] = Integer.parseInt(str2); // 支払金額を配列に格納
		}
		
		int totalShortage = 0; // 全体の支払金額を初期化
		
		for (int i = 0; i < 3; i++) {
			int shortage = x[i] - y[i]; // 支払金不足額を算出
			
			if (shortage < 0) {
				System.out.println(name[i] + "、支払金過不足なし");
			} else {
				System.out.println(name[i] + "、" + shortage + "支払金額不足");
			}
			totalShortage += shortage;
			}
			System.out.println("全体の不足金：" + totalShortage);
	}
}
