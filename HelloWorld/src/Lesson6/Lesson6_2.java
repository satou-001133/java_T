package Lesson6;
import java.util.ArrayList;
import java.util.List;

/**
 * 実力問題 6.クラスの機能
 * ①条件：インスタンス変数にはprivateを指定してください。
 * ②条件：コンストラクタで初期化可能としてください。
 * ③条件：名前、年齢、住所、電話番号はインスタンス変数の値を出力してください。
 * ④条件：年齢はStringでもintでも設定可能なSetterを用意してください。
 * ⑤条件：インスタンスは複数newし、Listをループして出力してください。
 * 出力例）
 * 私の名前は山田です。年齢は26歳です。住所は東京大田区大森です。電話番号は090-0000-0000です。
 * 私の名前は鈴木です。年齢は33歳です。住所は和歌山県和歌山市です。電話番号は090-1111-2222です。
 * 私の名前は田中です。年齢は41歳です。住所は宮城県仙台市です。電話番号は090-3333-4444です。
 */
public class Lesson6_2 {
	/** 名前 */
	private String name; 
	/** 年齢 */
	private int age; 
	/** 住所 */
	private String address; 
	/** 電話番号 */
	private String phoneNumber; 
	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param phoneNumber
	 */
	public Lesson6_2(String name, int age, String address, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public void printInformation() {
		System.out.println("私の名前は" + name + "です。年齢" + age + "です。住所は" + address + "です。電話番号は" + phoneNumber + "です。");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Lesson6_2> human = new ArrayList<>(); //「名前・年齢・住所・電話番号」をリスト化
		human.add(new Lesson6_2("山田", 26, "東京大田区大森", "090-0000-0000"));
		human.add(new Lesson6_2("鈴木", 33, "和歌山県和歌山市", "090-1111-2222"));
		human.add(new Lesson6_2("田中", 41, "宮城県仙台市", "090-3333-4444"));
		for (Lesson6_2 x : human) {
			x.printInformation();
		}
	}
}