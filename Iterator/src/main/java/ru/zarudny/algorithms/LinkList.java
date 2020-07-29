package ru.zarudny.algorithms;

public class LinkList {

  private Link first;

  public LinkList() {
    first = null;
  }

  public Link getFirst() {
    return first;
  }

  public void setFirst(Link f) {
    first = f;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public LinkListIterator getIterator() {
    return new LinkListIterator(this);
  }

  public void displayList() {
    Link current = first;
    while (current != null) {
      current.displayLink();
      current = current.next;
    }
    System.out.println();
  }
}
