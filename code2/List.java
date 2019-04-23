// List.java
public class List {
    static List head;
    List next;
    int data;

    // æしいセルのæå（æåäçはセル p のçå）
    static void insert_cell(List p, int d) {
      List new_cell = new List();
      new_cell.data = d;
      new_cell.next = p.next;
      p.next = new_cell;
    }

    // æしいセルのæå（æåäçはリストのåé）
    static void insert_cell_top(int d) {
	List new_cell = new List();
	new_cell.data = d;
	new_cell.next = head;
	head = new_cell;
    }

    // セルのåé（åéされるのはセル p のçåのセル）
    static void delete_cell(List p) {
      List q=p.next;
      p.next=q.next;
    }

    // セルのåé（åéされるのはリストのåéセル）
    static void delete_cell_top() {
        List q=head;
        head=q.next;
    }

    // リストのèçのèç
    static void display() {
      List list= head;
      while(list != null){
        System.out.print(list.data);
        list=list.next;

}
}



    // main メソッド
  public static void main(String[] args) {
	insert_cell_top(1);
	insert_cell(head, 3);
	insert_cell(head, 2);
	display();

	delete_cell(head);
	display();

	delete_cell_top();
	display();
}

}
