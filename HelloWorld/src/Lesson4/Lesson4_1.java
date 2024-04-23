package Lesson4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 実力確認問題　4.for文
 *保険契約者の情報を出力し、出力の最後に遅延利息が発生している人数を出力する。
 *保険契約者名は、String配列に格納（String[] name)
 *契約金額は、int x配列に格納（int[] x)
 *遅延損害金は、int y配列に格納(int [] y)
 *遅延損害金発生人数は、int z　でcount(int zcount)
 */
class Lesson4_1
{
	/**
	 * メソッドの説明
	 * @param args　コマンドの引数　出力される文字列、数値を指定
	 * ＠String name　任意で入力した文字列を出力
	 * @return 対象外の入力値を入力　元に戻る
	 */
    public static void main(String[] args) throws IOException
    {
        System.out.println("保険契約者を記入してください。");
        BufferedReader br =
        		new BufferedReader(new InputStreamReader(System.in));
        String[] name = {"中村", "田島", "小澤", "大西"}; //保険契約者
        int[] x = {5000, 3000, 4000, 6000}; //契約金額
        int[] y = {2000, 0, 0, 3500}; //遅延損害金
        String inputName = br.readLine();
        boolean found = false; // 契約者が見つかったかどうか
        for (int i = 0; i < 1; i++) {
            if (inputName.equals(name[i])) {
                System.out.println("契約金額は " + x[i] + " 円です。");
                System.out.println("遅延損害金 " + y[i] + " 円です。");
                break;
            } else {
            	System.out.println("対象の契約者名を入力してください。");
            	return;
            }
        }
        // 遅延している人数を表示
        int zcount = 0; //遅延損害金発生人数
        for (int z : y) {
            if (z > 0) {
                zcount++;
            }
        }
        System.out.println("遅延している契約者の数は " + zcount + "人です。");
    }
}