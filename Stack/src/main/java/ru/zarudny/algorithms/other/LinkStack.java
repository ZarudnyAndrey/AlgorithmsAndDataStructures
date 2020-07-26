package ru.zarudny.algorithms.other;

public class LinkStack {

  private LinkList list;

  /**
   * Stack realization on base LinkedList
   */

  public LinkStack() {
    list = new LinkList();
  }

  public void push(long data) {
    list.insertFirst(data);
  }

  public long pop() {
    return list.deleteFirst();
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public void displayStack() {
    System.out.print("Stack (top --> bottom): ");
    list.displayList();
  }
}
