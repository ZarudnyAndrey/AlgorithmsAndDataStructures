package ru.zarudny.algorithms.other;

public class LinkQueue {

  private DoubleSidedList list;

  /**
   * Queue realization on base DoubleSidedList
   */

  public LinkQueue() {
    list = new DoubleSidedList();
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public void insert(long data) {
    list.insertLast(data);
  }

  public long remove() {
    return list.deleteFirst();
  }

  public void displayQueue() {
    System.out.print("Queue (front --> rear): ");
    list.displayList();
  }
}
