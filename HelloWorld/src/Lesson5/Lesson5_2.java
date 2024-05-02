package Lesson5;
/**
 * 第5章 実力問題（クラスの基本）
 * 演算子（+、-、*、/）と計算値のフィールドを持つ計算クラスを作成してください。
 * 演算子と計算値を入力し、計算結果を出力してください。
 */
import java.util.Scanner;
class Lesson5_2
{
	/**
	 * @parm num コマンドの引数　出力される文字列、数値を指定
	 * @String Z num1とnum2 の計算結果
	 * @return 対象外の数値を入力するとやり直し
	 */
	public static void main(String[] args)
	{
		Scanner scanner =
				new Scanner(System.in);	
		System.out.println("1つ目の数値を入力してください。");
		double num1 = scanner.nextDouble();
		System.out.println("2つ目の数値を入力してください。");
		double num2 = scanner.nextDouble();
		System .out .println("演算子を入力してください。");
		String x = scanner.next();
		keisann shiki = new keisann(num1,num2,x);
		shiki.x();
	}
}
class keisann
{
	/**
	 * @parm num コマンドの引数　出力される文字列、数値を指定
	 * @String Z num1とnum2 の計算結果
	 * @return 対象外の数値を入力するとやり直し
	 */
	double num1;
	double num2;
	String x;
	public keisann(double num1, double num2, String x)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.x = x;
	}
	public void x()
	{
		double Z = 0.0;
		switch(x)
		{
		case "+":
			Z = num1 + num2;
			break;
		case "-":
			Z = num1 - num2;
			break;
		case "*":
			Z = num1 * num2;
			break;
		case "/":
			Z = num1 / num2;
			if(num2 != 0)
			{
				Z = num1 / num2;
			}
			else
			{
				System.out.println("入力した数値は割り切れません。");
			}
			break;
		default:
            System.out.println("無効な演算子です。");
		}
		System.out.println("計算結果:" + Z);
	}
}
