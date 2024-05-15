package Lesson5;
import java.util.Scanner;

/**
 * 実力確認問題　5.クラスの基本
 * 商品名、金額と消費税率をフィールドに持つ商品クラスを作成してください。
 * 商品名と金額を入力し、計算結果を出力してください。
 */
public class Lesson5_1 {
	/** 商品名 */
	String name;
	/** 価格 */
	double price;
	/** 消費税率（10％） */
	double TAX_RATE = 0.1;
	/**
	 * @param name
	 * @param price
	 */
	public Lesson5_1(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public double getTotalPrice() {
		return price + (price * TAX_RATE);
	}
	/**
	 * @param args コマンドの引数　出力される文字列 数値を指定
	 */
	public static void main(String[] args) {
		Scanner scanner =
        		new Scanner(System.in);
		System.out.println("商品名を入力してください:");
		String name = scanner.nextLine();
		double price;
		while (true) {
			System.out.println("金額を入力してください。");
			if(scanner.hasNextDouble()) {
        		price = scanner.nextDouble();
        		if(price >= 0 ) {
        			break;
        		} else {
        			System.out.println("0以上の金額を入力してください。");
        		}
        	} else {
        		System.out.println("数値を入力してください。");
        	}
        }
        Lesson5_1 product = new Lesson5_1(name, price);
        double totalPrice = product.getTotalPrice();
        System.out.println("購入額: " + totalPrice + "円");
        scanner.close();
    }
}
