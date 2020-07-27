package study;
// ① TaskクラスにCalculatorクラスを継承させなさい。
    /**
     * タスクの実行
     */
public class Task extends Calculator{
    public void doTask() {
        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    	Calculator calculator = new Calculator();
    	System.out.println("plusメソッドの引数が一つの場合:" + calculator.plus(10));
    	System.out.println("plusメソッドの引数が二つの場合:" + calculator.plus(15,15));
    	System.out.println("plusメソッドの引数が三つの場合:" + calculator.plus(20,20,20));
    }
}