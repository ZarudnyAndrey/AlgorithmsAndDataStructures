package ru.zarudny.algorithms;

public class LinkListIterator {

  private Link current;
  private Link previous;
  private LinkList ourList;

  public LinkListIterator(LinkList list) {
    ourList = list;
    reset();
  }

  public void reset() {
    current = ourList.getFirst();
    previous = null;
  }

  public boolean atEnd() {
    return current.next == null;
  }

  public void nextLink() {
    previous = current;
    current = current.next;
  }

  public Link getCurrent() {
    return current;
  }

  public void insertAfter(long data) {
    Link newLink = new Link(data);
    if (ourList.isEmpty()) {
      ourList.setFirst(newLink);
      current = newLink;
    } else {
      newLink.next = current.next;
      current.next = newLink;
      nextLink();
    }
  }

  public void insertBefore(long data) {
    Link newLink = new Link(data);
    if (previous == null) {
      newLink.next = ourList.getFirst();
      ourList.setFirst(newLink);
      reset();
    } else {
      newLink.next = previous.next;
      previous.next = newLink;
      current = newLink;
    }
  }

  public long deleteCurrent() {
    long value = current.dData;
    if (previous == null) {
      ourList.setFirst(current.next);
      reset();
    } else {
      previous.next = current.next;
      if (atEnd()) {
        reset();
      } else {
        current = current.next;
      }
    }
    return value;
  }
}
