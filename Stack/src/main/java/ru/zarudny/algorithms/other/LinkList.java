package ru.zarudny.algorithms.other;

public class LinkList {

  private Link first;

  public LinkList() {
    first = null;
  }

  public boolean isEmpty() {
    return (first == null);
  }

  public void insertFirst(long data) {
    Link newLink = new Link(data);
    newLink.next = first;
    first = newLink;
  }

  public long deleteFirst() {
    Link temp = first;
    first = first.next;
    return temp.dData;
  }

  public void displayList() {
    Link current = first;
    while (current != null) {
      current.displayLink();
      current = current.next;
    }
    System.out.println("");
  }
}
