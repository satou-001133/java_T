package Lesson4;

/**
 * 実力確認問題　4.for文
 * 契約者の情報を出力し、出力の最後に遅延利息が発生している人数を出力。
 * 契約者名は、String配列に格納（String[] name)
 * 保険料は、int x配列に格納（int[] x)
 * 遅延利息金は、int y配列に格納(int [] y)
 * 遅延利息金発生人数は、int z　でcount(int zcount)
 */
class Lesson4_1 {
	/**
	 * @param args　コマンドの引数　出力される文字列、数値を指定
	 */
    public static void main(String[] args) {
    	/** 保険契約者 */
        String[] name = {"中村", "田島", "小澤", "大西"};
        /** 契約金額 */
        int[] x = {5000, 3000, 4000, 6000}; 
        /** 遅延利息金 */
        int[] y = {2000, 0, 0, 3500}; 
        /** 遅延利息金発生人数をカウント */
        int delayedInterestCount = 0;
        for (int i = 0; i < name.length; i++) {
            System.out.print("契約者名:" + name[i] + "、保険料:" + x[i] + "円");
            if (y[i] > 0) {
                System.out.println("、遅延利息金" + y[i] + "円");
                delayedInterestCount++;
            }
        }
        System.out.println("遅延利息金が発生している人数は" + delayedInterestCount + "人です。");
    }
}