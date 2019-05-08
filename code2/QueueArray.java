public class QueueArray {
     int length, front, rear;
     int[] queue;

     // 指定された長さの配列を生成するコンストラクタ
     QueueArray(int len) {
    QueueArray a = new QueueArray();
    a.length = len;
    a.front = a
     }

     // データのエンキュー
     void enqueue(int val) {

     }

     // データのデキュー
     int dequeue() { ... }

     // キューの要素の表示
     void display() { ... }

     // main メソッド
     public static void main(String[] args) {
           QueueArray queue = new QueueArray(10);

           queue.enqueue(1);
           queue.enqueue(2);
           queue.display();

           System.out.println(queue.dequeue());
           System.out.println(queue.dequeue());
     }
}
