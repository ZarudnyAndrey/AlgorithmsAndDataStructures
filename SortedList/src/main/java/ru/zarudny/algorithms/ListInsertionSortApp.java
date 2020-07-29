package ru.zarudny.algorithms;

import java.util.Random;

public class ListInsertionSortApp {

  public static void main(String[] args) {
    int size = 10;

    Link[] linkArray = new Link[size];

    Random random = new Random();

    for (int i = 0; i < size; i++) {
      int n = random.nextInt(100);
      Link newLink = new Link(n);
      linkArray[i] = newLink;
    }

    System.out.print("Unsorted array: ");
    for (int i = 0; i < size; i++) {
      System.out.print(linkArray[i].dData + " ");
    }
    System.out.println();

    SortedList sortedList = new SortedList(linkArray);

    for (int i = 0; i < size; i++) {
      linkArray[i] = sortedList.remove();
    }

    System.out.print("Sorted array: ");
    for (int i = 0; i < size; i++) {
      System.out.print(linkArray[i].dData + " ");
    }
    System.out.println();
  }
}
