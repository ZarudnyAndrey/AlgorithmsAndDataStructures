package ru.zarudny.algorithms;

public class SortedList {

  private Link first;

  public SortedList(Link[] linkArray) {
    first = null;
    for (int i = 0; i < linkArray.length; i++) {
      insert(linkArray[i]);
    }
  }

  public boolean isEmpty() {
    return (first == null);
  }

  public void insert(Link key) {
//    Link newLink = new Link(key);
    Link previous = null;
    Link current = first;

    while (current != null && key.dData > current.dData) {
      previous = current;
      current = current.next;
    }

    if (previous == null) {
      first = key;
    } else {
      previous.next = key;
    }
    key.next = current;
  }

  public Link remove() {
    Link temp = first;
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
    System.out.println("");
  }
}
