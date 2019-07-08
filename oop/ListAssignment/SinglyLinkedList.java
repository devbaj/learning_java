public class SinglyLinkedList
{
  public Node head;

  public SinglyLinkedList()
  {
    this.head = null;
  }

  public void addToBack(int val)
  {
    Node newNode = new Node(val);
    if (head == null)
    {
      head = newNode;
    }
    else
    {
      Node runner = head;
      while (runner.next != null)
      {
        runner = runner.next;
      }
      runner.next = newNode;
    }
  }

  public void remove()
  {
    if (head == null) { System.out.println("No nodes to remove"); }
    else
    {
      Node runner = head;
      while (runner.next.next != null) { runner = runner.next; }
      runner.next = null;
    }
  }

  public void remove(int n)
  {
    if (head == null)
    {
      System.out.println("Cannot remove from an empty list!");
      return;
    }
    Node runner = head;
    int count = 0;
    while (runner.next != null && count < n-1)
    {
      runner = runner.next;
      count++;
    }
    if (count + 1 < n)
    {
      System.out.println("Index out of range");
    }
    else
    {
      runner.next = runner.next.next;
    }


  }

  public void printValues()
  {
    if (head == null) { System.out.println("List is empty"); }
    else
    {
      Node runner = head;
      while (runner != null)
      {
        System.out.println(runner.value);
        runner = runner.next;
      }
    }
  }

  public Node find(int val)
  {
    if (head == null)
    {
      System.out.println("List is empty");
      return null;
    }
    Node runner = head;
    while (runner != null)
    {
      if (runner.value == val) return runner;
      runner = runner.next;
    }
    System.out.println("Value not found");
    return null;
  }
}