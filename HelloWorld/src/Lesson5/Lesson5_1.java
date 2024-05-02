package Lesson5;
import java.util.Scanner;
/**
 * 
 * 第5章 実力問題（クラスの基本）
 * 
 * 商品名、金額と消費税率をフィールドに持つ商品クラスを作成してください。
 * 商品名と金額を入力し、計算結果を出力してください。
 *
 */
class Lesson5_1
{
    String name;
    double price;
    double TAX_RATE = 0.1;
 /**
  * @String name  コマンドの引数　出力される文字列、数値を指定（商品名）
  * @param price  コマンドの引数　出力される文字列、数値を指定（価格）
  * @param getTotalPrice 商品の合計金額（税込み価格）を計算
  * @TAX_RATE 消費税率（10％）
  * @return 対象外の数値を入力するとやり直し
  */
    public Lesson5_1(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    public double getTotalPrice()
    {
        return price + (price * TAX_RATE);
    }
    public static void main(String[] args)
    {
        Scanner scanner =
        		new Scanner(System.in);
        System.out.println("商品名を入力してください:");
        String name = scanner.nextLine();
        double price;
        while (true)
        {
        System.out.println("金額を入力してください。");
        if(scanner.hasNextDouble())
        {
            price = scanner.nextDouble();
            if(price < 0 )
            {
            	System.out.println("0以上の金額を入力してください。");
            	return;
            }
            else
            {
            	break;
            }
        }
        else
        {
        	System.out.println("数値を入力してください。");
        	scanner.next(); // 不正な入力を読み捨てる
        }
        }
        Lesson5_1 product = new Lesson5_1(name, price);
        double totalPrice = product.getTotalPrice();
        System.out.println("購入額: " + totalPrice + "円");
        scanner.close();
    }
}