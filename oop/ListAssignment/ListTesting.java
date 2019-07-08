public class ListTesting
{
  public static void main(String[] args)
  {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.addToBack(3);
    sll.addToBack(15);
    sll.addToBack(8);
    sll.addToBack(32);
    sll.addToBack(9);
    sll.addToBack(5);
    sll.addToBack(13);
    sll.addToBack(10);
    sll.addToBack(24);
    sll.addToBack(1);
    SinglyLinkedList emptyList = new SinglyLinkedList();

    sll.printValues();
    emptyList.printValues();
    sll.remove();
    sll.remove();
    emptyList.remove();
    System.out.println("Removed 2 values");
    sll.printValues();
    System.out.println(sll.find(1));
    System.out.println(emptyList.find(0));
    sll.remove(1);
    sll.printValues();
    emptyList.remove(2);
  }
}