import java.util.Random;
import java.util.Scanner; // ユーザー入力を受け取るためにScannerクラスをインポート
/**
 * 二つのサイコロを振るシンプルなサイコロゲームのアプリケーションです。
 */
public class DiceGame {

    public static void main(String[] args) {
        // Randomクラスのインスタンスを生成して、乱数を扱えるようにします。
        Random randomGenerator = new Random();
        Scanner scanner = new Scanner(System.in);
        
　　　　 System.out.println("What is your name ?");
        String name = scanner.nextLine(); // 入力された名前を読み取ります。
        System.out.println("Hello" + name);
        System.out.println("Rolling dice..."); // 日本語: サイコロを振っています...

        // 1から6までの乱数を生成します (nextInt(6)は0-5の範囲なので+1します)。
        int die1 = randomGenerator.nextInt(6) + 1;
        int die2 = randomGenerator.nextInt(6) + 1;

        // 二つのサイコロの合計値を計算します。
        int totalValue = die1 + die2;

        // 結果を画面に出力します。
        System.out.println("Die 1: " + die1); // 日本語: サイコロ1
        System.out.println("Die 2: " + die2); // 日本語: サイコロ2
        System.out.println("Total value: " + totalValue); // 日本語: 合計値
    }
}
