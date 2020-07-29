package ru.zarudny.algorithms.other;

public class DoubleSidedList {

  private Link first;
  private Link last;

  public DoubleSidedList() {
    first = null;
    last = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void insertLast(long data) {
    Link newLink = new Link(data);
    if (isEmpty()) {
      first = newLink;
    } else {
      last.next = newLink;
      last = newLink;
    }
  }

  public long deleteFirst() {
    long temp = first.dData;
    if (first.next == null) {
      last = null;
    }
    first = first.next;
    return temp;
  }

  public void displayList() {
    System.out.print("List (first --> last): ");
    Link current = first;
    while (current != null) {
      current.displayLink();
      current = current.next;
    }
    System.out.println();
  }
}
